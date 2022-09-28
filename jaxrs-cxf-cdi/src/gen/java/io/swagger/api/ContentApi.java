package io.swagger.api;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.api.ContentApiService;

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
@Path("/content")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-09-27T20:40:33.778721-10:00[Pacific/Honolulu]")
public class ContentApi  {

  @Context SecurityContext securityContext;

  @Inject ContentApiService delegate;


    @POST
    @Path("/add-car")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add Car object", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentAddCarPost(
@Parameter(description = "Car" ,required=true) String body
,  
@Parameter(description = "Filename")  @QueryParam("filename") String filename
,  
@Parameter(description = "Commp")  @QueryParam("commp") String commp
,  
@Parameter(description = "Size")  @QueryParam("size") String size
) {
        return delegate.contentAddCarPost(body, filename, commp, size, securityContext);
    }

    @POST
    @Path("/add-ipfs")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add IPFS object", description = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentAddIpfsPost(
@Parameter(description = "IPFS Body" ,required=true) UtilContentAddIpfsBody body
) {
        return delegate.contentAddIpfsPost(body, securityContext);
    }

    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @Operation(summary = "Add new content", description = "This endpoint is used to upload new content.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilContentAddResponse.class))) })
    public Response contentAddPost( @Multipart(value = "file") InputStream fileInputStream, @Multipart(value = "file" ) Attachment fileDetail, 
@Parameter(description = "Collection UUID",required=true) @PathParam("coluuid") String coluuid
, 
@Parameter(description = "Directory",required=true) @PathParam("dir") String dir
) {
        return delegate.contentAddPost(fileInputStream, fileDetail, coluuid, dir, securityContext);
    }

    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get aggregated content stats", description = "This endpoint returns aggregated content stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))) })
    public Response contentAggregatedContentGet(
@Parameter(description = "Content ID",required=true) @PathParam("content") String content
) {
        return delegate.contentAggregatedContentGet(content, securityContext);
    }

    @GET
    @Path("/all-deals")
    
    
    @Operation(summary = "Get all deals for a user", description = "This endpoint is used to get all deals for a user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentAllDealsGet( @NotNull 
@Parameter(description = "Begin",required=true)  @QueryParam("begin") String begin
,  @NotNull 
@Parameter(description = "Duration",required=true)  @QueryParam("duration") String duration
,  @NotNull 
@Parameter(description = "All",required=true)  @QueryParam("all") String all
) {
        return delegate.contentAllDealsGet(begin, duration, all, securityContext);
    }

    @GET
    @Path("/bw-usage/{content}")
    
    
    @Operation(summary = "Get content bandwidth", description = "This endpoint returns content bandwidth", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentBwUsageContentGet(
@Parameter(description = "Content ID",required=true) @PathParam("content") String content
) {
        return delegate.contentBwUsageContentGet(content, securityContext);
    }

    @POST
    @Path("/create")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add a new content", description = "This endpoint adds a new content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentCreatePost(
@Parameter(description = "Content" ,required=true) String body
) {
        return delegate.contentCreatePost(body, securityContext);
    }

    @GET
    @Path("/deals")
    
    
    @Operation(summary = "Content with deals", description = "This endpoint lists all content with deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentDealsGet( 
@Parameter(description = "Limit")  @QueryParam("limit") Integer limit
,  
@Parameter(description = "Offset")  @QueryParam("offset") Integer offset
) {
        return delegate.contentDealsGet(limit, offset, securityContext);
    }

    @GET
    @Path("/ensure-replication/{datacid}")
    
    
    @Operation(summary = "Ensure Replication", description = "This endpoint ensures that the content is replicated to the specified number of providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentEnsureReplicationDatacidGet(
@Parameter(description = "Data CID",required=true) @PathParam("datacid") String datacid
) {
        return delegate.contentEnsureReplicationDatacidGet(datacid, securityContext);
    }

    @GET
    @Path("/failures/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all failures for a content", description = "This endpoint returns all failures for a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))) })
    public Response contentFailuresContentGet(
@Parameter(description = "Content ID",required=true) @PathParam("content") String content
) {
        return delegate.contentFailuresContentGet(content, securityContext);
    }

    @POST
    @Path("/importdeal")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Import a deal", description = "This endpoint imports a deal into the shuttle.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentImportdealPost(
@Parameter(description = "Import a deal" ,required=true) MainImportDealBody body
) {
        return delegate.contentImportdealPost(body, securityContext);
    }

    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pinned content", description = "This endpoint lists all content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public Response contentListGet() {
        return delegate.contentListGet(securityContext);
    }

    @GET
    @Path("/read/{cont}")
    
    
    @Operation(summary = "Read content", description = "This endpoint reads content from the blockstore", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentReadContGet(
@Parameter(description = "CID",required=true) @PathParam("cont") String cont
) {
        return delegate.contentReadContGet(cont, securityContext);
    }

    @GET
    @Path("/staging-zones")
    
    
    @Operation(summary = "Get staging zone for user", description = "This endpoint is used to get staging zone for user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentStagingZonesGet() {
        return delegate.contentStagingZonesGet(securityContext);
    }

    @GET
    @Path("/stats")
    
    
    @Operation(summary = "Get content statistics", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentStatsGet(
@Parameter(description = "limit",required=true) @PathParam("limit") String limit
) {
        return delegate.contentStatsGet(limit, securityContext);
    }

    @GET
    @Path("/status/{id}")
    
    
    @Operation(summary = "Content Status", description = "This endpoint returns the status of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentStatusIdGet(
@Parameter(description = "Content ID",required=true) @PathParam("id") Integer id
) {
        return delegate.contentStatusIdGet(id, securityContext);
    }
}
