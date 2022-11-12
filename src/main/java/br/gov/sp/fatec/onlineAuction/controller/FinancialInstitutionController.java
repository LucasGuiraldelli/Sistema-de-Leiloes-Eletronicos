package br.gov.sp.fatec.onlineAuction.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import br.gov.sp.fatec.onlineAuction.model.FinancialInstitution;
import br.gov.sp.fatec.onlineAuction.service.FinancialInstitutionService;
import br.gov.sp.fatec.onlineAuction.service.FinancialInstitutionServiceImpl;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class FinancialInstitutionController implements JavalinController{

    private final String basePath = "/instituicao-financeira";

    private FinancialInstitutionService financialInstitutionService;

    public FinancialInstitutionController(){
        financialInstitutionService = new FinancialInstitutionServiceImpl();
    }

    public void configure(Javalin app) {
        app.get(basePath, this::getFinancialInstitution);
        app.post(basePath, this::postFinancialInstitution);
    }

    public void getFinancialInstitution(Context ctx){
        String cnpjQuery = ctx.queryParam("cnpj");
        JSONObject responseJson = new JSONObject();

        if(cnpjQuery != null){
            FinancialInstitution financialInstitution = new FinancialInstitution();
            financialInstitution.setCnpj(cnpjQuery);
            
            financialInstitution = financialInstitutionService.getFinancialInstitution(financialInstitution);
    
            responseJson.put("cnpj", financialInstitution.getCnpj());
            responseJson.put("razaoSocial", financialInstitution.getCompanyName());
            responseJson.put("nomeFantasia", financialInstitution.getTradingName());
    
        } else {
            JSONArray financialInstitutionResponseList = new JSONArray();

            for(FinancialInstitution f: financialInstitutionService.listFinancialInstitution()){
                JSONObject financialInstitutionObj = new JSONObject();
                financialInstitutionObj.put("cnpj", f.getCnpj());
                financialInstitutionObj.put("razaoSocial", f.getCompanyName());
                financialInstitutionObj.put("nomeFantasia", f.getTradingName());
                
                financialInstitutionResponseList.put(financialInstitutionObj);
            }

            responseJson.put("instituicoesFinanceiras", financialInstitutionResponseList);
        }

        ctx.json(responseJson.toString());
    }

    public void postFinancialInstitution(Context ctx){
        JSONObject requestJson = new JSONObject(ctx.body());

        FinancialInstitution financialInstitution = new FinancialInstitution();
        financialInstitution.setCnpj(requestJson.getString("cnpj"));
        financialInstitution.setCompanyName(requestJson.getString("razaoSocial"));
        financialInstitution.setTradingName(requestJson.getString("nomeFantasia"));

        financialInstitution = financialInstitutionService.addFinancialInstitution(financialInstitution);
        
        JSONObject responseJson = new JSONObject("{}");
        responseJson.put("cnpj", financialInstitution.getCnpj());
        responseJson.put("razaoSocial", financialInstitution.getCompanyName());
        responseJson.put("nomeFantasia", financialInstitution.getTradingName());

        ctx.json(responseJson.toString());
    }

    public void deleteFinancialInstitution(Context ctx){
        JSONObject requestJson = new JSONObject(ctx.body());

        FinancialInstitution financialInstitution = new FinancialInstitution();
        financialInstitution.setCnpj(requestJson.getString("cnpj"));

        financialInstitution = financialInstitutionService.removeFinancialInstitution(financialInstitution);
        
        JSONObject responseJson = new JSONObject("{}");
        responseJson.put("cnpj", financialInstitution.getCnpj());
        responseJson.put("razaoSocial", financialInstitution.getCompanyName());
        responseJson.put("nomeFantasia", financialInstitution.getTradingName());

        ctx.json(responseJson.toString());
    }
    
}
