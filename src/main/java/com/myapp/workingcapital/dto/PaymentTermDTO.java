package com.myapp.workingcapital.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTermDTO {
//    dto class is used to transfer the data between client and server
//    mapper class is required to map the dto class to entity and vice-versa
    public Integer id;
    public Long paymentCode;
    public String paymentDescription;
}
