package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.testesunitarios.builders.UsuarioBuilderTest;
import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.UsuarioEntity;



@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class UsuarioJPARepositoryTest {
	
	

	
	
	@BeforeEach
	public void init() {
		
	}
	
	@Autowired
	private UsuarioJPARepository usuarioJPARepository;
	
	

	@Test
	void deveCadastrarUsuario() {
				
		UsuarioEntity usuario = new UsuarioBuilderTest().builder();
		usuarioJPARepository.save(usuario);
		assertThat(usuario.getCpf()).isEqualTo("40173586830");
		assertThat(usuario.getEmail().getEndereco()).isEqualTo("teste@gmail.com");
		assertThat(usuario.getNome()).isEqualTo("Silas");
		assertThat(usuario.getSobrenome()).isEqualTo("Garcia");
	}

}
