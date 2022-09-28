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


import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/deals")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-09-27T20:40:44.339579-10:00[Pacific/Honolulu]")public interface DealsApi  {
   
    @GET
    @Path("/failures")
    
    
    @Operation(summary = "Get storage failures for user", description = "This endpoint returns a list of storage failures for user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealsFailuresGet(@Context SecurityContext securityContext);

    @POST
    @Path("/make/{miner}")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Make Deal", description = "This endpoint makes a deal for a given content and miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealsMakeMinerPost(@Parameter(description = "Deal Request" ,required=true) String body, @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @GET
    @Path("/status/{deal}")
    
    
    @Operation(summary = "Get Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealsStatusDealGet( @PathParam("deal") Integer deal,@Context SecurityContext securityContext);

}
