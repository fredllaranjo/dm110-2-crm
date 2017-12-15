package br.inatel.fredlaranjo.dm110.crm.ejb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_id_client", sequenceName = "seq_id_client", allocationSize = 1)
public class Client {

	@Id
	@GeneratedValue(generator = "seq_id_client", strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String nome;

	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
