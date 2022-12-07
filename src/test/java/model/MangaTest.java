package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import dev.ifrs.model.Manga;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MangaTest {
    @Test
    @Order(1)
    @DisplayName("Teste com Manga / model")
    void testMangaIdMalId(){
        Manga u = new Manga();
        u.setId(5L);
        u.setMal_id("mal");
        Assertions.assertEquals(5L, u.getId());
        Assertions.assertEquals("mal", u.getMal_id());
    }

    @Test
    @Order(2)
    @DisplayName("Teste com Manga / model")
    void testMangaImageTitle(){
        Manga u = new Manga();
        u.setTitle("title");
        u.setImage_url("image");
        Assertions.assertEquals("title", u.getTitle());
        Assertions.assertEquals("image", u.getImage_url());
    }
    @Test
    @Order(3)
    @DisplayName("Teste com Manga / model")
    void testMangaUrl(){
        Manga u = new Manga(3l, "mal");
        u.setChapters("teste");
        u.setUrl("url.com");
        Assertions.assertEquals("teste", u.getChapters());
        Assertions.assertEquals("url.com", u.getUrl());
    }
}
