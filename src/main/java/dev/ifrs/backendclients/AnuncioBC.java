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

import dev.ifrs.model.Anuncio;

@RegisterRestClient(baseUri = "http://localhost:8084/anuncio")
public interface AnuncioBC {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    public Anuncio create (@FormParam("manga_id") Long manga_id,
                            @FormParam("user_id") Long user_id,
                            @FormParam("desc") String desc);

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Anuncio> list();

    @GET
    @Path("/list/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Anuncio getAnuncio(@PathParam("id") Long id);
    
    @DELETE
    @Path("/delete/{id}")
    public void delete(@PathParam("id") Long id);

    @PUT
    @Path("/update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Anuncio update(@PathParam("id") Long id, 
                            @FormParam("desc") String desc);

}
