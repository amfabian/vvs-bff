package model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import dev.ifrs.model.Anuncio;
import dev.ifrs.model.Manga;
import dev.ifrs.model.Mensagem;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class AnuncioTest {
    @Test
    @Order(1)
    @DisplayName("Teste com Usuario / model")
    void testUser(){
        Anuncio u = new Anuncio();
        u.setId(5L);
        Manga manga = new Manga();
        u.setManga(manga);
        Assertions.assertSame(manga, u.getManga());
        Assertions.assertEquals(5L, u.getId());
    }

    @Test
    @Order(2)
    @DisplayName("Teste com Usuario / model")
    void testUser2(){
        Anuncio u = new Anuncio();
        u.setAval("avaliacao");
        u.setDescricao("descricao");
        Assertions.assertEquals("avaliacao", u.getAval());
        Assertions.assertEquals("descricao", u.getDescricao());
    }

    @Test
    @Order(3)
    @DisplayName("Teste com Usuario / model")
    void testUser3(){
        List<Mensagem> list = new ArrayList<>();
        Anuncio u = new Anuncio(2L, new Manga(), "avaliacao","descricao", list);
        u.setMensagens(list);
        Assertions.assertEquals(list, u.getMensagens());
    }

}
