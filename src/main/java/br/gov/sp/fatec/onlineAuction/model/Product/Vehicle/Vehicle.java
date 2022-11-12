package br.gov.sp.fatec.onlineAuction.model.Product.Vehicle;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Vehicle extends Product{
    
    private String model;
    private String brand;
    private String color;

}
