package br.gov.sp.fatec.onlineAuction.controller;

import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import br.gov.sp.fatec.onlineAuction.model.Auction;
import br.gov.sp.fatec.onlineAuction.model.FinancialInstitution;
import br.gov.sp.fatec.onlineAuction.service.AuctionService;
import br.gov.sp.fatec.onlineAuction.service.AuctionServiceImpl;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class AuctionController implements JavalinController{
    
    private final String basePath = "/auction";

    private AuctionService auctionService;

    public AuctionController(){
        auctionService = new AuctionServiceImpl();
    }

    public void configure(Javalin app){
        app.get(basePath, this::getAuction);
        app.post(basePath, this::postAuction);
        app.delete(basePath, this::deleteAuction);
    }
    
    public void getAuction(Context ctx){
        String idQuery = ctx.queryParam("id");
        JSONObject responseJson = new JSONObject();

        if(idQuery != null){
            Auction auction = new Auction();
            auction.setId(Long.parseLong(idQuery));

            auction = auctionService.getAuction(auction);

            responseJson.put("description", auction.getDescription());
            responseJson.put("start", auction.getStart().toString());
            responseJson.put("end", auction.getEnd().toString());
        } else {
            JSONArray auctionResponseList = new JSONArray();

            for(Auction a: auctionService.listAuction()){
                JSONObject auctionObj = new JSONObject();
                responseJson.put("description", a.getDescription());
                responseJson.put("start", a.getStart().toString());
                responseJson.put("end", a.getEnd().toString());
                
                auctionResponseList.put(auctionObj);
            }

            responseJson.put("leilões", auctionResponseList);
        }

        ctx.json(responseJson.toString());
    }

    public void postAuction(Context ctx){
        JSONObject requestJson = new JSONObject(ctx.body());

        Auction auction = new Auction();
        auction.setDescription(requestJson.getString("descricao"));
        auction.setStart(new Date(requestJson.getString("dataInicial")));
        auction.setEnd(new Date(requestJson.getString("dataFinal")));
        
        FinancialInstitution financialInstitution = new FinancialInstitution();
        financialInstitution.setCnpj(requestJson.getString("instituicao-financeira"));

        auction.setFinancialInstitution(financialInstitution);

        auction = auctionService.addAuction(auction);
        
        JSONObject responseJson = new JSONObject("{}");
        responseJson.put("id", auction.getId());
        responseJson.put("descricao", auction.getDescription());
        responseJson.put("dataInicial", auction.getStart());
        responseJson.put("dataFinal", auction.getEnd());

        ctx.json(responseJson.toString());
    }

    public void deleteAuction(Context ctx){
        JSONObject requestJson = new JSONObject(ctx.body());

        Auction auction = new Auction();
        auction.setId(requestJson.getLong("id"));

        auction = auctionService.removeAuction(auction);
        
        JSONObject responseJson = new JSONObject("{}");
        responseJson.put("id", auction.getId());
        responseJson.put("descricao", auction.getDescription());
        responseJson.put("dataInicial", auction.getStart());
        responseJson.put("dataFinal", auction.getEnd());

        ctx.json(responseJson.toString());
    }

}
