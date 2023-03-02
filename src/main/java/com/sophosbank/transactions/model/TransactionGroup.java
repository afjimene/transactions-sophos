package com.sophosbank.transactions.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionGroup {

    @JsonProperty("transactionType")
    private String transactionType = null;

    @JsonProperty("totalAmount")
    private Double totalAmount = null;

    public TransactionGroup() {}

    public TransactionGroup(String transactionType, Double totalAmount) {
        this.transactionType = transactionType;
        this.totalAmount = totalAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
