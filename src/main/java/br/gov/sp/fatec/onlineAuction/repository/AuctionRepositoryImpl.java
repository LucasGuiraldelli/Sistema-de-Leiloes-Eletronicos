package br.gov.sp.fatec.onlineAuction.repository;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Auction;

public class AuctionRepositoryImpl implements AuctionRepository{

    private static AuctionRepositoryImpl instance;

    private Long auctionId = 0l; 
    private List<Auction> auctions;

    private AuctionRepositoryImpl(){
        auctions = new ArrayList<Auction>();
    }

    public static AuctionRepositoryImpl getInstance(){
        if(instance == null)
            instance = new AuctionRepositoryImpl();
        return instance;
    }

    @Override
    public Auction find(Auction auction) {
        int auctionPosition = auctions.indexOf(auction);
        return auctions.get(auctionPosition);
    }

    @Override
    public Auction add(Auction auction) {
        auction.setId(auctionId++);
        auctions.add(auction);
        return auction;
    }

    @Override
    public Auction update(Auction auction) {
        Auction persistedAuction = find(auction);
        persistedAuction = auction;
        return persistedAuction;
    }

    @Override
    public Auction remove(Auction auction) {
        Auction persistedAuction = find(auction);
        auctions.remove(persistedAuction);
        return persistedAuction;
    }

    @Override
    public List<Auction> findAll() {
        return auctions;
    }
    
}
