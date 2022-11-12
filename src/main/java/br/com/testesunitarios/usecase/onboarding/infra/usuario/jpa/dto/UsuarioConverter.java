package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.dto;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Email;
import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.EmailJPA;
import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioJPA;

public class UsuarioConverter {

	public static UsuarioJPA usuarioConverter(Usuario usuario) {

		EmailJPA emailConverter = emailConverter(usuario.getEmail());

		return new UsuarioJPA(usuario.getCpf(), usuario.getNome(), usuario.getSobrenome(), emailConverter);

	}

	private static EmailJPA emailConverter(Email email) {
		return new EmailJPA(email.getEndereco());
	}

}
