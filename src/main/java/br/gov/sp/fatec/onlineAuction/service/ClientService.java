package br.gov.sp.fatec.onlineAuction.service;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Client;

public interface ClientService {
    public List<Client> listClient();
    public Client getClient(Client client);
    public Client addClient(Client client);
    public Client updateClient(Client client);
    public Client removeClient(Client client);
}
