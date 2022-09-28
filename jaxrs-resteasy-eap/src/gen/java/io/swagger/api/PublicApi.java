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
@Path("/public")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-09-27T20:40:44.339579-10:00[Pacific/Honolulu]")public interface PublicApi  {
   
    @GET
    @Path("/by-cid/{cid}")
    
    
    @Operation(summary = "Get Content by Cid", description = "This endpoint returns the content associated with a CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = {
 })
    Response publicByCidCidGet( @PathParam("cid") String cid,@Context SecurityContext securityContext);

    @GET
    @Path("/deals/failures")
    
    
    @Operation(summary = "Get storage failures", description = "This endpoint returns a list of storage failures", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response publicDealsFailuresGet(@Context SecurityContext securityContext);

    @GET
    @Path("/info")
    
    
    @Operation(summary = "Get public node info", description = "This endpoint returns information about the node", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = {
 })
    Response publicInfoGet(@Context SecurityContext securityContext);

    @GET
    @Path("/metrics/deals-on-chain")
    
    
    @Operation(summary = "Get deal metrics", description = "This endpoint is used to get deal metrics", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "metrics" })
    @ApiResponses(value = {
 })
    Response publicMetricsDealsOnChainGet(@Context SecurityContext securityContext);

    @GET
    @Path("/miners/deals/{miner}")
    
    
    @Operation(summary = "Get all miners deals", description = "This endpoint returns all miners deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "miner" })
    @ApiResponses(value = {
 })
    Response publicMinersDealsMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @GET
    @Path("/miners/failures/{miner}")
    
    
    @Operation(summary = "Get all miners", description = "This endpoint returns all miners", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = {
 })
    Response publicMinersFailuresMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @GET
    @Path("/miners")
    
    
    @Operation(summary = "Get all miners", description = "This endpoint returns all miners", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = {
 })
    Response publicMinersGet(@Context SecurityContext securityContext);

    @GET
    @Path("/miners/stats/{miner}")
    
    
    @Operation(summary = "Get miner stats", description = "This endpoint returns miner stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "miner" })
    @ApiResponses(value = {
 })
    Response publicMinersStatsMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @GET
    @Path("/miners/storage/query/{miner}")
    
    
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response publicMinersStorageQueryMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @GET
    @Path("/net/addrs")
    
    @Produces({ "application/json" })
    @Operation(summary = "Net Addrs", description = "This endpoint is used to get net addrs", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))))
         })
    Response publicNetAddrsGet(@Context SecurityContext securityContext);

    @GET
    @Path("/net/peers")
    
    @Produces({ "application/json" })
    @Operation(summary = "Net Peers", description = "This endpoint is used to get net peers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))))
         })
    Response publicNetPeersGet(@Context SecurityContext securityContext);

    @GET
    @Path("/stats")
    
    
    @Operation(summary = "Public stats", description = "This endpoint is used to get public stats.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = {
 })
    Response publicStatsGet(@Context SecurityContext securityContext);

}
