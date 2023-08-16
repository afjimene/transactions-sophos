package com.sophosbank.transactions.service;

import com.openbank.Transactions;
import com.sophosbank.transactions.model.TransactionGroup;
import com.sophosbank.transactions.model.TransactionSophos;
import com.sophosbank.transactions.util.TestUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TransactionsServiceTest {
    @InjectMocks
    TransactionsService transactionsService;

    @Mock
    RestTemplate restTemplate;

    @Test
    void getTransactions() {
        when(restTemplate
                .getForEntity("https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions", Transactions.class))
                .thenReturn(new ResponseEntity<>(TestUtil.getTransactions(), HttpStatus.OK));

        ResponseEntity<List<TransactionSophos>> response = transactionsService.getTransactions();
        assertNotNull(response);
    }

    @Test
    void getTransactionsByFilter() {
        when(restTemplate
                .getForEntity("https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions", Transactions.class))
                .thenReturn(new ResponseEntity<>(TestUtil.getTransactions(), HttpStatus.OK));

        ResponseEntity<List<TransactionSophos>> response = transactionsService.getTransactionsByFilter("WIRE", 11.0, "Ben");
        assertNotNull(response);
    }

    @Test
    void getTransactionsGroup() {
        when(restTemplate
                .getForEntity("https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions", Transactions.class))
                .thenReturn(new ResponseEntity<>(TestUtil.getTransactions(), HttpStatus.OK));

        ResponseEntity<List<TransactionGroup>> response = transactionsService.getTransactionsGroup();
        assertNotNull(response);
    }
}