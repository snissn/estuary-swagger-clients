package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PublicApiService;
import io.swagger.api.factories.PublicApiServiceFactory;

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


@Path("/public")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public class PublicApi  {
   private final PublicApiService delegate;

   public PublicApi(@Context ServletConfig servletContext) {
      PublicApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PublicApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PublicApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PublicApiServiceFactory.getPublicApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/by-cid/{cid}")
    
    
    @Operation(summary = "Get Content by Cid", description = "This endpoint returns the content associated with a CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = {  })
    public Response publicByCidCidGet(@Parameter(in = ParameterIn.PATH, description = "Cid",required=true) @PathParam("cid") String cid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicByCidCidGet(cid,securityContext);
    }
    @GET
    @Path("/deals/failures")
    
    
    @Operation(summary = "Get storage failures", description = "This endpoint returns a list of storage failures", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response publicDealsFailuresGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicDealsFailuresGet(securityContext);
    }
    @GET
    @Path("/info")
    
    
    @Operation(summary = "Get public node info", description = "This endpoint returns information about the node", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = {  })
    public Response publicInfoGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicInfoGet(securityContext);
    }
    @GET
    @Path("/metrics/deals-on-chain")
    
    
    @Operation(summary = "Get deal metrics", description = "This endpoint is used to get deal metrics", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "metrics" })
    @ApiResponses(value = {  })
    public Response publicMetricsDealsOnChainGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMetricsDealsOnChainGet(securityContext);
    }
    @GET
    @Path("/miners/deals/{miner}")
    
    
    @Operation(summary = "Get all miners deals", description = "This endpoint returns all miners deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "miner" })
    @ApiResponses(value = {  })
    public Response publicMinersDealsMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersDealsMinerGet(miner,securityContext);
    }
    @GET
    @Path("/miners/failures/{miner}")
    
    
    @Operation(summary = "Get all miners", description = "This endpoint returns all miners", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = {  })
    public Response publicMinersFailuresMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersFailuresMinerGet(miner,securityContext);
    }
    @GET
    @Path("/miners")
    
    
    @Operation(summary = "Get all miners", description = "This endpoint returns all miners", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = {  })
    public Response publicMinersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersGet(securityContext);
    }
    @GET
    @Path("/miners/stats/{miner}")
    
    
    @Operation(summary = "Get miner stats", description = "This endpoint returns miner stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "miner" })
    @ApiResponses(value = {  })
    public Response publicMinersStatsMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersStatsMinerGet(miner,securityContext);
    }
    @GET
    @Path("/miners/storage/query/{miner}")
    
    
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response publicMinersStorageQueryMinerGet(@Parameter(in = ParameterIn.PATH, description = "CID",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersStorageQueryMinerGet(miner,securityContext);
    }
    @GET
    @Path("/net/addrs")
    
    @Produces({ "application/json" })
    @Operation(summary = "Net Addrs", description = "This endpoint is used to get net addrs", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public Response publicNetAddrsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicNetAddrsGet(securityContext);
    }
    @GET
    @Path("/net/peers")
    
    @Produces({ "application/json" })
    @Operation(summary = "Net Peers", description = "This endpoint is used to get net peers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public Response publicNetPeersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicNetPeersGet(securityContext);
    }
    @GET
    @Path("/stats")
    
    
    @Operation(summary = "Public stats", description = "This endpoint is used to get public stats.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = {  })
    public Response publicStatsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicStatsGet(securityContext);
    }
}
