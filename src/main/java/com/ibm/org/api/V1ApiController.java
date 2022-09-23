package com.ibm.org.api;

import com.ibm.org.model.Account;
import com.ibm.org.model.InitPaymentRequest;
import com.ibm.org.model.Retrivepayment;
import com.ibm.org.model.Updatepayment;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.ibm.org.services.V1Bian3CorePayment1000InitpaymentPostI;
import com.ibm.org.model.V1Bian3CorePayment1000InitpaymentPostP;
import com.ibm.org.model.V1Bian3CorePayment1000InitpaymentPostResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.ibm.org.services.V1Bian3CorePayment1000UpdatepaymentPutI;
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPutP;
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPutResponseWrapper;
import com.ibm.org.services.V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetI;
import com.ibm.org.model.V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetP;
import com.ibm.org.model.V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetResponseWrapper;
import com.ibm.org.services.V1Bian3CorePayment1000GetAccountbalanceGetI;
import com.ibm.org.model.V1Bian3CorePayment1000GetAccountbalanceGetP;
import com.ibm.org.model.V1Bian3CorePayment1000GetAccountbalanceGetResponseWrapper;

@RestController
public class V1ApiController implements V1Api {

	@Autowired
	V1Bian3CorePayment1000GetAccountbalanceGetI v1Bian3CorePayment1000GetAccountbalanceGetI;


	@Autowired
	V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetI v1Bian3CorePayment1000RetrivepaymentPaymentorderidGetI;


	@Autowired
	V1Bian3CorePayment1000UpdatepaymentPutI v1Bian3CorePayment1000UpdatepaymentPutI;


	@Autowired
	V1Bian3CorePayment1000InitpaymentPostI v1Bian3CorePayment1000InitpaymentPostI;


    public ResponseEntity<Account> v1Bian3CorePayment1000GetAccountbalanceGet(){
        V1Bian3CorePayment1000GetAccountbalanceGetResponseWrapper res=null;
        try {
             res  = v1Bian3CorePayment1000GetAccountbalanceGetI.execute(new V1Bian3CorePayment1000GetAccountbalanceGetP());
        } catch (Exception e) {
            // TODO Exception handling
             return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> v1Bian3CorePayment1000InitpaymentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InitPaymentRequest initPaymentRequest){
        V1Bian3CorePayment1000InitpaymentPostResponseWrapper res=null;
        try {
             res  = v1Bian3CorePayment1000InitpaymentPostI.execute(new V1Bian3CorePayment1000InitpaymentPostP(initPaymentRequest));
        } catch (Exception e) {
            // TODO Exception handling
             return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Retrivepayment> v1Bian3CorePayment1000RetrivepaymentPaymentorderidGet(@ApiParam(value = "",required=true) @PathVariable("paymentorderid") String paymentorderid){
        V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetResponseWrapper res=null;
        try {
             res  = v1Bian3CorePayment1000RetrivepaymentPaymentorderidGetI.execute(new V1Bian3CorePayment1000RetrivepaymentPaymentorderidGetP(paymentorderid));
        } catch (Exception e) {
            // TODO Exception handling
             return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> v1Bian3CorePayment1000UpdatepaymentPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Updatepayment updatepayment){
        V1Bian3CorePayment1000UpdatepaymentPutResponseWrapper res=null;
        try {
             res  = v1Bian3CorePayment1000UpdatepaymentPutI.execute(new V1Bian3CorePayment1000UpdatepaymentPutP(updatepayment));
        } catch (Exception e) {
            // TODO Exception handling
             return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
