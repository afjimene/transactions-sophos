package com.sophosbank.transactions.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * TransactionSophos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-08T15:16:09.096075-05:00[America/Bogota]")


public class TransactionSophos   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("counterpartyAccount")
  private String counterpartyAccount = null;

  @JsonProperty("counterpartyName")
  private String counterpartyName = null;

  @JsonProperty("counterPartyLogoPath")
  private String counterPartyLogoPath = null;

  @JsonProperty("instructedAmount")
  private Double instructedAmount = null;

  @JsonProperty("instructedCurrency")
  private String instructedCurrency = null;

  @JsonProperty("transactionAmount")
  private Double transactionAmount = null;

  @JsonProperty("transactionCurrency")
  private String transactionCurrency = null;

  @JsonProperty("transactionType")
  private String transactionType = null;

  @JsonProperty("description")
  private String description = null;

  public TransactionSophos id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransactionSophos accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   **/
  @Schema(description = "")
  
    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TransactionSophos counterpartyAccount(String counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

  /**
   * Get counterpartyAccount
   * @return counterpartyAccount
   **/
  @Schema(description = "")
  
    public String getCounterpartyAccount() {
    return counterpartyAccount;
  }

  public void setCounterpartyAccount(String counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }

  public TransactionSophos counterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
    return this;
  }

  /**
   * Get counterpartyName
   * @return counterpartyName
   **/
  @Schema(description = "")
  
    public String getCounterpartyName() {
    return counterpartyName;
  }

  public void setCounterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
  }

  public TransactionSophos counterPartyLogoPath(String counterPartyLogoPath) {
    this.counterPartyLogoPath = counterPartyLogoPath;
    return this;
  }

  /**
   * Get counterPartyLogoPath
   * @return counterPartyLogoPath
   **/
  @Schema(description = "")
  
    public String getCounterPartyLogoPath() {
    return counterPartyLogoPath;
  }

  public void setCounterPartyLogoPath(String counterPartyLogoPath) {
    this.counterPartyLogoPath = counterPartyLogoPath;
  }

  public TransactionSophos instructedAmount(Double instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
   **/
  @Schema(description = "")
  
    public Double getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(Double instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public TransactionSophos instructedCurrency(String instructedCurrency) {
    this.instructedCurrency = instructedCurrency;
    return this;
  }

  /**
   * Get instructedCurrency
   * @return instructedCurrency
   **/
  @Schema(description = "")
  
    public String getInstructedCurrency() {
    return instructedCurrency;
  }

  public void setInstructedCurrency(String instructedCurrency) {
    this.instructedCurrency = instructedCurrency;
  }

  public TransactionSophos transactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Get transactionAmount
   * @return transactionAmount
   **/
  @Schema(description = "")
  
    public Double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public TransactionSophos transactionCurrency(String transactionCurrency) {
    this.transactionCurrency = transactionCurrency;
    return this;
  }

  /**
   * Get transactionCurrency
   * @return transactionCurrency
   **/
  @Schema(description = "")
  
    public String getTransactionCurrency() {
    return transactionCurrency;
  }

  public void setTransactionCurrency(String transactionCurrency) {
    this.transactionCurrency = transactionCurrency;
  }

  public TransactionSophos transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
   **/
  @Schema(description = "")
  
    public String getTransactionType() {
      return transactionType == null ? "VACIO" : transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public TransactionSophos description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSophos transactionSophos = (TransactionSophos) o;
    return Objects.equals(this.id, transactionSophos.id) &&
        Objects.equals(this.accountId, transactionSophos.accountId) &&
        Objects.equals(this.counterpartyAccount, transactionSophos.counterpartyAccount) &&
        Objects.equals(this.counterpartyName, transactionSophos.counterpartyName) &&
        Objects.equals(this.counterPartyLogoPath, transactionSophos.counterPartyLogoPath) &&
        Objects.equals(this.instructedAmount, transactionSophos.instructedAmount) &&
        Objects.equals(this.instructedCurrency, transactionSophos.instructedCurrency) &&
        Objects.equals(this.transactionAmount, transactionSophos.transactionAmount) &&
        Objects.equals(this.transactionCurrency, transactionSophos.transactionCurrency) &&
        Objects.equals(this.transactionType, transactionSophos.transactionType) &&
        Objects.equals(this.description, transactionSophos.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, counterpartyAccount, counterpartyName, counterPartyLogoPath, instructedAmount, instructedCurrency, transactionAmount, transactionCurrency, transactionType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSophos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
    sb.append("    counterpartyName: ").append(toIndentedString(counterpartyName)).append("\n");
    sb.append("    counterPartyLogoPath: ").append(toIndentedString(counterPartyLogoPath)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    instructedCurrency: ").append(toIndentedString(instructedCurrency)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionCurrency: ").append(toIndentedString(transactionCurrency)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
