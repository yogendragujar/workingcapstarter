package com.myapp.workingcapital.mapper;

import com.myapp.workingcapital.dto.PaymentTermDTO;
import com.myapp.workingcapital.entity.PaymentTerms;

public class PaymentTermMapper {
    public static PaymentTermDTO mapToPaymentTermDTO(PaymentTerms paymentTerms){
        return new PaymentTermDTO(
                paymentTerms.getId(),
                paymentTerms.getPaymentCode(),
                paymentTerms.getPaymentDescription()
        );
    }

    public static PaymentTerms mapToPaymentTerms(PaymentTermDTO paymentTermDTO){
        return new PaymentTerms(
                paymentTermDTO.getId(),
                paymentTermDTO.getPaymentCode(),
                paymentTermDTO.getPaymentDescription()
        );
    }
}
