package br.inatel.fredlaranjo.dm110.crm.ejb.client.interfaces;

import java.util.List;

import br.inatel.fredlaranjo.dm110.crm.api.model.ClientModel;

public interface Client {

	void addClient(ClientModel client);

	public List<ClientModel> getClients();

}
