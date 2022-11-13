package br.gov.sp.fatec.onlineAuction.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import br.gov.sp.fatec.onlineAuction.model.Client;
import br.gov.sp.fatec.onlineAuction.service.ClientService;
import br.gov.sp.fatec.onlineAuction.service.ClientServiceImpl;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class ClientController implements JavalinController{

    private final String basePath = "/client";

    private ClientService clientService;

    public ClientController(){
        clientService = new ClientServiceImpl();
    }

    public void configure(Javalin app){
        app.get(basePath, this::getClient);
        app.post(basePath, this::postClient);
        app.delete(basePath, this::deleteClient);
    }

    public void getClient(Context ctx){
        String cpfQuery = ctx.queryParam("cpf");
        JSONObject responseJson = new JSONObject();

        if(cpfQuery != null){
            Client client = new Client();
            client.setCpf(cpfQuery);

            client = clientService.getClient(client);

            responseJson.put("cpf", client);
            responseJson.put("nome", client);
        } else {
            JSONArray clientResponseList = new JSONArray();

            for(Client c: clientService.listClient()){
                JSONObject clientObj = new JSONObject();
                clientObj.put("cpf", c.getCpf());
                clientObj.put("razanomeoSocial", c.getName());
                
                clientResponseList.put(clientObj);
            }

            responseJson.put("clientes", clientResponseList);
        }

        ctx.json(responseJson.toString());
    }
    
    public void postClient(Context ctx){
        JSONObject requestJson = new JSONObject(ctx.body());

        Client client = new Client();
        client.setCpf(requestJson.getString("cpf"));
        client.setName(requestJson.getString("nome"));

        client = clientService.addClient(client);
        
        JSONObject responseJson = new JSONObject("{}");
        responseJson.put("cpf", client.getCpf());
        responseJson.put("nome", client.getName());

        ctx.json(responseJson.toString());
    }

    public void deleteClient(Context ctx){
        JSONObject requestJson = new JSONObject(ctx.body());

        Client client = new Client();
        client.setCpf(requestJson.getString("cpf"));

        client = clientService.removeClient(client);
        
        JSONObject responseJson = new JSONObject("{}");
        responseJson.put("cpf", client.getCpf());
        responseJson.put("nome", client.getName());

        ctx.json(responseJson.toString());
    }
}
