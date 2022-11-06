package br.gov.sp.fatec.onlineAuction.repository;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Client;

public class ClientRepositoryImpl implements ClientRepository {

    private static ClientRepositoryImpl instance;

    private List<Client> clients;

    private ClientRepositoryImpl() {
        clients = new ArrayList<Client>();
    }

    public static ClientRepositoryImpl getInstance(){
        if(instance == null)
            instance = new ClientRepositoryImpl();
        return instance;
    }

    @Override
    public Client find(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Client add(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Client update(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Client remove(Client client) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
