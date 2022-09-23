package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatepaymentPaymentOrderProcedure
 */


public class UpdatepaymentPaymentOrderProcedure   {
  @JsonProperty("PaymentOrderId")
  private String paymentOrderId;

  @JsonProperty("PaymentTransactionInitiatorReference")
  private String paymentTransactionInitiatorReference;

  @JsonProperty("PayerReference")
  private String payerReference;

  @JsonProperty("PayerBankReference")
  private String payerBankReference;

  @JsonProperty("PayerProductInstanceReference")
  private String payerProductInstanceReference;

  @JsonProperty("PayeeReference")
  private String payeeReference;

  @JsonProperty("PayeeBankReference")
  private String payeeBankReference;

  @JsonProperty("PayeeProductInstanceReference")
  private String payeeProductInstanceReference;

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

  public UpdatepaymentPaymentOrderProcedure paymentOrderId(String paymentOrderId) {
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

  public UpdatepaymentPaymentOrderProcedure paymentTransactionInitiatorReference(String paymentTransactionInitiatorReference) {
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

  public UpdatepaymentPaymentOrderProcedure payerReference(String payerReference) {
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

  public UpdatepaymentPaymentOrderProcedure payerBankReference(String payerBankReference) {
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

  public UpdatepaymentPaymentOrderProcedure payerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")


  public String getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public UpdatepaymentPaymentOrderProcedure payeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")


  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }

  public UpdatepaymentPaymentOrderProcedure payeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")


  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public UpdatepaymentPaymentOrderProcedure payeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")


  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public UpdatepaymentPaymentOrderProcedure amount(String amount) {
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

  public UpdatepaymentPaymentOrderProcedure currency(String currency) {
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

  public UpdatepaymentPaymentOrderProcedure dateType(String dateType) {
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

  public UpdatepaymentPaymentOrderProcedure paymentMechanismType(String paymentMechanismType) {
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

  public UpdatepaymentPaymentOrderProcedure paymentInstructions(String paymentInstructions) {
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

  public UpdatepaymentPaymentOrderProcedure interestedParties(String interestedParties) {
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

  public UpdatepaymentPaymentOrderProcedure productType(String productType) {
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

  public UpdatepaymentPaymentOrderProcedure settlementInstructions(String settlementInstructions) {
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
    UpdatepaymentPaymentOrderProcedure updatepaymentPaymentOrderProcedure = (UpdatepaymentPaymentOrderProcedure) o;
    return Objects.equals(this.paymentOrderId, updatepaymentPaymentOrderProcedure.paymentOrderId) &&
        Objects.equals(this.paymentTransactionInitiatorReference, updatepaymentPaymentOrderProcedure.paymentTransactionInitiatorReference) &&
        Objects.equals(this.payerReference, updatepaymentPaymentOrderProcedure.payerReference) &&
        Objects.equals(this.payerBankReference, updatepaymentPaymentOrderProcedure.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, updatepaymentPaymentOrderProcedure.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, updatepaymentPaymentOrderProcedure.payeeReference) &&
        Objects.equals(this.payeeBankReference, updatepaymentPaymentOrderProcedure.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, updatepaymentPaymentOrderProcedure.payeeProductInstanceReference) &&
        Objects.equals(this.amount, updatepaymentPaymentOrderProcedure.amount) &&
        Objects.equals(this.currency, updatepaymentPaymentOrderProcedure.currency) &&
        Objects.equals(this.dateType, updatepaymentPaymentOrderProcedure.dateType) &&
        Objects.equals(this.paymentMechanismType, updatepaymentPaymentOrderProcedure.paymentMechanismType) &&
        Objects.equals(this.paymentInstructions, updatepaymentPaymentOrderProcedure.paymentInstructions) &&
        Objects.equals(this.interestedParties, updatepaymentPaymentOrderProcedure.interestedParties) &&
        Objects.equals(this.productType, updatepaymentPaymentOrderProcedure.productType) &&
        Objects.equals(this.settlementInstructions, updatepaymentPaymentOrderProcedure.settlementInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderId, paymentTransactionInitiatorReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, paymentMechanismType, paymentInstructions, interestedParties, productType, settlementInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatepaymentPaymentOrderProcedure {\n");
    
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

