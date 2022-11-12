package br.com.testesunitarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;
import br.com.testesunitarios.usecase.onboarding.dominio.usuario.dtos.UsuarioForm;
import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.repository.UsuarioRepositoryService;

@RestController("/usuario")
public class AlunoController {

	
	@Autowired
	private UsuarioRepositoryService usuarioRepositoryService;
	
	
	@PostMapping
	public void cadastroUsuario(@RequestBody UsuarioForm usuarioForm) {
		Usuario usuario = usuarioForm.converter();
		usuarioRepositoryService.cadastrarUsuario(usuario);
	}
	
}
