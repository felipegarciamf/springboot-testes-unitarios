package br.com.testesunitarios.onboarding.infra.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testesunitarios.onboarding.dominio.usuario.Usuario;

public interface UsuarioJPARepository extends JpaRepository<Usuario, Long>{

}
