package br.com.testesunitarios.onboarding.dominio.usuario;

import java.util.ArrayList;
import java.util.List;

import br.com.testesunitarios.onboarding.dominio.usuario.vos.Email;
import br.com.testesunitarios.onboarding.dominio.usuario.vos.Telefone;

public class Usuario {

	private Long id;

	private String cpf;

	private String nome;

	private String sobrenome;

	private Email email;

	private List<Telefone> telefones = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}