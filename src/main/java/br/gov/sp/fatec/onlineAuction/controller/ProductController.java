package br.gov.sp.fatec.onlineAuction.controller;

import br.gov.sp.fatec.onlineAuction.service.ProductService;
import br.gov.sp.fatec.onlineAuction.service.ProductServiceImpl;
import io.javalin.Javalin;

public class ProductController implements JavalinController{

    private final String basePath = "/product";

    private ProductService productService;

    public ProductController(){
        productService = new ProductServiceImpl();
    }

    public void configure(Javalin app) {
        // TODO Auto-generated method stub
    }
    
}
