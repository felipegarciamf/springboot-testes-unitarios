package br.com.testesunitarios.usecase.onboarding.aplicacao.usuario.cadastrar;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.interfaces.RepositorioDeUsuarios;

public class CadastrarUsuario {

	private RepositorioDeUsuarios repositorioDeUsuarios;

	public void cadastrarUsuario(Usuario usuario) {
		repositorioDeUsuarios.cadastrarUsuario(usuario);
	}

}
