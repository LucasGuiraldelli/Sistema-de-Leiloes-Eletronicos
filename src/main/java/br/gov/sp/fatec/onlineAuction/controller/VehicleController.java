package br.gov.sp.fatec.onlineAuction.controller;

import br.gov.sp.fatec.onlineAuction.service.ProductService;
import br.gov.sp.fatec.onlineAuction.service.ProductServiceImpl;
import io.javalin.Javalin;

public class VehicleController implements JavalinController{
    
    private final String basePath = "/vehicle";

    private ProductService productService;

    public VehicleController(){
        productService = new ProductServiceImpl();
    }

    public void configure(Javalin app){

    }
}
