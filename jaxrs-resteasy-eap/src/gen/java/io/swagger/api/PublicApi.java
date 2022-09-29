package io.swagger.api;

import io.swagger.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/public")


@io.swagger.annotations.Api(description = "the public API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-09-29T01:55:57.697Z")
public interface PublicApi  {
   
    @GET
    @Path("/by-cid/{cid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Content by Cid", notes = "This endpoint returns the content associated with a CID", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicByCidCidGet( @PathParam("cid") String cid,@Context SecurityContext securityContext);
    @GET
    @Path("/deals/failures")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get storage failures", notes = "This endpoint returns a list of storage failures", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicDealsFailuresGet(@Context SecurityContext securityContext);
    @GET
    @Path("/info")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get public node info", notes = "This endpoint returns information about the node", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicInfoGet(@Context SecurityContext securityContext);
    @GET
    @Path("/metrics/deals-on-chain")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get deal metrics", notes = "This endpoint is used to get deal metrics", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public","metrics", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicMetricsDealsOnChainGet(@Context SecurityContext securityContext);
    @GET
    @Path("/miners/deals/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all miners deals", notes = "This endpoint returns all miners deals", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public","miner", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicMinersDealsMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);
    @GET
    @Path("/miners/failures/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all miners", notes = "This endpoint returns all miners", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicMinersFailuresMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);
    @GET
    @Path("/miners")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all miners", notes = "This endpoint returns all miners", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicMinersGet(@Context SecurityContext securityContext);
    @GET
    @Path("/miners/stats/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get miner stats", notes = "This endpoint returns miner stats", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public","miner", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicMinersStatsMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);
    @GET
    @Path("/miners/storage/query/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Query Ask", notes = "This endpoint returns the ask for a given CID", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicMinersStorageQueryMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);
    @GET
    @Path("/net/addrs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Net Addrs", notes = "This endpoint is used to get net addrs", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public Response publicNetAddrsGet(@Context SecurityContext securityContext);
    @GET
    @Path("/net/peers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Net Peers", notes = "This endpoint is used to get net peers", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public Response publicNetPeersGet(@Context SecurityContext securityContext);
    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Public stats", notes = "This endpoint is used to get public stats.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "public", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response publicStatsGet(@Context SecurityContext securityContext);
}
