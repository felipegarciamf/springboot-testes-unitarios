package br.com.testesunitarios.builders;

import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.Usuario;

public class UsuarioBuilderTest {
	
	
	private Long id;

	private String cpf;

	private String nome;

	private String sobrenome;
	
	private String email;
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void builder() {
		return new Usuario(cpf, nome, sobrenome, null);
	}
	

}
