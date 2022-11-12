package br.com.testesunitarios.usecase.onboarding.dominio.usuario.dtos;

import java.util.ArrayList;
import java.util.List;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Email;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Telefone;


public class UsuarioDto {

	private String cpf;

	private String nome;

	private String sobrenome;

	private Email email;
	
	private List<Telefone> telefones = new ArrayList<Telefone>();

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

	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	
	
	
}
