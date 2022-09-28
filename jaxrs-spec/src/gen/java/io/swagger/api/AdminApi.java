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

@Path("/admin")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-09-27T20:40:46.691587-10:00[Pacific/Honolulu]")
public class AdminApi {

    @POST
    @Path("/autoretrieve/init")
    @Consumes({ "*/*" })
    @Operation(summary = "Register autoretrieve server", description = "This endpoint registers a new autoretrieve server", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
    })
    public Response adminAutoretrieveInitPost(@Valid String body) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/autoretrieve/list")
    @Operation(summary = "List autoretrieve servers", description = "This endpoint lists all registered autoretrieve servers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
    })
    public Response adminAutoretrieveListGet() {
        return Response.ok().entity("magic!").build();
    }
    @DELETE
    @Path("/peering/peers")
    @Operation(summary = "Remove peers on Peering Service", description = "This endpoint can be used to remove a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = { 
    })
    public Response adminPeeringPeersDelete() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/peering/peers")
    @Operation(summary = "List all Peering peers", description = "This endpoint can be used to list all peers on Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = { 
    })
    public Response adminPeeringPeersGet() {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/peering/peers")
    @Operation(summary = "Add peers on Peering Service", description = "This endpoint can be used to add a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = { 
    })
    public Response adminPeeringPeersPost() {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/peering/start")
    @Operation(summary = "Start Peering", description = "This endpoint can be used to start the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = { 
    })
    public Response adminPeeringStartPost() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/peering/status")
    @Operation(summary = "Check Peering Status", description = "This endpoint can be used to check the Peering status", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = { 
    })
    public Response adminPeeringStatusGet() {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/peering/stop")
    @Operation(summary = "Stop Peering", description = "This endpoint can be used to stop the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = { 
    })
    public Response adminPeeringStopPost() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/system/config")
    @Operation(summary = "Get systems(estuary/shuttle) config", description = "This endpoint is used to get system configs.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = { 
    })
    public Response adminSystemConfigGet() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/users")
    @Operation(summary = "Get all users", description = "This endpoint is used to get all users.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = { 
    })
    public Response adminUsersGet() {
        return Response.ok().entity("magic!").build();
    }}
