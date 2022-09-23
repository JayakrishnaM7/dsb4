package com.ibm.org.services;

import com.ibm.org.model.V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetP;
import com.ibm.org.model.V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetResponseWrapper;

public interface V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetI {

    public V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetResponseWrapper execute(V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetP requestParams) throws Exception;

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
