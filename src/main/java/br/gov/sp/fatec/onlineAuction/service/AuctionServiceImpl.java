package br.gov.sp.fatec.onlineAuction.service;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Auction;
import br.gov.sp.fatec.onlineAuction.repository.AuctionRepository;
import br.gov.sp.fatec.onlineAuction.repository.AuctionRepositoryImpl;

public class AuctionServiceImpl implements AuctionService{

    AuctionRepository auctionRepository;

    public AuctionServiceImpl(){
        auctionRepository = AuctionRepositoryImpl.getInstance();
    }

    public Auction getAuction(Auction auction) {
        return auctionRepository.find(auction);
    }

    public Auction addAuction(Auction auction) {
        return auctionRepository.add(auction);
    }

    public Auction updateAuction(Auction auction) {
        return auctionRepository.update(auction);
    }

    public Auction removeAuction(Auction auction) {
        return auctionRepository.remove(auction);
    }

    public List<Auction> listAuction() {
        return auctionRepository.findAll();
    }
    
}
