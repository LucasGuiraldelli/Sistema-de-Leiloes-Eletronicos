package br.gov.sp.fatec.onlineAuction.service;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;
import br.gov.sp.fatec.onlineAuction.repository.ProductRepository;
import br.gov.sp.fatec.onlineAuction.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    
    public ProductServiceImpl(){
        productRepository = ProductRepositoryImpl.getInstance();
    }

    @Override
    public Product getProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product removeProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
