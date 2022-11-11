package dev.ifrs.backendclients;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import dev.ifrs.model.Manga;

@RegisterRestClient(baseUri = "http://localhost:8084/manga")
public interface MangaBC {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    public Manga create (@FormParam("mal_id") String mal_id,
                            @FormParam("image_url") String image_url,
                            @FormParam("title") String title,
                            @FormParam("url") String url,
                            @FormParam("chapters") String chapters);

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manga> list();

    @GET
    @Path("/list/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Manga getManga(@PathParam("id") Long id);

    @DELETE
    @Path("/delete/{id}")
    public void delete(@PathParam("id") Long id);

    @PUT
    @Path("/update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Manga update(@PathParam("id") Long id, @FormParam("login") String login,
                            @FormParam("mal_id") String mal_id);
}
