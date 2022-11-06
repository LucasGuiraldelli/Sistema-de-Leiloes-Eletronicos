package br.gov.sp.fatec.onlineAuction.repository;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Auction;

public interface AuctionRepository {
    public List<Auction> findAll();
    public Auction find(Auction auction);
    public Auction add(Auction auction);
    public Auction update(Auction auction);
    public Auction remove(Auction auction);
}
