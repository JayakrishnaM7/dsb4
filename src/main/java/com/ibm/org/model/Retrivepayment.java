package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * retrivepayment
 */
@ApiModel(description = "retrivepayment")


public class Retrivepayment   {
  @JsonProperty("PaymentOrderId")
  private String paymentOrderId;

  public Retrivepayment paymentOrderId(String paymentOrderId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Retrivepayment retrivepayment = (Retrivepayment) o;
    return Objects.equals(this.paymentOrderId, retrivepayment.paymentOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Retrivepayment {\n");
    
    sb.append("    paymentOrderId: ").append(toIndentedString(paymentOrderId)).append("\n");
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

