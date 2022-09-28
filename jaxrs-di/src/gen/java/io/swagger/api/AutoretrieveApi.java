package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AutoretrieveApiService;

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

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/autoretrieve")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-09-27T20:40:37.264153-10:00[Pacific/Honolulu]")public class AutoretrieveApi  {

   private AutoretrieveApiService delegate;

   protected AutoretrieveApi() {
   }

   @javax.inject.Inject
   public AutoretrieveApi(AutoretrieveApiService delegate) {
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
