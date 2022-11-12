package br.gov.sp.fatec.onlineAuction.repository;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;

public class ProductRepositoryImpl implements ProductRepository{

    private static ProductRepositoryImpl instance;

    private List<Product> products;

    private ProductRepositoryImpl(){
        products = new ArrayList<Product>();
    }

    public static ProductRepositoryImpl getInstance(){
        if(instance == null)
            instance = new ProductRepositoryImpl();
        return instance;
    }

    @Override
    public Product find(Product product) {
        int productPosition = products.indexOf(product);
        return products.get(productPosition);
    }

    @Override
    public Product findByPrice(Double min, Double max) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product add(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product remove(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product findByWord(String word) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product findByType(String type) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
