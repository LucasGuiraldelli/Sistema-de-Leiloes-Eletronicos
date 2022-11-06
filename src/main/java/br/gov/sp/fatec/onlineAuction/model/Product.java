package br.gov.sp.fatec.onlineAuction.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    
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

        return p.getName().equals(this.getName()) && p.getAuction().equals(this.getAuction());
    }

}
