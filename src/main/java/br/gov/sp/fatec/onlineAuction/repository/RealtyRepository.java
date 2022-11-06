package br.gov.sp.fatec.onlineAuction.repository;

import br.gov.sp.fatec.onlineAuction.model.Realty;
import br.gov.sp.fatec.onlineAuction.model.RealtyType;

public interface RealtyRepository extends ProductRepository{
    public Realty findByType(RealtyType type);
}
