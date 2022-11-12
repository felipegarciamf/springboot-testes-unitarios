package br.com.testesunitarios.usecase.onboarding.infra.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testesunitarios.usecase.onboarding.dominio.usuario.Usuario;

public interface UsuarioJPARepository extends JpaRepository<Usuario, Long>{

}
