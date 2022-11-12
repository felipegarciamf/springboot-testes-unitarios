package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioJPA;

public interface UsuarioJPARepository extends JpaRepository<UsuarioJPA, Long>{

}
