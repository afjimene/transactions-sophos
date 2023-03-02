package com.sophosbank.transactions.api;

import com.sophosbank.transactions.model.FilterRequest;
import com.sophosbank.transactions.model.TransactionGroup;
import com.sophosbank.transactions.model.TransactionSophos;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sophosbank.transactions.service.TransactionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-08T15:16:09.096075-05:00[America/Bogota]")
@RestController
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final TransactionsService service;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionsApiController(ObjectMapper objectMapper, HttpServletRequest request,
                                     TransactionsService transactionsService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.service = transactionsService;
    }

    public ResponseEntity<List<TransactionSophos>> transactionsList() {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<List<TransactionSophos>>(objectMapper.readValue("[ {\n  \"instructedCurrency\" : \"instructedCurrency\",\n  \"transactionType\" : \"transactionType\",\n  \"accountId\" : \"accountId\",\n  \"counterPartyLogoPath\" : \"counterPartyLogoPath\",\n  \"transactionCurrency\" : \"transactionCurrency\",\n  \"transactionAmount\" : 6.027456183070403,\n  \"counterpartyAccount\" : \"counterpartyAccount\",\n  \"counterpartyName\" : \"counterpartyName\",\n  \"description\" : \"description\",\n  \"instructedAmount\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"instructedCurrency\" : \"instructedCurrency\",\n  \"transactionType\" : \"transactionType\",\n  \"accountId\" : \"accountId\",\n  \"counterPartyLogoPath\" : \"counterPartyLogoPath\",\n  \"transactionCurrency\" : \"transactionCurrency\",\n  \"transactionAmount\" : 6.027456183070403,\n  \"counterpartyAccount\" : \"counterpartyAccount\",\n  \"counterpartyName\" : \"counterpartyName\",\n  \"description\" : \"description\",\n  \"instructedAmount\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<TransactionSophos>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return service.getTransactions();
    }

    @Override
    public ResponseEntity<List<TransactionSophos>> transactionsFilter(String transactionType, Double transactionAmount, String counterpartyName) {
        //Double amount = Optional.ofNullable(transactionAmount).orElse(new BigDecimal(0.0)).doubleValue();
        return service.getTransactionsByFilter(transactionType, transactionAmount, counterpartyName);
    }

    @Override
    public ResponseEntity<List<TransactionSophos>> transactionsPostFilter(FilterRequest body) {
        //Double amount = Optional.ofNullable(body.getTransactionAmount()).orElse(new BigDecimal(0.0)).doubleValue();
        return service.getTransactionsByFilter(body.getTransactionType(), body.getTransactionAmount(), body.getCounterpartyName());
    }

    @Override
    public ResponseEntity<List<TransactionGroup>> transactionsGroup() {
        return service.getTransactionsGroup();
    }

}
