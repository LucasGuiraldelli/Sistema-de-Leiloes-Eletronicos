package br.gov.sp.fatec.onlineAuction.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Auction {

    private Long id;
    private String description;
    private Date start;
    private Date end;
    private Address address;

    private AuctionStatus status;
    private FinancialInstitution financialInstitution;

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;

        if(!(o instanceof Auction))
            return false;

            Auction a = (Auction) o;

        return a.getId().equals(id);
    }

}
