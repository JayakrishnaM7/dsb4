package com.ibm.org.services;

import com.ibm.org.model.V1Bian3CorePayment1000GetAccountbalanceGetP;
import com.ibm.org.model.V1Bian3CorePayment1000GetAccountbalanceGetResponseWrapper;

public interface V1Bian3CorePayment1000GetAccountbalanceGetI {

    public V1Bian3CorePayment1000GetAccountbalanceGetResponseWrapper execute(V1Bian3CorePayment1000GetAccountbalanceGetP requestParams) throws Exception;

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
