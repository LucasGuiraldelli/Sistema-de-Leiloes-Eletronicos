package br.gov.sp.fatec.onlineAuction.repository;

import br.gov.sp.fatec.onlineAuction.model.Client;

public interface ClientRepository {
    public Client find(Client client);
    public Client add(Client client);
    public Client update(Client client);
    public Client remove(Client client);
}
