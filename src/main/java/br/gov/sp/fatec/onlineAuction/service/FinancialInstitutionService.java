package br.gov.sp.fatec.onlineAuction.service;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.FinancialInstitution;

public interface FinancialInstitutionService {
    public List<FinancialInstitution> listFinancialInstitution();
    public FinancialInstitution getFinancialInstitution(FinancialInstitution financialInstitution);
    public FinancialInstitution addFinancialInstitution(FinancialInstitution financialInstitution);
    public FinancialInstitution updateFinancialInstitution(FinancialInstitution financialInstitution);
    public FinancialInstitution removeFinancialInstitution(FinancialInstitution financialInstitution);
}
