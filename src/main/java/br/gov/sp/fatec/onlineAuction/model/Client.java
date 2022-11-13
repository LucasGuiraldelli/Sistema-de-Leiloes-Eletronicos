package br.gov.sp.fatec.onlineAuction.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Client {
    
    private String cpf;
    private String name;

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;

        if(!(o instanceof Client))
            return false;

        Client c = (Client) o;

        return c.getCpf().equals(cpf);
    }

}
