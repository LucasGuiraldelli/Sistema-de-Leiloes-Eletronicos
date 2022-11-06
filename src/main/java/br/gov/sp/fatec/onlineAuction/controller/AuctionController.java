package br.gov.sp.fatec.onlineAuction.controller;

import br.gov.sp.fatec.onlineAuction.model.Auction;
import br.gov.sp.fatec.onlineAuction.service.AuctionService;
import br.gov.sp.fatec.onlineAuction.service.AuctionServiceImpl;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class AuctionController implements JavalinController{

    private AuctionService auctionService;
    
    private final String basePath = "/auction";

    public AuctionController(){
        auctionService = new AuctionServiceImpl();
    }

    public void configure(Javalin app){
        app.get(basePath, this::getAuction);
        app.post(basePath, this::postAuction);
        app.put(basePath, this::putAuction);
        app.delete(basePath, this::deleteAuction);
    }
    
    public void getAuction(Context ctx){

        Auction auction = new Auction();
        auctionService.getAuction(auction);
        
        ctx.result("Teste");
    }

    public void postAuction(Context ctx){

    }

    public void putAuction(Context ctx){
        
    }

    public void deleteAuction(Context ctx){
        
    }

}
