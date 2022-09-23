package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountPaymentOrderProcedure
 */


public class AccountPaymentOrderProcedure   {
  @JsonProperty("PaymentOrderId")
  private String paymentOrderId;

  @JsonProperty("PaymentTransactionInitiatorReference")
  private String paymentTransactionInitiatorReference;

  @JsonProperty("PayerReference")
  private String payerReference;

  @JsonProperty("PayerBankReference")
  private String payerBankReference;

  public AccountPaymentOrderProcedure paymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
    return this;
  }

  /**
   * Get paymentOrderId
   * @return paymentOrderId
  */
  @ApiModelProperty(value = "")


  public String getPaymentOrderId() {
    return paymentOrderId;
  }

  public void setPaymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
  }

  public AccountPaymentOrderProcedure paymentTransactionInitiatorReference(String paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Get paymentTransactionInitiatorReference
   * @return paymentTransactionInitiatorReference
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(String paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public AccountPaymentOrderProcedure payerReference(String payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")


  public String getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(String payerReference) {
    this.payerReference = payerReference;
  }

  public AccountPaymentOrderProcedure payerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")


  public String getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPaymentOrderProcedure accountPaymentOrderProcedure = (AccountPaymentOrderProcedure) o;
    return Objects.equals(this.paymentOrderId, accountPaymentOrderProcedure.paymentOrderId) &&
        Objects.equals(this.paymentTransactionInitiatorReference, accountPaymentOrderProcedure.paymentTransactionInitiatorReference) &&
        Objects.equals(this.payerReference, accountPaymentOrderProcedure.payerReference) &&
        Objects.equals(this.payerBankReference, accountPaymentOrderProcedure.payerBankReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderId, paymentTransactionInitiatorReference, payerReference, payerBankReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPaymentOrderProcedure {\n");
    
    sb.append("    paymentOrderId: ").append(toIndentedString(paymentOrderId)).append("\n");
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

