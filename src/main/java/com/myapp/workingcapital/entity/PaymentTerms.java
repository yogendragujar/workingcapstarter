package com.myapp.workingcapital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "payterms")
public class PaymentTerms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="paymentcode", nullable = false,unique = true)
    private Long paymentCode;
    @Column(name = "paymentdescription")
    private String paymentDescription;
}
