package model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import dev.ifrs.model.Anuncio;
import dev.ifrs.model.Usuario;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class UsuarioTest {
    
    @Test
    @Order(1)
    @DisplayName("Teste com Usuario / model")
    void testUser(){
        Usuario u = new Usuario();
        u.setAdmin(true);
        u.isAdmin();
        u.setEmail("email");
        Assertions.assertEquals("email", u.getEmail());
    }

    @Test
    @Order(2)
    @DisplayName("Teste com Usuario / model")
    void testUser2(){
        Usuario u = new Usuario();
        u.setLogin("loginTest");
        u.setPassword("passw0rd");
        Assertions.assertEquals("passw0rd", u.getPassword());
        Assertions.assertEquals("loginTest", u.getLogin());
    }

    @Test
    @Order(3)
    @DisplayName("Teste com Usuario / model")
    void testUser3(){
        List<Anuncio> list = new ArrayList<>();
        Usuario u = new Usuario(2L, "login", "email",list );
        u.setAnuncios(list);
        u.setId(5L);
        Assertions.assertEquals(5L, u.getId());
        Assertions.assertEquals(list, u.getAnuncios());
    }
}
