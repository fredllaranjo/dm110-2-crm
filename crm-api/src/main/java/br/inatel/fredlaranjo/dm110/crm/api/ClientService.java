package br.inatel.fredlaranjo.dm110.crm.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.inatel.fredlaranjo.dm110.crm.api.model.ClientModel;

@Path("/client")
public interface ClientService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<ClientModel> getClients();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	void addClient(ClientModel client);

}
