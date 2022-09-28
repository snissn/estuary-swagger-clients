package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ContentApiService;
import io.swagger.api.factories.ContentApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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


@Path("/content")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public class ContentApi  {
   private final ContentApiService delegate;

   public ContentApi(@Context ServletConfig servletContext) {
      ContentApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ContentApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ContentApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ContentApiServiceFactory.getContentApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/add-car")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add Car object", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentAddCarPost(@Parameter(in = ParameterIn.DEFAULT, description = "Car" ,required=true) String body

,@Parameter(in = ParameterIn.QUERY, description = "Filename") @QueryParam("filename") String filename
,@Parameter(in = ParameterIn.QUERY, description = "Commp") @QueryParam("commp") String commp
,@Parameter(in = ParameterIn.QUERY, description = "Size") @QueryParam("size") String size
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAddCarPost(body,filename,commp,size,securityContext);
    }
    @POST
    @Path("/add-ipfs")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add IPFS object", description = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentAddIpfsPost(@Parameter(in = ParameterIn.DEFAULT, description = "IPFS Body" ,required=true) UtilContentAddIpfsBody body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAddIpfsPost(body,securityContext);
    }
    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @Operation(summary = "Add new content", description = "This endpoint is used to upload new content.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilContentAddResponse.class))) })
    public Response contentAddPost(@FormDataParam("file") InputStream fileInputStream,
            @FormDataParam("file") FormDataContentDisposition fileDetail
,@Parameter(in = ParameterIn.PATH, description = "Collection UUID",required=true) @PathParam("coluuid") String coluuid
,@Parameter(in = ParameterIn.PATH, description = "Directory",required=true) @PathParam("dir") String dir
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAddPost(file,coluuid,dir,securityContext);
    }
    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get aggregated content stats", description = "This endpoint returns aggregated content stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))) })
    public Response contentAggregatedContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("content") String content
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAggregatedContentGet(content,securityContext);
    }
    @GET
    @Path("/all-deals")
    
    
    @Operation(summary = "Get all deals for a user", description = "This endpoint is used to get all deals for a user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentAllDealsGet(@Parameter(in = ParameterIn.QUERY, description = "Begin",required=true) @QueryParam("begin") String begin
,@Parameter(in = ParameterIn.QUERY, description = "Duration",required=true) @QueryParam("duration") String duration
,@Parameter(in = ParameterIn.QUERY, description = "All",required=true) @QueryParam("all") String all
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAllDealsGet(begin,duration,all,securityContext);
    }
    @GET
    @Path("/bw-usage/{content}")
    
    
    @Operation(summary = "Get content bandwidth", description = "This endpoint returns content bandwidth", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentBwUsageContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("content") String content
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentBwUsageContentGet(content,securityContext);
    }
    @POST
    @Path("/create")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Add a new content", description = "This endpoint adds a new content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentCreatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Content" ,required=true) String body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentCreatePost(body,securityContext);
    }
    @GET
    @Path("/deals")
    
    
    @Operation(summary = "Content with deals", description = "This endpoint lists all content with deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentDealsGet(@Parameter(in = ParameterIn.QUERY, description = "Limit") @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "Offset") @QueryParam("offset") Integer offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentDealsGet(limit,offset,securityContext);
    }
    @GET
    @Path("/ensure-replication/{datacid}")
    
    
    @Operation(summary = "Ensure Replication", description = "This endpoint ensures that the content is replicated to the specified number of providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentEnsureReplicationDatacidGet(@Parameter(in = ParameterIn.PATH, description = "Data CID",required=true) @PathParam("datacid") String datacid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentEnsureReplicationDatacidGet(datacid,securityContext);
    }
    @GET
    @Path("/failures/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all failures for a content", description = "This endpoint returns all failures for a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))) })
    public Response contentFailuresContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("content") String content
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentFailuresContentGet(content,securityContext);
    }
    @POST
    @Path("/importdeal")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Import a deal", description = "This endpoint imports a deal into the shuttle.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentImportdealPost(@Parameter(in = ParameterIn.DEFAULT, description = "Import a deal" ,required=true) MainImportDealBody body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentImportdealPost(body,securityContext);
    }
    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pinned content", description = "This endpoint lists all content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public Response contentListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentListGet(securityContext);
    }
    @GET
    @Path("/read/{cont}")
    
    
    @Operation(summary = "Read content", description = "This endpoint reads content from the blockstore", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentReadContGet(@Parameter(in = ParameterIn.PATH, description = "CID",required=true) @PathParam("cont") String cont
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentReadContGet(cont,securityContext);
    }
    @GET
    @Path("/staging-zones")
    
    
    @Operation(summary = "Get staging zone for user", description = "This endpoint is used to get staging zone for user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentStagingZonesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentStagingZonesGet(securityContext);
    }
    @GET
    @Path("/stats")
    
    
    @Operation(summary = "Get content statistics", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentStatsGet(@Parameter(in = ParameterIn.PATH, description = "limit",required=true) @PathParam("limit") String limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentStatsGet(limit,securityContext);
    }
    @GET
    @Path("/status/{id}")
    
    
    @Operation(summary = "Content Status", description = "This endpoint returns the status of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentStatusIdGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentStatusIdGet(id,securityContext);
    }
}
