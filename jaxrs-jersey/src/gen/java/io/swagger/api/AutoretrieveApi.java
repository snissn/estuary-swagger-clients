package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AutoretrieveApiService;
import io.swagger.api.factories.AutoretrieveApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/autoretrieve")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public class AutoretrieveApi  {
   private final AutoretrieveApiService delegate;

   public AutoretrieveApi(@Context ServletConfig servletContext) {
      AutoretrieveApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AutoretrieveApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AutoretrieveApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AutoretrieveApiServiceFactory.getAutoretrieveApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/heartbeat")
    
    
    @Operation(summary = "Marks autoretrieve server as up", description = "This endpoint updates the lastConnection field for autoretrieve", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public Response autoretrieveHeartbeatPost(
@Parameter(in = ParameterIn.HEADER, description = "Autoretrieve's auth token" ,required=true)@HeaderParam("token") String token

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.autoretrieveHeartbeatPost(token,securityContext);
    }
}
