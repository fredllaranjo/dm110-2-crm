package br.inatel.fredlaranjo.dm110.crm.api.model;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = 5430511629618442353L;
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
