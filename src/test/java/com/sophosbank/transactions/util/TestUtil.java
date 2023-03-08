package com.sophosbank.transactions.util;

import com.openbank.*;
import com.sophosbank.transactions.model.FilterRequest;
import com.sophosbank.transactions.model.TransactionGroup;
import com.sophosbank.transactions.model.TransactionSophos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUtil {

    public static List<TransactionSophos> getTransactionSophosList(){
        TransactionSophos transactionSophos1 = new TransactionSophos()
                .transactionCurrency("USD")
                .id("1")
                .transactionType("A2A")
                .transactionAmount(69.0)
                .accountId("2345");

        TransactionSophos transactionSophos2 = new TransactionSophos()
                .transactionCurrency("COP")
                .id("2")
                .transactionType("WIRE")
                .transactionAmount(420.0)
                .accountId("98745");

        return new ArrayList<>(Arrays.asList(transactionSophos1, transactionSophos2));
    }

    public static List<TransactionGroup> getTransactionGroupList(){
        TransactionGroup transactionGroup1 = new TransactionGroup();
        transactionGroup1.setTransactionType("P2P");
        transactionGroup1.setTotalAmount(50.12);

        TransactionGroup transactionGroup2 = new TransactionGroup();
        transactionGroup2.setTransactionType("P2P");
        transactionGroup2.setTotalAmount(50.12);

        return new ArrayList<>(List.of(transactionGroup1, transactionGroup2));
    }

    public static Transactions getTransactions(){
        Details details = new Details();
        details.setDescription("Detalles");
        Value value = new Value();
        value.setAmount("100");
        details.setValue(value);

        Transaction transaction = new Transaction();
        transaction.setDetails(details);
        transaction.setId("1234");
        OtherAccount otherAccount = new OtherAccount();
        otherAccount.setId("13");
        otherAccount.setHolder(new Holder__1());
        transaction.setOtherAccount(otherAccount);

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction);

        Transactions transactions = new Transactions();
        transactions.setTransactions(transactionList);

        return transactions;
    }

    public static FilterRequest getFilterRequest(){
        return new FilterRequest()
                .counterpartyName("John Doe")
                .transactionAmount(25.0)
                .transactionType("International wire");
    }

}
