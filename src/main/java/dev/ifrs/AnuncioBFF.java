package dev.ifrs;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import dev.ifrs.backendclients.AnuncioBC;
import dev.ifrs.model.Anuncio;

@Path("/bff/anuncio")
public class AnuncioBFF {
    
    @Inject
    @RestClient
    AnuncioBC anunciobc;

    @POST
    @Path("/create")
    @RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public Anuncio createBFF(@FormParam ("manga_id") Long manga_id,
                                @FormParam("user_id") Long user_id,
                                @FormParam("desc") String desc){
        return anunciobc.create(manga_id, user_id, desc);
    }

    @GET
    @Path("/list")
    @RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public List<Anuncio> listBFF(){
        return anunciobc.list();
    }

    @GET
    @Path("/list/{id}")
    @RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public Anuncio getAnuncioBFF(@PathParam("id") Long id){
        return anunciobc.getAnuncio(id);
    }
    @DELETE
    @Path("/delete/{id}")
    @RolesAllowed({"Admin", "User"})
    public void delete(@PathParam("id") Long id){
        anunciobc.delete(id);
    }

    @PUT
    @Path("/update/{id}")
    @RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public Anuncio update(@PathParam("id") Long id, 
                            @FormParam("desc") String desc){
                                return anunciobc.update(id, desc);
                            }
}
