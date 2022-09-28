package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.UtilHttpError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/pinning")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-09-27T20:40:44.339579-10:00[Pacific/Honolulu]")public interface PinningApi  {
   
    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pin status objects", description = "This endpoint lists all pin status objects", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response pinningPinsGet(@Context SecurityContext securityContext);

    @DELETE
    @Path("/pins/{pinid}")
    
    
    @Operation(summary = "Delete a pinned object", description = "This endpoint deletes a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
 })
    Response pinningPinsPinidDelete( @PathParam("pinid") String pinid,@Context SecurityContext securityContext);

    @GET
    @Path("/pins/{pinid}")
    
    
    @Operation(summary = "Get a pin status object", description = "This endpoint returns a pin status object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
 })
    Response pinningPinsPinidGet( @PathParam("pinid") String pinid,@Context SecurityContext securityContext);

    @POST
    @Path("/pins/{pinid}")
    
    
    @Operation(summary = "Replace a pinned object", description = "This endpoint replaces a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
 })
    Response pinningPinsPinidPost( @PathParam("pinid") String pinid,@Context SecurityContext securityContext);

    @POST
    @Path("/pins")
    
    
    @Operation(summary = "Add and pin object", description = "This endpoint adds a pin to the IPFS daemon.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
 })
    Response pinningPinsPost( @PathParam("cid") String cid, @PathParam("name") String name,@Context SecurityContext securityContext);

}
