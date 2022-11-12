package br.com.testesunitarios.builders;

import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.Email;

public class EmailBuilderTest {
	
	

	public EmailBuilderTest() {
		this.endereco = "teste@gmail.com";
	}

	private String endereco;
	
	public EmailBuilderTest comEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}
	
	public Email build() {
		return new Email(endereco);
	}
	
}
