package br.gov.sp.fatec.onlineAuction.repository;

import br.gov.sp.fatec.onlineAuction.model.Product;

public interface ProductRepository {
    public Product find(Product product);
    public Product findByWord(String word);
    public Product findByPrice(Double min, Double max);
    public Product add(Product product);
    public Product remove(Product product);
}
