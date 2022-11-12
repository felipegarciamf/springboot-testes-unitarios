package br.com.testesunitarios.usecase.onboarding.dominio.usuario.dtos;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Email;


public class UsuarioDto {

	private String cpf;

	private String nome;

	private String sobrenome;

	private Email email;
	

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public Email getEmail() {
		return email;
	}
	
	
	
	
}
