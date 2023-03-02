package com.sophosbank.transactions.service;

import com.openbank.Transaction;
import com.openbank.Transactions;
import com.sophosbank.transactions.mapper.TransactionMapper;
import com.sophosbank.transactions.model.TransactionGroup;
import com.sophosbank.transactions.model.TransactionSophos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TransactionsService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<List<TransactionSophos>> getTransactions() {
        ResponseEntity<Transactions> responseEntity = getTransactionsResponseEntity();

        List<TransactionSophos> transactionSophosList =
            Objects.requireNonNull(responseEntity.getBody()).getTransactions().stream()
                    .map(TransactionMapper.MAPPER::getTransaction)
                    .collect(Collectors.toList());

        return new ResponseEntity<>(transactionSophosList, HttpStatus.OK);
    }

    private ResponseEntity<Transactions> getTransactionsResponseEntity() {
        return restTemplate.getForEntity(
                "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions",
                Transactions.class);
    }

    public ResponseEntity<List<TransactionSophos>> getTransactionsByFilter(
            String transactionType, Double transactionAmount, String counterpartyName) {
        ResponseEntity<Transactions> responseEntity = getTransactionsResponseEntity();

        List<TransactionSophos> transactionSophosList =
                Objects.requireNonNull(responseEntity.getBody()).getTransactions().stream()
                        .filter(transactionFilter(transactionType, transactionAmount, counterpartyName))
                        .map(TransactionMapper.MAPPER::getTransaction)
                        .collect(Collectors.toList());

        return new ResponseEntity<>(transactionSophosList, HttpStatus.OK);
    }

    public ResponseEntity<List<TransactionGroup>> getTransactionsGroup() {
        ResponseEntity<Transactions> responseEntity = getTransactionsResponseEntity();

        //responseEntity.getBody().getTransactions()
        //        .stream().collect(Collectors.groupingBy(transaction -> transaction.getDetails().getType()

        Map<String, Double> result = Objects.requireNonNull(responseEntity.getBody()).getTransactions().stream()
                        .map(TransactionMapper.MAPPER::getTransaction)
                .collect(Collectors.groupingBy(TransactionSophos::getTransactionType,
                        Collectors.summingDouble(TransactionSophos::getTransactionAmount))
                );

        List<TransactionGroup> resultGroup = result.entrySet().stream()
                .map(group -> new TransactionGroup(group.getKey(), group.getValue()))
                .collect(Collectors.toList());

        return new ResponseEntity<>(resultGroup, HttpStatus.OK);
    }

    private static Predicate<Transaction> transactionFilter(String transactionType, Double amount, String counterpartyName) {
        return transaction -> (transaction.getDetails().getType() != null && transaction.getDetails().getType().equals(transactionType))
                || (transaction.getDetails().getValue().getAmount() != null && amount.equals(Double.parseDouble(transaction.getDetails().getValue().getAmount())))
                || (transaction.getOtherAccount().getHolder().getName() != null && transaction.getOtherAccount().getHolder().getName().equals(counterpartyName));
    }

}
