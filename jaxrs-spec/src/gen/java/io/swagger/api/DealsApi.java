package io.swagger.api;


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

@Path("/deals")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-09-27T20:40:46.691587-10:00[Pacific/Honolulu]")
public class DealsApi {

    @GET
    @Path("/failures")
    @Operation(summary = "Get storage failures for user", description = "This endpoint returns a list of storage failures for user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealsFailuresGet() {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/make/{miner}")
    @Consumes({ "*/*" })
    @Operation(summary = "Make Deal", description = "This endpoint makes a deal for a given content and miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealsMakeMinerPost(@Valid String body, @PathParam("miner")

 @Parameter(description = "Miner") String miner
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/status/{deal}")
    @Operation(summary = "Get Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealsStatusDealGet( @PathParam("deal")

 @Parameter(description = "Deal ID") Integer deal
) {
        return Response.ok().entity("magic!").build();
    }}
