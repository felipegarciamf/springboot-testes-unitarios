package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.interfaces.RepositorioDeUsuarios;
import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.utils.UsuarioConverter;


@Service
public class UsuarioRepositoryService implements RepositorioDeUsuarios {

	@Autowired
	private UsuarioJPARepository usuarioJPARepository;
	
	@Override
	public void cadastrarUsuario(Usuario usuarioDominio) {
		
		br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.Usuario converter = UsuarioConverter.usuarioConverter(usuarioDominio);
		
		usuarioJPARepository.save(converter);		
	}

}
