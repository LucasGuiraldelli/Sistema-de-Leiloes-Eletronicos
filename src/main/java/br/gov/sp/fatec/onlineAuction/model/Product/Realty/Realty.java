package br.gov.sp.fatec.onlineAuction.model.Product.Realty;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Realty extends Product{
    
    private Double totalArea;

}
