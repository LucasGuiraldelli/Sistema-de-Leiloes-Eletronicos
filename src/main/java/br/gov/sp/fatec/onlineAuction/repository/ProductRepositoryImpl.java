package br.gov.sp.fatec.onlineAuction.repository;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Product;
import br.gov.sp.fatec.onlineAuction.model.Realty;
import br.gov.sp.fatec.onlineAuction.model.RealtyType;
import br.gov.sp.fatec.onlineAuction.model.Vehicle;
import br.gov.sp.fatec.onlineAuction.model.VehicleType;

public class ProductRepositoryImpl implements RealtyRepository, VehicleRepository{

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
    public Product findByWord(String word) {
        for(Product p: products){
            
        }

        return null;
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
    public Vehicle findByType(VehicleType type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Realty findByType(RealtyType type) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
