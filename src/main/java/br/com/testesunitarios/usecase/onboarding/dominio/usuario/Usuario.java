package br.com.testesunitarios.usecase.onboarding.dominio.usuario;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Email;

public class Usuario {

	public Usuario(String cpf, String nome, String sobrenome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}

	private Long id;

	private String cpf;

	private String nome;

	private String sobrenome;

	private Email email;

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

}
