package dev.ifrs.model;

import java.util.List;

public class Usuario {

    private Long id;
    private String login;
    private String email;
    private String password;
    private boolean admin;
    private List<Anuncio> anuncios;
    
    public Usuario(Long id, String login, String email, List<Anuncio> anuncios) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.anuncios = anuncios;
    }
    public Usuario() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Anuncio> getAnuncios() {
        return anuncios;
    }
    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
