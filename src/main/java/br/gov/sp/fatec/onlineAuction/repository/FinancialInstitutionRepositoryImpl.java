package br.gov.sp.fatec.onlineAuction.repository;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.FinancialInstitution;

public class FinancialInstitutionRepositoryImpl implements FinancialInstitutionRepository{

    private static FinancialInstitutionRepositoryImpl instance;

    private List<FinancialInstitution> financialInstitutions;

    private FinancialInstitutionRepositoryImpl(){
        financialInstitutions = new ArrayList<FinancialInstitution>();
    }

    public static FinancialInstitutionRepositoryImpl getInstance(){
        if(instance == null)
            instance = new FinancialInstitutionRepositoryImpl();
        return instance;
    }

    public FinancialInstitution find(FinancialInstitution financialInstitution) {
        int financialInstitutionPosition = financialInstitutions.indexOf(financialInstitution);
        return financialInstitutions.get(financialInstitutionPosition);
    }

    public List<FinancialInstitution> findAll() {
        return financialInstitutions;
    }

    public FinancialInstitution add(FinancialInstitution financialInstitution) {
        financialInstitutions.add(financialInstitution);
        return financialInstitution;
    }

    public FinancialInstitution update(FinancialInstitution financialInstitution) {
        FinancialInstitution persistedfinancialInstitution = find(financialInstitution);
        persistedfinancialInstitution = financialInstitution;
        return persistedfinancialInstitution;
    }

    public FinancialInstitution remove(FinancialInstitution financialInstitution) {
        financialInstitutions.remove(financialInstitution);
        return financialInstitution;
    }
    
}
