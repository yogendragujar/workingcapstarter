package com.myapp.workingcapital.service.implementation;

import com.myapp.workingcapital.dto.PaymentTermDTO;
import com.myapp.workingcapital.entity.PaymentTerms;
import com.myapp.workingcapital.mapper.PaymentTermMapper;
import com.myapp.workingcapital.repository.PaymentTermsRepository;
import com.myapp.workingcapital.service.PaymentTermService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PaymentTermImplementation implements PaymentTermService {

    private PaymentTermsRepository paymentTermsRepository;
    @Override
    public PaymentTermDTO createPaymentTerm(PaymentTermDTO paymentTermDTO) {
//        using mapper class
        PaymentTerms paymentTerms = PaymentTermMapper.mapToPaymentTerms(paymentTermDTO);
        PaymentTerms savedTerms = paymentTermsRepository.save(paymentTerms);
        return PaymentTermMapper.mapToPaymentTermDTO(savedTerms);
    }
}
