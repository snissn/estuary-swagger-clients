package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PinningApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.UtilHttpError;

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

@Path("/pinning")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-09-27T20:40:37.264153-10:00[Pacific/Honolulu]")public class PinningApi  {

   private PinningApiService delegate;

   protected PinningApi() {
   }

   @javax.inject.Inject
   public PinningApi(PinningApiService delegate) {
      this.delegate = delegate;
   }

    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pin status objects", description = "This endpoint lists all pin status objects", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsGet(securityContext);
    }
    @DELETE
    @Path("/pins/{pinid}")
    
    
    @Operation(summary = "Delete a pinned object", description = "This endpoint deletes a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {  })
    public Response pinningPinsPinidDelete(@Parameter(in = ParameterIn.PATH, description = "Pin ID",required=true) @PathParam("pinid") String pinid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPinidDelete(pinid,securityContext);
    }
    @GET
    @Path("/pins/{pinid}")
    
    
    @Operation(summary = "Get a pin status object", description = "This endpoint returns a pin status object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {  })
    public Response pinningPinsPinidGet(@Parameter(in = ParameterIn.PATH, description = "cid",required=true) @PathParam("pinid") String pinid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPinidGet(pinid,securityContext);
    }
    @POST
    @Path("/pins/{pinid}")
    
    
    @Operation(summary = "Replace a pinned object", description = "This endpoint replaces a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {  })
    public Response pinningPinsPinidPost(@Parameter(in = ParameterIn.PATH, description = "Pin ID",required=true) @PathParam("pinid") String pinid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPinidPost(pinid,securityContext);
    }
    @POST
    @Path("/pins")
    
    
    @Operation(summary = "Add and pin object", description = "This endpoint adds a pin to the IPFS daemon.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {  })
    public Response pinningPinsPost(@Parameter(in = ParameterIn.PATH, description = "cid",required=true) @PathParam("cid") String cid
,@Parameter(in = ParameterIn.PATH, description = "name",required=true) @PathParam("name") String name
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPost(cid,name,securityContext);
    }
}
