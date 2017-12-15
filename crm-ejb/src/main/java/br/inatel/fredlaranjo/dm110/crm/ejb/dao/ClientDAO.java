package br.inatel.fredlaranjo.dm110.crm.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.fredlaranjo.dm110.crm.ejb.entity.Client;

@Stateless
public class ClientDAO {

	@PersistenceContext(unitName = "crm")
	private EntityManager em;

	public List<Client> listAll() {
		return em.createQuery("from Client c", Client.class).getResultList();
	}

	public void insert(Client client) {
		em.persist(client);
	}

}