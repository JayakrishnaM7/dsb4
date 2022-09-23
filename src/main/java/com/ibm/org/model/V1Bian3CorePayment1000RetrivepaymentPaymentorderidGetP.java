package com.ibm.org.model;

import org.springframework.http.ResponseEntity;
import com.ibm.org.model.Retrivepayment;

public class V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetP {

    private String paymentorderid;

    public V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetP() {

    }

    public V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetP(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid () {
        return paymentorderid;
    }

    public void setPaymentorderid (String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

}
