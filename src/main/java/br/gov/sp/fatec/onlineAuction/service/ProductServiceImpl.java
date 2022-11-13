package br.gov.sp.fatec.onlineAuction.service;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;
import br.gov.sp.fatec.onlineAuction.repository.ProductRepository;
import br.gov.sp.fatec.onlineAuction.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    
    public ProductServiceImpl(){
        productRepository = ProductRepositoryImpl.getInstance();
    }

    public Product getProduct(Product product) {
        return productRepository.find(product);
    }

    public Product addProduct(Product product) {
        return productRepository.add(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.update(product);
    }

    public Product removeProduct(Product product) {
        return productRepository.remove(product);
    }

    @Override
    public List<Product> listProduct(Product product) {
        return productRepository.findAll();
    }
    
}
