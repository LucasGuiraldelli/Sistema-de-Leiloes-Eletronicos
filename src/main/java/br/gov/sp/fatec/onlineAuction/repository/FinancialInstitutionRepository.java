package br.gov.sp.fatec.onlineAuction.repository;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.FinancialInstitution;

public interface FinancialInstitutionRepository {
    public List<FinancialInstitution> findAll();
    public FinancialInstitution find(FinancialInstitution financialInstitution);
    public FinancialInstitution add(FinancialInstitution financialInstitution);
    public FinancialInstitution update(FinancialInstitution financialInstitution);
    public FinancialInstitution remove(FinancialInstitution financialInstitution);
}
