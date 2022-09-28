package io.swagger.api;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

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

@Path("/content")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-09-27T20:40:46.691587-10:00[Pacific/Honolulu]")
public class ContentApi {

    @POST
    @Path("/add-car")
    @Consumes({ "*/*" })
    @Operation(summary = "Add Car object", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentAddCarPost(@Valid String body,  @QueryParam("filename") 

 @Parameter(description = "Filename")  String filename
,  @QueryParam("commp") 

 @Parameter(description = "Commp")  String commp
,  @QueryParam("size") 

 @Parameter(description = "Size")  String size
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/add-ipfs")
    @Consumes({ "*/*" })
    @Operation(summary = "Add IPFS object", description = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentAddIpfsPost(@Valid UtilContentAddIpfsBody body) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @Operation(summary = "Add new content", description = "This endpoint is used to upload new content.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilContentAddResponse.class)))
    })
    public Response contentAddPost( @FormParam(value = "file") InputStream fileInputStream,
   @FormParam(value = "file") Attachment fileDetail, @PathParam("coluuid")

 @Parameter(description = "Collection UUID") String coluuid
, @PathParam("dir")

 @Parameter(description = "Directory") String dir
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/aggregated/{content}")
    @Produces({ "application/json" })
    @Operation(summary = "Get aggregated content stats", description = "This endpoint returns aggregated content stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
    })
    public Response contentAggregatedContentGet( @PathParam("content")

 @Parameter(description = "Content ID") String content
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/all-deals")
    @Operation(summary = "Get all deals for a user", description = "This endpoint is used to get all deals for a user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentAllDealsGet( @NotNull  @QueryParam("begin") 

 @Parameter(description = "Begin")  String begin
, @NotNull  @QueryParam("duration") 

 @Parameter(description = "Duration")  String duration
, @NotNull  @QueryParam("all") 

 @Parameter(description = "All")  String all
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/bw-usage/{content}")
    @Operation(summary = "Get content bandwidth", description = "This endpoint returns content bandwidth", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentBwUsageContentGet( @PathParam("content")

 @Parameter(description = "Content ID") String content
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/create")
    @Consumes({ "*/*" })
    @Operation(summary = "Add a new content", description = "This endpoint adds a new content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentCreatePost(@Valid String body) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/deals")
    @Operation(summary = "Content with deals", description = "This endpoint lists all content with deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentDealsGet(  @QueryParam("limit") 

 @Parameter(description = "Limit")  Integer limit
,  @QueryParam("offset") 

 @Parameter(description = "Offset")  Integer offset
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/ensure-replication/{datacid}")
    @Operation(summary = "Ensure Replication", description = "This endpoint ensures that the content is replicated to the specified number of providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentEnsureReplicationDatacidGet( @PathParam("datacid")

 @Parameter(description = "Data CID") String datacid
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/failures/{content}")
    @Produces({ "application/json" })
    @Operation(summary = "List all failures for a content", description = "This endpoint returns all failures for a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
    })
    public Response contentFailuresContentGet( @PathParam("content")

 @Parameter(description = "Content ID") String content
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/importdeal")
    @Consumes({ "*/*" })
    @Operation(summary = "Import a deal", description = "This endpoint imports a deal into the shuttle.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentImportdealPost(@Valid MainImportDealBody body) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/list")
    @Produces({ "application/json" })
    @Operation(summary = "List all pinned content", description = "This endpoint lists all content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))))
    })
    public Response contentListGet() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/read/{cont}")
    @Operation(summary = "Read content", description = "This endpoint reads content from the blockstore", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentReadContGet( @PathParam("cont")

 @Parameter(description = "CID") String cont
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/staging-zones")
    @Operation(summary = "Get staging zone for user", description = "This endpoint is used to get staging zone for user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentStagingZonesGet() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/stats")
    @Operation(summary = "Get content statistics", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentStatsGet( @PathParam("limit")

 @Parameter(description = "limit") String limit
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/status/{id}")
    @Operation(summary = "Content Status", description = "This endpoint returns the status of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentStatusIdGet( @PathParam("id")

 @Parameter(description = "Content ID") Integer id
) {
        return Response.ok().entity("magic!").build();
    }}
