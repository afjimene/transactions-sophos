
package com.openbank;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "holder",
    "number",
    "kind",
    "IBAN",
    "swift_bic",
    "bank",
    "metadata"
})
@Generated("jsonschema2pojo")
public class OtherAccount {

    @JsonProperty("id")
    private String id;
    @JsonProperty("holder")
    private Holder__1 holder;
    @JsonProperty("number")
    private String number;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("IBAN")
    private Object iban;
    @JsonProperty("swift_bic")
    private Object swiftBic;
    @JsonProperty("bank")
    private Bank__1 bank;
    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("holder")
    public Holder__1 getHolder() {
        return holder;
    }

    @JsonProperty("holder")
    public void setHolder(Holder__1 holder) {
        this.holder = holder;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("IBAN")
    public Object getIban() {
        return iban;
    }

    @JsonProperty("IBAN")
    public void setIban(Object iban) {
        this.iban = iban;
    }

    @JsonProperty("swift_bic")
    public Object getSwiftBic() {
        return swiftBic;
    }

    @JsonProperty("swift_bic")
    public void setSwiftBic(Object swiftBic) {
        this.swiftBic = swiftBic;
    }

    @JsonProperty("bank")
    public Bank__1 getBank() {
        return bank;
    }

    @JsonProperty("bank")
    public void setBank(Bank__1 bank) {
        this.bank = bank;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

}
