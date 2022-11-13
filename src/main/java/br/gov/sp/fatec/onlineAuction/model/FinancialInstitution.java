package br.gov.sp.fatec.onlineAuction.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FinancialInstitution {

    private String cnpj;
    private String companyName;
    private String tradingName;

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;

        if(!(o instanceof FinancialInstitution))
            return false;

            FinancialInstitution f = (FinancialInstitution) o;

        return f.getCnpj().equals(cnpj);
    }
    
}
