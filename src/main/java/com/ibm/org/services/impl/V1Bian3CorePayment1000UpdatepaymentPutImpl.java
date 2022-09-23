package com.ibm.org.services.impl;
 
import java.util.*;
 
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPutP;
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPutResponseWrapper;
import com.ibm.org.services.V1Bian3CorePayment1000UpdatepaymentPutI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class V1Bian3CorePayment1000UpdatepaymentPutImpl implements V1Bian3CorePayment1000UpdatepaymentPutI {
 
    private static final Log logger = LogFactory.getLog(V1Bian3CorePayment1000UpdatepaymentPutImpl.class);
    
    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */   
    @Override
    public V1Bian3CorePayment1000UpdatepaymentPutResponseWrapper execute(V1Bian3CorePayment1000UpdatepaymentPutP requestParams){
        //TODO
        return new V1Bian3CorePayment1000UpdatepaymentPutResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
