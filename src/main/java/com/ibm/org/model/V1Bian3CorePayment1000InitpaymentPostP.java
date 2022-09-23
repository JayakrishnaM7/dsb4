package com.ibm.org.model;

import com.ibm.org.model.InitPaymentRequest;
import org.springframework.http.ResponseEntity;

public class V1Bian3CorePayment1000InitpaymentPostP {

    private InitPaymentRequest initPaymentRequest;

    public V1Bian3CorePayment1000InitpaymentPostP() {

    }

    public V1Bian3CorePayment1000InitpaymentPostP(InitPaymentRequest initPaymentRequest) {
        this.initPaymentRequest = initPaymentRequest;
    }

    public InitPaymentRequest getInitPaymentRequest () {
        return initPaymentRequest;
    }

    public void setInitPaymentRequest (InitPaymentRequest initPaymentRequest) {
        this.initPaymentRequest = initPaymentRequest;
    }

}
