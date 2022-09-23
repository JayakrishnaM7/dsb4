package com.ibm.org.services;

import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPutP;
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPutResponseWrapper;

public interface V1Bian3CorePayment1000UpdatepaymentPutI {

    public V1Bian3CorePayment1000UpdatepaymentPutResponseWrapper execute(V1Bian3CorePayment1000UpdatepaymentPutP requestParams) throws Exception;

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
