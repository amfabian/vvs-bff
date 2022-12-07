package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import dev.ifrs.model.Mensagem;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MensagemTest {

    @Test
    @Order(1)
    @DisplayName("Teste com Mensagem / model")
    void testMensagem(){
        Mensagem u = new Mensagem();
        u.setId(5L);
        Assertions.assertEquals(5L, u.getId());
    }

    @Test
    @Order(2)
    @DisplayName("Teste com Mensagem / model")
    void testMensagemTexto(){
        Mensagem u = new Mensagem(3L, "texto", "user");
        u.setTexto("teste");
        Assertions.assertEquals("teste", u.getTexto());
    }

    @Test
    @Order(3)
    @DisplayName("Teste com Mensagem / model")
    void testMensagemUser(){
        Mensagem u = new Mensagem();
        u.setUser_id("user");
        Assertions.assertEquals("user", u.getUser_id());
    }
    
}
