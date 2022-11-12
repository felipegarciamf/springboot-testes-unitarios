package br.com.testesunitarios.usecase.onboarding.infra.usuario.jpa.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class UsuarioJPARepositoryTest {

	
	
	@Autowired
	private UsuarioJPARepository usuarioJPARepository;
	
	

	@Test
	void deveCadastrarUsuario() {
		fail("Not yet implemented");
	}

}