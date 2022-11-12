package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UsuarioJPA {



	public UsuarioJPA(String cpf, String nome, String sobrenome, EmailJPA email) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cpf;

	private String nome;

	private String sobrenome;

	
	@OneToOne(cascade = CascadeType.ALL)
	private EmailJPA email;

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

	public EmailJPA getEmail() {
		return email;
	}

	public void setEmail(EmailJPA email) {
		this.email = email;
	}



}
