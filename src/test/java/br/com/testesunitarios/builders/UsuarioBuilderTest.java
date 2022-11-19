package br.com.testesunitarios.builders;

import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioEntity;

public class UsuarioBuilderTest {

	public UsuarioBuilderTest() {
		this.cpf = "40173586830";
		this.nome = "Silas";
		this.sobrenome = "Garcia";
		this.email = "teste@gmail.com";
	}

	private String cpf;

	private String nome;

	private String sobrenome;

	private String email;

	public UsuarioBuilderTest comCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public UsuarioBuilderTest comNome(String nome) {
		this.nome = nome;
		return this;
	}

	public UsuarioBuilderTest comSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		return this;
	}
	
	public UsuarioBuilderTest comEmail(String email) {
		this.email = email;
		return this;
	}

	public UsuarioEntity builder() {
		return new UsuarioEntity(cpf, nome, sobrenome, new EmailBuilderTest().build());
	}

}
