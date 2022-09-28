package io.swagger.api;

import io.swagger.api.AdminApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/admin")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-09-27T20:40:33.778721-10:00[Pacific/Honolulu]")
public class AdminApi  {

  @Context SecurityContext securityContext;

  @Inject AdminApiService delegate;


    @POST
    @Path("/autoretrieve/init")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Register autoretrieve server", description = "This endpoint registers a new autoretrieve server", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public Response adminAutoretrieveInitPost(
@Parameter(description = "Autoretrieve's public key" ,required=true) String body
) {
        return delegate.adminAutoretrieveInitPost(body, securityContext);
    }

    @GET
    @Path("/autoretrieve/list")
    
    
    @Operation(summary = "List autoretrieve servers", description = "This endpoint lists all registered autoretrieve servers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public Response adminAutoretrieveListGet() {
        return delegate.adminAutoretrieveListGet(securityContext);
    }

    @DELETE
    @Path("/peering/peers")
    
    
    @Operation(summary = "Remove peers on Peering Service", description = "This endpoint can be used to remove a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersDelete() {
        return delegate.adminPeeringPeersDelete(securityContext);
    }

    @GET
    @Path("/peering/peers")
    
    
    @Operation(summary = "List all Peering peers", description = "This endpoint can be used to list all peers on Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersGet() {
        return delegate.adminPeeringPeersGet(securityContext);
    }

    @POST
    @Path("/peering/peers")
    
    
    @Operation(summary = "Add peers on Peering Service", description = "This endpoint can be used to add a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersPost() {
        return delegate.adminPeeringPeersPost(securityContext);
    }

    @POST
    @Path("/peering/start")
    
    
    @Operation(summary = "Start Peering", description = "This endpoint can be used to start the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringStartPost() {
        return delegate.adminPeeringStartPost(securityContext);
    }

    @GET
    @Path("/peering/status")
    
    
    @Operation(summary = "Check Peering Status", description = "This endpoint can be used to check the Peering status", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringStatusGet() {
        return delegate.adminPeeringStatusGet(securityContext);
    }

    @POST
    @Path("/peering/stop")
    
    
    @Operation(summary = "Stop Peering", description = "This endpoint can be used to stop the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringStopPost() {
        return delegate.adminPeeringStopPost(securityContext);
    }

    @GET
    @Path("/system/config")
    
    
    @Operation(summary = "Get systems(estuary/shuttle) config", description = "This endpoint is used to get system configs.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = {  })
    public Response adminSystemConfigGet() {
        return delegate.adminSystemConfigGet(securityContext);
    }

    @GET
    @Path("/users")
    
    
    @Operation(summary = "Get all users", description = "This endpoint is used to get all users.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = {  })
    public Response adminUsersGet() {
        return delegate.adminUsersGet(securityContext);
    }
}