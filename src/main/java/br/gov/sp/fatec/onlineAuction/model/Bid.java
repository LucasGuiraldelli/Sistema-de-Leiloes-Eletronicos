package br.gov.sp.fatec.onlineAuction.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bid {
    
    private Client client;
    private Date date;
    private Double value;

}
