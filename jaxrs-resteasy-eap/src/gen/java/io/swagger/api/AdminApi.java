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
@Path("/admin")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-09-27T20:40:44.339579-10:00[Pacific/Honolulu]")public interface AdminApi  {
   
    @POST
    @Path("/autoretrieve/init")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Register autoretrieve server", description = "This endpoint registers a new autoretrieve server", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = {
 })
    Response adminAutoretrieveInitPost(@Parameter(description = "Autoretrieve's public key" ,required=true) String body,@Context SecurityContext securityContext);

    @GET
    @Path("/autoretrieve/list")
    
    
    @Operation(summary = "List autoretrieve servers", description = "This endpoint lists all registered autoretrieve servers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = {
 })
    Response adminAutoretrieveListGet(@Context SecurityContext securityContext);

    @DELETE
    @Path("/peering/peers")
    
    
    @Operation(summary = "Remove peers on Peering Service", description = "This endpoint can be used to remove a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {
 })
    Response adminPeeringPeersDelete(@Context SecurityContext securityContext);

    @GET
    @Path("/peering/peers")
    
    
    @Operation(summary = "List all Peering peers", description = "This endpoint can be used to list all peers on Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {
 })
    Response adminPeeringPeersGet(@Context SecurityContext securityContext);

    @POST
    @Path("/peering/peers")
    
    
    @Operation(summary = "Add peers on Peering Service", description = "This endpoint can be used to add a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {
 })
    Response adminPeeringPeersPost(@Context SecurityContext securityContext);

    @POST
    @Path("/peering/start")
    
    
    @Operation(summary = "Start Peering", description = "This endpoint can be used to start the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {
 })
    Response adminPeeringStartPost(@Context SecurityContext securityContext);

    @GET
    @Path("/peering/status")
    
    
    @Operation(summary = "Check Peering Status", description = "This endpoint can be used to check the Peering status", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {
 })
    Response adminPeeringStatusGet(@Context SecurityContext securityContext);

    @POST
    @Path("/peering/stop")
    
    
    @Operation(summary = "Stop Peering", description = "This endpoint can be used to stop the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {
 })
    Response adminPeeringStopPost(@Context SecurityContext securityContext);

    @GET
    @Path("/system/config")
    
    
    @Operation(summary = "Get systems(estuary/shuttle) config", description = "This endpoint is used to get system configs.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = {
 })
    Response adminSystemConfigGet(@Context SecurityContext securityContext);

    @GET
    @Path("/users")
    
    
    @Operation(summary = "Get all users", description = "This endpoint is used to get all users.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = {
 })
    Response adminUsersGet(@Context SecurityContext securityContext);

}
