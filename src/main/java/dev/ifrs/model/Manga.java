package dev.ifrs.model;

public class Manga {
    
    private Long id;
    private String mal_id;
    private String image_url;
    private String title;
    private String url;
    private String chapters;
    
public Manga() {
}
public Manga(Long id, String mal_id) {
    this.id = id;
    this.mal_id = mal_id;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getMal_id() {
    return mal_id;
}
public void setMal_id(String mal_id) {
    this.mal_id = mal_id;
}
public String getImage_url() {
    return image_url;
}
public void setImage_url(String image_url) {
    this.image_url = image_url;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getUrl() {
    return url;
}
public void setUrl(String url) {
    this.url = url;
}
public String getChapters() {
    return chapters;
}
public void setChapters(String chapters) {
    this.chapters = chapters;
}
   

    
}
