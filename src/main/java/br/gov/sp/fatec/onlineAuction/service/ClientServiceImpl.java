package br.gov.sp.fatec.onlineAuction.service;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Client;
import br.gov.sp.fatec.onlineAuction.repository.ClientRepository;
import br.gov.sp.fatec.onlineAuction.repository.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{

    ClientRepository clientRepository;

    public ClientServiceImpl(){
        clientRepository = ClientRepositoryImpl.getInstance();
    }

    public List<Client> listClient() {
        return clientRepository.findAll();
    }

    public Client getClient(Client client) {
        return clientRepository.find(client);
    }

    public Client addClient(Client client) {
        return clientRepository.add(client);
    }

    public Client updateClient(Client client) {
        return clientRepository.update(client);
    }

    public Client removeClient(Client client) {
        return clientRepository.remove(client);
    }
    
}
