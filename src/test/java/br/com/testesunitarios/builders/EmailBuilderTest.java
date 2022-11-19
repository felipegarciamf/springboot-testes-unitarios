package br.com.testesunitarios.builders;

import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.EmailEntity;

public class EmailBuilderTest {
	
	

	public EmailBuilderTest() {
		this.endereco = "teste@gmail.com";
	}

	private String endereco;
	
	public EmailBuilderTest comEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}
	
	public EmailEntity build() {
		return new EmailEntity(endereco);
	}
	
}
