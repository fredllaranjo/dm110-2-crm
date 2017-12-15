package br.inatel.fredlaranjo.dm110.crm.ejb.bean;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.fredlaranjo.dm110.crm.api.model.ClientModel;
import br.inatel.fredlaranjo.dm110.crm.ejb.client.interfaces.ClientLocal;
import br.inatel.fredlaranjo.dm110.crm.ejb.client.interfaces.ClientRemote;
import br.inatel.fredlaranjo.dm110.crm.ejb.converter.ClientConverter;
import br.inatel.fredlaranjo.dm110.crm.ejb.dao.ClientDAO;

@Stateless
@Remote(ClientRemote.class)
@Local(ClientLocal.class)
public class ClientBean implements ClientRemote, ClientLocal {

	@EJB
	private ClientDAO clientDAO;

	private ClientConverter clientConverter = new ClientConverter();

	@Override
	public void addClient(ClientModel client) {
		br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client clientEntity = clientConverter.convertToEntity()
				.apply(client);
		clientDAO.insert(clientEntity);

	}

	@Override
	public List<ClientModel> getClients() {
		return clientDAO.listAll().stream().map(clientConverter.convertToClient()).collect(Collectors.toList());
	}

}