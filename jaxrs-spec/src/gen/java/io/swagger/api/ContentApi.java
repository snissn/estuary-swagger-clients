package io.swagger.api;

import java.io.File;
import java.io.InputStream;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/content")
@Api(description = "the content API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-07T01:37:11.622Z")
public class ContentApi {

    @POST
    @Path("/add-car")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Car object", notes = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentAddCarPost(@Valid String body,@QueryParam("filename")   @ApiParam("Filename")  String filename,@QueryParam("commp")   @ApiParam("Commp")  String commp,@QueryParam("size")   @ApiParam("Size")  String size) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/add-ipfs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add IPFS object", notes = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentAddIpfsPost(@Valid UtilContentAddIpfsBody body) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add new content", notes = "This endpoint is used to upload new content.", response = UtilContentAddResponse.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UtilContentAddResponse.class)
    })
    public Response contentAddPost( @FormParam(value = "data") InputStream dataInputStream,@QueryParam("coluuid")   @ApiParam("Collection UUID")  String coluuid,@QueryParam("dir")   @ApiParam("Directory")  String dir) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/aggregated/{content}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get aggregated content stats", notes = "This endpoint returns aggregated content stats", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class)
    })
    public Response contentAggregatedContentGet(@PathParam("content") @ApiParam("Content ID") String content) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/all-deals")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all deals for a user", notes = "This endpoint is used to get all deals for a user", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentAllDealsGet(@QueryParam("begin") @NotNull   @ApiParam("Begin")  String begin,@QueryParam("duration") @NotNull   @ApiParam("Duration")  String duration,@QueryParam("all") @NotNull   @ApiParam("All")  String all) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/bw-usage/{content}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content bandwidth", notes = "This endpoint returns content bandwidth", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentBwUsageContentGet(@PathParam("content") @ApiParam("Content ID") String content) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/create")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new content", notes = "This endpoint adds a new content", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentCreatePost(@Valid String body) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/deals")
    @Produces({ "application/json" })
    @ApiOperation(value = "Content with deals", notes = "This endpoint lists all content with deals", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentDealsGet(@QueryParam("limit")   @ApiParam("Limit")  Integer limit,@QueryParam("offset")   @ApiParam("Offset")  Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/ensure-replication/{datacid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Ensure Replication", notes = "This endpoint ensures that the content is replicated to the specified number of providers", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentEnsureReplicationDatacidGet(@PathParam("datacid") @ApiParam("Data CID") String datacid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/failures/{content}")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all failures for a content", notes = "This endpoint returns all failures for a content", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class)
    })
    public Response contentFailuresContentGet(@PathParam("content") @ApiParam("Content ID") String content) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/importdeal")
    @Produces({ "application/json" })
    @ApiOperation(value = "Import a deal", notes = "This endpoint imports a deal into the shuttle.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentImportdealPost(@Valid MainImportDealBody body) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/list")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all pinned content", notes = "This endpoint lists all content", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List")
    })
    public Response contentListGet() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/read/{cont}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Read content", notes = "This endpoint reads content from the blockstore", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentReadContGet(@PathParam("cont") @ApiParam("CID") String cont) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/staging-zones")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get staging zone for user", notes = "This endpoint is used to get staging zone for user.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentStagingZonesGet() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/stats")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content statistics", notes = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
    })
    public Response contentStatsGet(@PathParam("limit") @ApiParam("limit") String limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/status/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Content Status", notes = "This endpoint returns the status of a content", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content" })
    @ApiResponses(value = { 
    })
    public Response contentStatusIdGet(@PathParam("id") @ApiParam("Content ID") Integer id) {
        return Response.ok().entity("magic!").build();
    }
}
