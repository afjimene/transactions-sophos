package com.sophosbank.transactions.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FilterRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-14T08:54:47.596969-05:00[America/Bogota]")


public class FilterRequest   {
  @JsonProperty("transactionType")
  private String transactionType = null;

  @JsonProperty("transactionAmount")
  private Double transactionAmount = null;

  @JsonProperty("counterpartyName")
  private String counterpartyName = null;

  public FilterRequest transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
   **/
  @Schema(description = "")
  
    public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public FilterRequest transactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Get transactionAmount
   * @return transactionAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public FilterRequest counterpartyName(String counterpartyName) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterRequest filterRequest = (FilterRequest) o;
    return Objects.equals(this.transactionType, filterRequest.transactionType) &&
        Objects.equals(this.transactionAmount, filterRequest.transactionAmount) &&
        Objects.equals(this.counterpartyName, filterRequest.counterpartyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, transactionAmount, counterpartyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterRequest {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    counterpartyName: ").append(toIndentedString(counterpartyName)).append("\n");
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
