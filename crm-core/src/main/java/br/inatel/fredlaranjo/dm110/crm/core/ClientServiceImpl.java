package br.inatel.fredlaranjo.dm110.crm.core;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.fredlaranjo.dm110.crm.api.ClientService;
import br.inatel.fredlaranjo.dm110.crm.api.model.ClientModel;
import br.inatel.fredlaranjo.dm110.crm.ejb.client.interfaces.ClientRemote;

@RequestScoped
public class ClientServiceImpl implements ClientService {

	@EJB(lookup = "java:app/crm-ejb-0.1-SNAPSHOT/ClientBean!br.inatel.fredlaranjo.dm110.crm.ejb.client.interfaces.ClientRemote")
	private ClientRemote client;

	@Override
	public List<ClientModel> getClients() {
		return client.getClients();
	}

	@Override
	public void addClient(ClientModel clientModel) {
		client.addClient(clientModel);
	}

}
