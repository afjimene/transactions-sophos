package com.sophosbank.transactions.service;

import com.openbank.Transaction;
import com.openbank.Transactions;
import com.sophosbank.transactions.mapper.TransactionMapper;
import com.sophosbank.transactions.model.TransactionSophos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TransactionsService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<List<TransactionSophos>> getTransactions() {
        ResponseEntity<Transactions> responseEntity = restTemplate.exchange(
                "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions",
                HttpMethod.GET, generateAuthHeaders(),
                Transactions.class);

        List<TransactionSophos> transactionSophosList =
            Objects.requireNonNull(responseEntity.getBody()).getTransactions().stream()
                    .map(TransactionMapper.MAPPER::getTransaction)
                    .collect(Collectors.toList());

        return new ResponseEntity<>(transactionSophosList, HttpStatus.OK);
    }

    public ResponseEntity<List<TransactionSophos>> getTransactionsByFilter(
            String transactionType, Double transactionAmount, String counterpartyName) {
        ResponseEntity<Transactions> responseEntity = restTemplate.exchange(
                "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions",
                HttpMethod.GET, generateAuthHeaders(),
                Transactions.class);

        List<TransactionSophos> transactionSophosList =
                Objects.requireNonNull(responseEntity.getBody()).getTransactions().stream()
                        .filter(transactionFilter(transactionType, transactionAmount, counterpartyName))
                        .map(TransactionMapper.MAPPER::getTransaction)
                        .collect(Collectors.toList());

        return new ResponseEntity<>(transactionSophosList, HttpStatus.OK);
    }

    private static Predicate<Transaction> transactionFilter(String transactionType, Double amount, String counterpartyName) {
        return transaction -> (transaction.getDetails().getType() == null ? false : transaction.getDetails().getType().equals(transactionType))
                || (transaction.getDetails().getValue().getAmount() == null ? false : amount.equals(Double.parseDouble(transaction.getDetails().getValue().getAmount())))
                || (transaction.getOtherAccount().getHolder().getName() == null ? false : transaction.getOtherAccount().getHolder().getName().equals(counterpartyName));
    }

    private HttpEntity generateAuthHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        return new HttpEntity(httpHeaders);
    }

}
