package br.gov.sp.fatec.onlineAuction.service;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Auction;

public interface AuctionService {
    public List<Auction> listAuction();
    public Auction getAuction(Auction auction);
    public Auction addAuction(Auction auction);
    public Auction updateAuction(Auction auction);
    public Auction removeAuction(Auction auction);
}
