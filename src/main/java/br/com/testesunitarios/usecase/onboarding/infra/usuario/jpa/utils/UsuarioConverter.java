package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.utils;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.vos.Email;


public class UsuarioConverter {

	public static br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioEntity usuarioConverter(Usuario usuario) {
		br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.EmailEntity emailConverter = emailConverter(usuario.getEmail());
		return new br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getSobrenome(), emailConverter);

	}

	private static br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.EmailEntity emailConverter(Email email) {
		return new br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.EmailEntity(email.getEndereco());
	}

}
