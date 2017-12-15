package br.inatel.fredlaranjo.dm110.crm.ejb.converter;

import java.util.function.Function;

import br.inatel.fredlaranjo.dm110.crm.api.model.ClientModel;

public class ClientConverter {

	public Function<ClientModel, br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client> convertToEntity() {
		return new Function<ClientModel, br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client>() {

			@Override
			public br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client apply(ClientModel client) {
				br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client clientEntity = new br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client();
				clientEntity.setNome(client.getNome());
				clientEntity.setEmail(client.getEmail());

				return clientEntity;
			}
		};
	}

	public Function<br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client, ClientModel> convertToClient() {
		return new Function<br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client, ClientModel>() {

			@Override
			public ClientModel apply(br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client clientEntity) {
				ClientModel client = new ClientModel();
				client.setId(clientEntity.getId());
				client.setNome(clientEntity.getNome());
				client.setEmail(clientEntity.getEmail());

				return client;
			}
		};
	}

}
