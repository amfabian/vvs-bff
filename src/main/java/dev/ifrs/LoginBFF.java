package dev.ifrs;

import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import dev.ifrs.backendclients.LoginBC;

@Path("bff/login")
public class LoginBFF {

    @Inject
    @RestClient
    LoginBC loginBC;
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getJWT(@FormParam("name") String name, @FormParam("password") String email){
        
        return loginBC.getJWT(name, email);
    }

}
