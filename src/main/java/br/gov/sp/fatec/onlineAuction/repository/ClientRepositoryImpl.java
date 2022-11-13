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

    public Client find(Client client) {
        int clientPosition = clients.indexOf(client);
        return clients.get(clientPosition);
    }

    public Client add(Client client) {
        clients.add(client);
        return client;
    }

    public Client update(Client client) {
        Client persistedClient = find(client);
        persistedClient = client;
        return persistedClient;
    }

    public Client remove(Client client) {
        clients.remove(client);
        return client;
    }

    public List<Client> findAll() {
        return clients;
    }
    
}
