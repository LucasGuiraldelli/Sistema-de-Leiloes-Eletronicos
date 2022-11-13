package br.gov.sp.fatec.onlineAuction.service;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.FinancialInstitution;
import br.gov.sp.fatec.onlineAuction.repository.FinancialInstitutionRepository;
import br.gov.sp.fatec.onlineAuction.repository.FinancialInstitutionRepositoryImpl;

public class FinancialInstitutionServiceImpl implements FinancialInstitutionService{

    private FinancialInstitutionRepository financialInstitutionRepository;

    public FinancialInstitutionServiceImpl(){
        financialInstitutionRepository = FinancialInstitutionRepositoryImpl.getInstance();
    }

    public List<FinancialInstitution> listFinancialInstitution() {
        return financialInstitutionRepository.findAll();
    }

    public FinancialInstitution getFinancialInstitution(FinancialInstitution financialInstitution) {
        return financialInstitutionRepository.find(financialInstitution);
    }

    public FinancialInstitution addFinancialInstitution(FinancialInstitution financialInstitution) {
        return financialInstitutionRepository.add(financialInstitution);
    }

    public FinancialInstitution updateFinancialInstitution(FinancialInstitution financialInstitution) {
        return financialInstitutionRepository.update(financialInstitution);
    }

    public FinancialInstitution removeFinancialInstitution(FinancialInstitution financialInstitution) {
        return financialInstitutionRepository.remove(financialInstitution);
    }
    
}
