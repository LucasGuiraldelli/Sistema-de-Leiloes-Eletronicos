package br.gov.sp.fatec.onlineAuction.repository;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;

public interface ProductRepository {
    public List<Product> findAll();
    public Product find(Product product);
    public Product add(Product product);
    public Product update(Product product);
    public Product remove(Product product);
}
