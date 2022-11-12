package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.testesunitarios.builders.UsuarioBuilderTest;
import br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.modelo.Usuario;



@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class UsuarioJPARepositoryTest {

	@Value("${teste}")
	private String expiration;
	
	@Autowired
	private UsuarioJPARepository usuarioJPARepository;
	
	

	@Test
	void deveCadastrarUsuario() {
		
		System.out.println(expiration);
		
		Usuario usuario = new UsuarioBuilderTest().builder();
		usuarioJPARepository.save(usuario);
		assertThat(usuario.getCpf()).isEqualTo("40173586830");
		assertThat(usuario.getEmail().getEndereco()).isEqualTo("teste@gmail.com");
		assertThat(usuario.getNome()).isEqualTo("Silas");
		assertThat(usuario.getSobrenome()).isEqualTo("Garcia");
	}

}
