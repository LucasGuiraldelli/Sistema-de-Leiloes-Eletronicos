package br.gov.sp.fatec.onlineAuction.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Vehicle extends Product{
    
    private VehicleType type;

}
