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

import dev.ifrs.backendclients.MensagemBC;
import dev.ifrs.model.Mensagem;

@Path("/bff/mensagem")
public class MensagemBFF {

    @Inject
    @RestClient
    MensagemBC mensagembc;
    
    @POST
    @Path("/create")
    //@RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public Mensagem createBFF(@FormParam("anuncio_id") Long anuncio_id,
                                @FormParam("texto") String texto,
                                @FormParam("user_id") String user_id){
        return mensagembc.create(anuncio_id, texto, user_id);
    }

    @GET
    @Path("/list")
    //@RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public List<Mensagem> listBFF(){
        return mensagembc.list();
    }

    @GET
    @Path("/list/{id}")
    //@RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public Mensagem getUserBFF(@PathParam("id") Long id){
        return mensagembc.getMsg(id);
    }

    @DELETE
    @Path("/delete/{id}")
    //@RolesAllowed({"Admin", "User"})
    public void delete(@PathParam("id") Long id){
    mensagembc.delete(id);
    }

    @PUT
    @Path("/update/{id}")
    //@RolesAllowed({"Admin", "User"})
    @Produces(MediaType.APPLICATION_JSON)
    public Mensagem update(@PathParam("id") Long id, 
                             @FormParam("texto") String texto){
                                return mensagembc.update(id, texto);
                             }
}
