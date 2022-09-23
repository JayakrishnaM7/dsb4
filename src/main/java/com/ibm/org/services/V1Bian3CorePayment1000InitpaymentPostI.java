package com.ibm.org.services;

import com.ibm.org.model.V1Bian3CorePayment1000InitpaymentPostP;
import com.ibm.org.model.V1Bian3CorePayment1000InitpaymentPostResponseWrapper;

public interface V1Bian3CorePayment1000InitpaymentPostI {

    public V1Bian3CorePayment1000InitpaymentPostResponseWrapper execute(V1Bian3CorePayment1000InitpaymentPostP requestParams) throws Exception;

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
