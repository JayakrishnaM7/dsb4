package com.ibm.org.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import com.ibm.org.model.Account;


public class V1Bian3CorePayment1000GetAccountbalanceGetResponseWrapper {

	private Account response;
        
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
 
	public Account getResponse(){
            return response;
	}
 
	public void setResponse(Account response){
            this.response=response;
	}  
}
