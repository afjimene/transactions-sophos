package com.sophosbank.transactions.api;

import com.sophosbank.transactions.model.TransactionGroup;
import com.sophosbank.transactions.model.TransactionSophos;
import com.sophosbank.transactions.service.TransactionsService;
import com.sophosbank.transactions.util.TestUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

//Extension that initializes mocks and handles strict stubbings
@ExtendWith(MockitoExtension.class)
class TransactionsApiControllerTest {

    @InjectMocks
    TransactionsApiController transactionsApiController;

    @Mock
    TransactionsService service;

    @Test
    void transactionsList() {

        ResponseEntity<List<TransactionSophos>> responseEntity = new ResponseEntity<>(TestUtil.getTransactionSophosList(), HttpStatus.OK);
        when(service.getTransactions()).thenReturn(responseEntity);

        ResponseEntity<List<TransactionSophos>> response = transactionsApiController.transactionsList();
        Assertions.assertNotNull(response);
    }

    @Test
    void transactionsFilter() {
        ResponseEntity<List<TransactionSophos>> responseEntity = new ResponseEntity<>(TestUtil.getTransactionSophosList(), HttpStatus.OK);
        when(service.getTransactionsByFilter(any(),any(),any())).thenReturn(responseEntity);

        ResponseEntity<List<TransactionSophos>> response = transactionsApiController.transactionsFilter("DEBIT", 10.0, "JohnDoe");
        Assertions.assertNotNull(response);
    }

    @Test
    void transactionsPostFilter() {
        ResponseEntity<List<TransactionSophos>> responseEntity = new ResponseEntity<>(TestUtil.getTransactionSophosList(), HttpStatus.OK);
        when(service.getTransactionsByFilter(any(),any(),any())).thenReturn(responseEntity);

        ResponseEntity<List<TransactionSophos>> response = transactionsApiController.transactionsPostFilter(TestUtil.getFilterRequest());
        Assertions.assertNotNull(response);
    }

    @Test
    void transactionsGroup() {
        ResponseEntity<List<TransactionGroup>> responseEntity = new ResponseEntity<>(TestUtil.getTransactionGroupList(), HttpStatus.OK);
        when(service.getTransactionsGroup()).thenReturn(responseEntity);

        ResponseEntity<List<TransactionGroup>> response = transactionsApiController.transactionsGroup();
        Assertions.assertNotNull(response);
    }
}