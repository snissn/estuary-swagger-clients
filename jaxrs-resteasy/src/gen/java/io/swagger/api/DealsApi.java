package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DealsApiService;

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
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/deals")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-09-27T20:40:41.950348-10:00[Pacific/Honolulu]")public class DealsApi  {

    @Inject DealsApiService service;

    @GET
    @Path("/failures")
    
    
    @Operation(summary = "Get storage failures for user", description = "This endpoint returns a list of storage failures for user", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealsFailuresGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsFailuresGet(securityContext);
    }
    @POST
    @Path("/make/{miner}")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Make Deal", description = "This endpoint makes a deal for a given content and miner", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealsMakeMinerPost(@Parameter(description = "Deal Request" ,required=true) String body, @PathParam("miner") String miner,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsMakeMinerPost(body,miner,securityContext);
    }
    @GET
    @Path("/status/{deal}")
    
    
    @Operation(summary = "Get Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealsStatusDealGet( @PathParam("deal") Integer deal,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsStatusDealGet(deal,securityContext);
    }
}
