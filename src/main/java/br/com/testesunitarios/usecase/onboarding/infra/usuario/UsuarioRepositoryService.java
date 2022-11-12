package br.com.testesunitarios.usecase.onboarding.infra.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.interfaces.RepositorioDeUsuarios;


@Service
public class UsuarioRepositoryService implements RepositorioDeUsuarios {

	@Autowired
	private UsuarioJPARepository usuarioJPARepository;
	
	@Override
	public void cadastrarUsuario(Usuario usuario) {
		usuarioJPARepository.save(usuario);		
	}

}
