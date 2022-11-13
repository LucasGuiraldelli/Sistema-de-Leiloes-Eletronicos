package br.gov.sp.fatec.onlineAuction.controller;

import br.gov.sp.fatec.onlineAuction.service.ProductService;
import br.gov.sp.fatec.onlineAuction.service.ProductServiceImpl;
import io.javalin.Javalin;

public class RealtyController implements JavalinController{
    
    private final String basePath = "/realty";

    private ProductService productService;

    public RealtyController(){
        productService = new ProductServiceImpl();
    }

    public void configure(Javalin app){
        
    }
    
}
