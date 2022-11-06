package br.gov.sp.fatec.onlineAuction;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.gov.sp.fatec.onlineAuction.model.Client;

public class ClientTeste {
    
    @Test
    public void clientComparationInList(){
        Client client = new Client();
        client.setCpf("123");

        Client client2 = new Client();
        client2.setCpf("123");

        List<Client> clientList = new ArrayList<Client>();
        clientList.add(client);

        assertEquals(client, clientList.get(clientList.indexOf(client2)));
    }
}
