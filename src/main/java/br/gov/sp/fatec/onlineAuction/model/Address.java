package br.gov.sp.fatec.onlineAuction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    
    private Integer zipCode;
    private Integer number;
    private String publicPlace;
    private String district;
    private String city;
    private String state;

}
