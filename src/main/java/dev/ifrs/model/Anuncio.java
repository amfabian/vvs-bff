package dev.ifrs.model;

import java.util.List;

public class Anuncio {

    private Long id;
    private Manga manga;
    private String aval;
    private String descricao;
    private List<Mensagem> mensagens;
    
    public Anuncio(Long id, Manga manga, String aval, String descricao, List<Mensagem> mensagens) {
        this.id = id;
        this.manga = manga;
        this.aval = aval;
        this.descricao = descricao;
        this.mensagens = mensagens;
    }
    public Anuncio() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Manga getManga() {
        return manga;
    }
    public void setManga(Manga manga) {
        this.manga = manga;
    }
    public String getAval() {
        return aval;
    }
    public void setAval(String aval) {
        this.aval = aval;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Mensagem> getMensagens() {
        return mensagens;
    }
    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
    
    
}
