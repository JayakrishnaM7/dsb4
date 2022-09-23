package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitPaymentRequestPaymentOrderProcedure
 */


public class InitPaymentRequestPaymentOrderProcedure   {
  @JsonProperty("PaymentOrderId")
  private String paymentOrderId;

  @JsonProperty("PaymentTransactionInitiatorReference")
  private Object paymentTransactionInitiatorReference = null;

  @JsonProperty("PayerReference")
  private Object payerReference = null;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference = null;

  @JsonProperty("PayerProductInstanceReference")
  private Object payerProductInstanceReference = null;

  @JsonProperty("PayeeReference")
  private Object payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference = null;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference = null;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("PaymentMechanismType")
  private String paymentMechanismType;

  @JsonProperty("PaymentInstructions")
  private String paymentInstructions;

  @JsonProperty("InterestedParties")
  private String interestedParties;

  @JsonProperty("ProductType")
  private String productType;

  @JsonProperty("SettlementInstructions")
  private String settlementInstructions;

  public InitPaymentRequestPaymentOrderProcedure paymentOrderId(String paymentOrderId) {
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

  public InitPaymentRequestPaymentOrderProcedure paymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Get paymentTransactionInitiatorReference
   * @return paymentTransactionInitiatorReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public InitPaymentRequestPaymentOrderProcedure payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public InitPaymentRequestPaymentOrderProcedure payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public InitPaymentRequestPaymentOrderProcedure payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public InitPaymentRequestPaymentOrderProcedure payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public InitPaymentRequestPaymentOrderProcedure payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public InitPaymentRequestPaymentOrderProcedure payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public InitPaymentRequestPaymentOrderProcedure amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InitPaymentRequestPaymentOrderProcedure currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InitPaymentRequestPaymentOrderProcedure dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public InitPaymentRequestPaymentOrderProcedure paymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
    return this;
  }

  /**
   * Get paymentMechanismType
   * @return paymentMechanismType
  */
  @ApiModelProperty(value = "")


  public String getPaymentMechanismType() {
    return paymentMechanismType;
  }

  public void setPaymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
  }

  public InitPaymentRequestPaymentOrderProcedure paymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

  /**
   * Get paymentInstructions
   * @return paymentInstructions
  */
  @ApiModelProperty(value = "")


  public String getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public InitPaymentRequestPaymentOrderProcedure interestedParties(String interestedParties) {
    this.interestedParties = interestedParties;
    return this;
  }

  /**
   * Get interestedParties
   * @return interestedParties
  */
  @ApiModelProperty(value = "")


  public String getInterestedParties() {
    return interestedParties;
  }

  public void setInterestedParties(String interestedParties) {
    this.interestedParties = interestedParties;
  }

  public InitPaymentRequestPaymentOrderProcedure productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public InitPaymentRequestPaymentOrderProcedure settlementInstructions(String settlementInstructions) {
    this.settlementInstructions = settlementInstructions;
    return this;
  }

  /**
   * Get settlementInstructions
   * @return settlementInstructions
  */
  @ApiModelProperty(value = "")


  public String getSettlementInstructions() {
    return settlementInstructions;
  }

  public void setSettlementInstructions(String settlementInstructions) {
    this.settlementInstructions = settlementInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitPaymentRequestPaymentOrderProcedure initPaymentRequestPaymentOrderProcedure = (InitPaymentRequestPaymentOrderProcedure) o;
    return Objects.equals(this.paymentOrderId, initPaymentRequestPaymentOrderProcedure.paymentOrderId) &&
        Objects.equals(this.paymentTransactionInitiatorReference, initPaymentRequestPaymentOrderProcedure.paymentTransactionInitiatorReference) &&
        Objects.equals(this.payerReference, initPaymentRequestPaymentOrderProcedure.payerReference) &&
        Objects.equals(this.payerBankReference, initPaymentRequestPaymentOrderProcedure.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, initPaymentRequestPaymentOrderProcedure.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, initPaymentRequestPaymentOrderProcedure.payeeReference) &&
        Objects.equals(this.payeeBankReference, initPaymentRequestPaymentOrderProcedure.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, initPaymentRequestPaymentOrderProcedure.payeeProductInstanceReference) &&
        Objects.equals(this.amount, initPaymentRequestPaymentOrderProcedure.amount) &&
        Objects.equals(this.currency, initPaymentRequestPaymentOrderProcedure.currency) &&
        Objects.equals(this.dateType, initPaymentRequestPaymentOrderProcedure.dateType) &&
        Objects.equals(this.paymentMechanismType, initPaymentRequestPaymentOrderProcedure.paymentMechanismType) &&
        Objects.equals(this.paymentInstructions, initPaymentRequestPaymentOrderProcedure.paymentInstructions) &&
        Objects.equals(this.interestedParties, initPaymentRequestPaymentOrderProcedure.interestedParties) &&
        Objects.equals(this.productType, initPaymentRequestPaymentOrderProcedure.productType) &&
        Objects.equals(this.settlementInstructions, initPaymentRequestPaymentOrderProcedure.settlementInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderId, paymentTransactionInitiatorReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, paymentMechanismType, paymentInstructions, interestedParties, productType, settlementInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitPaymentRequestPaymentOrderProcedure {\n");
    
    sb.append("    paymentOrderId: ").append(toIndentedString(paymentOrderId)).append("\n");
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    paymentMechanismType: ").append(toIndentedString(paymentMechanismType)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    interestedParties: ").append(toIndentedString(interestedParties)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    settlementInstructions: ").append(toIndentedString(settlementInstructions)).append("\n");
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

