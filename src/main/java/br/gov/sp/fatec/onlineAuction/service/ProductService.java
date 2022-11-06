package br.gov.sp.fatec.onlineAuction.service;

import br.gov.sp.fatec.onlineAuction.model.Auction;
import br.gov.sp.fatec.onlineAuction.model.Product;

public interface ProductService {
    public Product getProduct(Product product);
    public Product addProduct(Product product, Auction auction);
    public Product updateProduct(Product product);
    public Product removeProduct(Product product);
}
