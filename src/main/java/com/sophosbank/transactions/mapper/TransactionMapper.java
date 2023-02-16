package com.sophosbank.transactions.mapper;

import com.openbank.Transaction;
import com.sophosbank.transactions.model.TransactionSophos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {

    TransactionMapper MAPPER = Mappers.getMapper(TransactionMapper.class);

    @Mapping(target = "accountId", source = "thisAccount.id")
    @Mapping(target = "counterpartyAccount", source = "otherAccount.number")
    @Mapping(target = "counterpartyName", source = "otherAccount.holder.name")
    @Mapping(target = "counterPartyLogoPath", source = "otherAccount.metadata.imageURL")
    @Mapping(target = "instructedAmount", source = "details.value.amount")
    @Mapping(target = "instructedCurrency", source = "details.value.currency")
    @Mapping(target = "transactionAmount", source = "details.value.amount")
    @Mapping(target = "transactionCurrency", source = "details.value.currency")
    @Mapping(target = "transactionType", source = "details.type")
    @Mapping(target = "description", source = "details.description")
    TransactionSophos getTransaction(Transaction transaction);
}
