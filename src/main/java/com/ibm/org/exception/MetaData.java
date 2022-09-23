package com.ibm.org.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.org.exception.ApiExceptionResponse;
import com.ibm.org.exception.ErrorStatusCode;
import com.ibm.org.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
