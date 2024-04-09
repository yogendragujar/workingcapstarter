package com.myapp.workingcapital.controller;

import com.myapp.workingcapital.dto.PaymentTermDTO;
import com.myapp.workingcapital.service.PaymentTermService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/api/paymentterms")
public class PaymentTermsController {
    private PaymentTermService paymentTermService;
//    Build rest api
    @PostMapping
    public ResponseEntity<PaymentTermDTO> createPaymentTerm(@RequestBody PaymentTermDTO paymentTermDTO){
        PaymentTermDTO savedPaymentTerm = paymentTermService.createPaymentTerm(paymentTermDTO);
        return new ResponseEntity<>(savedPaymentTerm, HttpStatus.CREATED);
    }


}
