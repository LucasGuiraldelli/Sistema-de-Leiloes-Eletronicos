package br.gov.sp.fatec.onlineAuction.repository;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;

public class ProductRepositoryImpl implements ProductRepository{

    private static ProductRepositoryImpl instance;

    private Long productId = 0l; 
    private List<Product> products;

    private ProductRepositoryImpl(){
        products = new ArrayList<Product>();
    }

    public static ProductRepositoryImpl getInstance(){
        if(instance == null)
            instance = new ProductRepositoryImpl();
        return instance;
    }

    public Product find(Product product) {
        int productPosition = products.indexOf(product);
        return products.get(productPosition);
    }

    public Product add(Product product) {
        product.setId(++productId);
        products.add(product);
        return product;
    }

    public Product remove(Product product) {
        products.remove(product);
        return product;
    }

    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product update(Product product) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
