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

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
@Path("/content")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-09-27T20:40:44.339579-10:00[Pacific/Honolulu]")public interface ContentApi  {
   
    @POST
    @Path("/add-car")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add Car object", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentAddCarPost(@Parameter(description = "Car" ,required=true) String body, @QueryParam("filename") String filename, @QueryParam("commp") String commp, @QueryParam("size") String size,@Context SecurityContext securityContext);

    @POST
    @Path("/add-ipfs")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add IPFS object", description = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentAddIpfsPost(@Parameter(description = "IPFS Body" ,required=true) UtilContentAddIpfsBody body,@Context SecurityContext securityContext);

    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @Operation(summary = "Add new content", description = "This endpoint is used to upload new content.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilContentAddResponse.class)))
         })
    Response contentAddPost(MultipartFormDataInput input, @PathParam("coluuid") String coluuid, @PathParam("dir") String dir,@Context SecurityContext securityContext);

    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get aggregated content stats", description = "This endpoint returns aggregated content stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
         })
    Response contentAggregatedContentGet( @PathParam("content") String content,@Context SecurityContext securityContext);

    @GET
    @Path("/all-deals")
    
    
    @Operation(summary = "Get all deals for a user", description = "This endpoint is used to get all deals for a user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentAllDealsGet( @NotNull @QueryParam("begin") String begin, @NotNull @QueryParam("duration") String duration, @NotNull @QueryParam("all") String all,@Context SecurityContext securityContext);

    @GET
    @Path("/bw-usage/{content}")
    
    
    @Operation(summary = "Get content bandwidth", description = "This endpoint returns content bandwidth", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentBwUsageContentGet( @PathParam("content") String content,@Context SecurityContext securityContext);

    @POST
    @Path("/create")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add a new content", description = "This endpoint adds a new content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentCreatePost(@Parameter(description = "Content" ,required=true) String body,@Context SecurityContext securityContext);

    @GET
    @Path("/deals")
    
    
    @Operation(summary = "Content with deals", description = "This endpoint lists all content with deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentDealsGet( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext);

    @GET
    @Path("/ensure-replication/{datacid}")
    
    
    @Operation(summary = "Ensure Replication", description = "This endpoint ensures that the content is replicated to the specified number of providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentEnsureReplicationDatacidGet( @PathParam("datacid") String datacid,@Context SecurityContext securityContext);

    @GET
    @Path("/failures/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all failures for a content", description = "This endpoint returns all failures for a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
         })
    Response contentFailuresContentGet( @PathParam("content") String content,@Context SecurityContext securityContext);

    @POST
    @Path("/importdeal")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Import a deal", description = "This endpoint imports a deal into the shuttle.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentImportdealPost(@Parameter(description = "Import a deal" ,required=true) MainImportDealBody body,@Context SecurityContext securityContext);

    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pinned content", description = "This endpoint lists all content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))))
         })
    Response contentListGet(@Context SecurityContext securityContext);

    @GET
    @Path("/read/{cont}")
    
    
    @Operation(summary = "Read content", description = "This endpoint reads content from the blockstore", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentReadContGet( @PathParam("cont") String cont,@Context SecurityContext securityContext);

    @GET
    @Path("/staging-zones")
    
    
    @Operation(summary = "Get staging zone for user", description = "This endpoint is used to get staging zone for user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentStagingZonesGet(@Context SecurityContext securityContext);

    @GET
    @Path("/stats")
    
    
    @Operation(summary = "Get content statistics", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentStatsGet( @PathParam("limit") String limit,@Context SecurityContext securityContext);

    @GET
    @Path("/status/{id}")
    
    
    @Operation(summary = "Content Status", description = "This endpoint returns the status of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
 })
    Response contentStatusIdGet( @PathParam("id") Integer id,@Context SecurityContext securityContext);

}
