package io.swagger.api;

import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pinning")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-09-27T20:40:46.691587-10:00[Pacific/Honolulu]")
public class PinningApi {

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
    public Response pinningPinsGet() {
        return Response.ok().entity("magic!").build();
    }
    @DELETE
    @Path("/pins/{pinid}")
    @Operation(summary = "Delete a pinned object", description = "This endpoint deletes a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
    })
    public Response pinningPinsPinidDelete( @PathParam("pinid")

 @Parameter(description = "Pin ID") String pinid
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/pins/{pinid}")
    @Operation(summary = "Get a pin status object", description = "This endpoint returns a pin status object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
    })
    public Response pinningPinsPinidGet( @PathParam("pinid")

 @Parameter(description = "cid") String pinid
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/pins/{pinid}")
    @Operation(summary = "Replace a pinned object", description = "This endpoint replaces a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
    })
    public Response pinningPinsPinidPost( @PathParam("pinid")

 @Parameter(description = "Pin ID") String pinid
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/pins")
    @Operation(summary = "Add and pin object", description = "This endpoint adds a pin to the IPFS daemon.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
    })
    public Response pinningPinsPost( @PathParam("cid")

 @Parameter(description = "cid") String cid
, @PathParam("name")

 @Parameter(description = "name") String name
) {
        return Response.ok().entity("magic!").build();
    }}
