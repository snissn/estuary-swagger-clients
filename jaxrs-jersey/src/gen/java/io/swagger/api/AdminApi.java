package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AdminApiService;
import io.swagger.api.factories.AdminApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/admin")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public class AdminApi  {
   private final AdminApiService delegate;

   public AdminApi(@Context ServletConfig servletContext) {
      AdminApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AdminApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AdminApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AdminApiServiceFactory.getAdminApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/autoretrieve/init")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Register autoretrieve server", description = "This endpoint registers a new autoretrieve server", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public Response adminAutoretrieveInitPost(@Parameter(in = ParameterIn.DEFAULT, description = "Autoretrieve's public key" ,required=true) String body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminAutoretrieveInitPost(body,securityContext);
    }
    @GET
    @Path("/autoretrieve/list")
    
    
    @Operation(summary = "List autoretrieve servers", description = "This endpoint lists all registered autoretrieve servers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public Response adminAutoretrieveListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminAutoretrieveListGet(securityContext);
    }
    @DELETE
    @Path("/peering/peers")
    
    
    @Operation(summary = "Remove peers on Peering Service", description = "This endpoint can be used to remove a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersDelete(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminPeeringPeersDelete(securityContext);
    }
    @GET
    @Path("/peering/peers")
    
    
    @Operation(summary = "List all Peering peers", description = "This endpoint can be used to list all peers on Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminPeeringPeersGet(securityContext);
    }
    @POST
    @Path("/peering/peers")
    
    
    @Operation(summary = "Add peers on Peering Service", description = "This endpoint can be used to add a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminPeeringPeersPost(securityContext);
    }
    @POST
    @Path("/peering/start")
    
    
    @Operation(summary = "Start Peering", description = "This endpoint can be used to start the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringStartPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminPeeringStartPost(securityContext);
    }
    @GET
    @Path("/peering/status")
    
    
    @Operation(summary = "Check Peering Status", description = "This endpoint can be used to check the Peering status", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringStatusGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminPeeringStatusGet(securityContext);
    }
    @POST
    @Path("/peering/stop")
    
    
    @Operation(summary = "Stop Peering", description = "This endpoint can be used to stop the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin", "peering", "peers" })
    @ApiResponses(value = {  })
    public Response adminPeeringStopPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminPeeringStopPost(securityContext);
    }
    @GET
    @Path("/system/config")
    
    
    @Operation(summary = "Get systems(estuary/shuttle) config", description = "This endpoint is used to get system configs.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = {  })
    public Response adminSystemConfigGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminSystemConfigGet(securityContext);
    }
    @GET
    @Path("/users")
    
    
    @Operation(summary = "Get all users", description = "This endpoint is used to get all users.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "admin" })
    @ApiResponses(value = {  })
    public Response adminUsersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminUsersGet(securityContext);
    }
}
