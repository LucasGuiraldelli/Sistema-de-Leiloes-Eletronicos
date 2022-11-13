package br.gov.sp.fatec.onlineAuction.repository;

import java.util.List;

import br.gov.sp.fatec.onlineAuction.model.Client;

public interface ClientRepository {
    public List<Client> findAll();
    public Client find(Client client);
    public Client add(Client client);
    public Client update(Client client);
    public Client remove(Client client);
}
