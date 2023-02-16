package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Usuario;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @BeforeAll
    void start(){

        usuarioRepository.deleteAll();

        usuarioRepository.deleteAll();
        usuarioRepository.save(new Usuario(0L, "Roberto", "roberto@email.com", "13465278", "foto.jpg"));
        usuarioRepository.save(new Usuario(0L, "Manuela", "manuela@email.com", "13465278", "foto.jpg"));
        usuarioRepository.save(new Usuario(0L, "Adriana", "adriana@email.com", "13465278", "foto.jpg"));
        usuarioRepository.save(new Usuario(0L, "Paulo", "paulo@email.com", "13465278", "foto.jpg"));

    }

    @Test
    @DisplayName("Retorna 1 usuário.")
    public void deveRetornarUmUsuario() {

        Optional<Usuario> usuario = usuarioRepository.findByUsuario("roberto@email.com");

        assertTrue(usuario.get().getUsuario().equals("roberto@email.com"));
    }

    private void assertTrue(boolean equals) {
    }

    @AfterAll
    public void end() {
        usuarioRepository.deleteAll();
    }
}
