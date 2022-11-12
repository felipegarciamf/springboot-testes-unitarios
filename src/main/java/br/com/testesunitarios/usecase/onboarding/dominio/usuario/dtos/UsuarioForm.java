package br.com.testesunitarios.usecase.onboarding.dominio.usuario.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Email;

public class UsuarioForm {

	private String cpf;

	private String nome;

	private String sobrenome;

	@JsonProperty("endereco_email")
	private String enderecoEmail;


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


	public Usuario converter() {
		Email email = new Email(enderecoEmail);
		return new Usuario(cpf, nome, sobrenome, email);
	}

}
