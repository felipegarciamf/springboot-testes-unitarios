package br.com.testesunitarios.usecase.onboarding.dominio.usuario.dtos;

import java.util.ArrayList;
import java.util.List;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Email;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Telefone;

public class UsuarioForm {

	private String cpf;

	private String nome;

	private String sobrenome;

	private Email email;

	private List<Telefone> telefones = new ArrayList<Telefone>();

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

	public Usuario converter() {
		return new Usuario(cpf, nome, sobrenome, email, telefones);
	}

}
