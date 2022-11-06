package br.gov.sp.fatec.onlineAuction.service;

import br.gov.sp.fatec.onlineAuction.model.Client;

public interface ClientService {
    public Client getClient(Client client);
    public Client addClient(Client client);
    public Client updateClient(Client client);
    public Client removeClient(Client client);
}
