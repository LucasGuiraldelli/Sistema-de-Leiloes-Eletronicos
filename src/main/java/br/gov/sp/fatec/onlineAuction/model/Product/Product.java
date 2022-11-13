package br.gov.sp.fatec.onlineAuction.model.Product;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Auction;
import br.gov.sp.fatec.onlineAuction.model.Bid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    
    private Long id;
    private String name;
    private String description;
    private Long initialPrice;
    
    private Auction auction;
    private List<Bid> bids;
    
    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;

        if(!(o instanceof Product))
            return false;

            Product p = (Product) o;

        return p.getId().equals(id);
    }

}
