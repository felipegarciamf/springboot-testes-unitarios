package br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos;

import javax.persistence.OneToOne;

import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioJPA;

public class Email {

	
	private String endereco;
	
	@OneToOne
	private UsuarioJPA usuario;
	
	public Email(String endereco) {
		if (endereco == null || 
				!endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail invalido!");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
	
	
	
}
