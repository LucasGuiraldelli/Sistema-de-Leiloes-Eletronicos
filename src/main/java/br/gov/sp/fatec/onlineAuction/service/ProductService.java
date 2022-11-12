package br.gov.sp.fatec.onlineAuction.service;

import br.gov.sp.fatec.onlineAuction.model.Product.Product;

public interface ProductService {
    public Product getProduct(Product product);
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public Product removeProduct(Product product);
}
