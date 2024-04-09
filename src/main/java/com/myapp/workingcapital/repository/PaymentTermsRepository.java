package com.myapp.workingcapital.repository;

import com.myapp.workingcapital.entity.PaymentTerms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTermsRepository extends JpaRepository<PaymentTerms, Integer> {
//    there is no need for REpository annotation because jpa repository has simple jpa repository which already has repo annotation

}
