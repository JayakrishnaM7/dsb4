package com.ibm.org.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import com.ibm.org.model.Retrivepayment;


public class V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetResponseWrapper {

	private Retrivepayment response;
        
        private MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();

        public MultiValueMap<String, String> getHeaders(){
            return this.headers;
	}

	public void setHeaders(MultiValueMap<String,String> headers){
            this.headers = headers;
	}
        
        public void addHeaders(String header, List<String> value) {
            headers.put(header, value);
        }
 
	public Retrivepayment getResponse(){
            return response;
	}
 
	public void setResponse(Retrivepayment response){
            this.response=response;
	}  
}
