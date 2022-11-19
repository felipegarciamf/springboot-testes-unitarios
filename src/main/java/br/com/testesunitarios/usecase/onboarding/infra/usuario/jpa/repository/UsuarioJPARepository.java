package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioEntity;

public interface UsuarioJPARepository extends JpaRepository<UsuarioEntity, Long>{

}
