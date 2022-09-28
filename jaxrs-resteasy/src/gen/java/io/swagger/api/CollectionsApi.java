package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CollectionsApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/collections")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-09-27T20:40:41.950348-10:00[Pacific/Honolulu]")public class CollectionsApi  {

    @Inject CollectionsApiService service;

    @POST
    @Path("/{coluuid}/commit")
    
    @Produces({ "application/json" })
    @Operation(summary = "Produce a CID of the collection contents", description = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))) })
    public Response collectionsColuuidCommitPost( @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidCommitPost(coluuid,securityContext);
    }
    @DELETE
    @Path("/{coluuid}")
    
    
    @Operation(summary = "Deletes a collection", description = "This endpoint is used to delete an existing collection.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = {  })
    public Response collectionsColuuidDelete( @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidDelete(coluuid,securityContext);
    }
    @GET
    @Path("/{coluuid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get contents in a collection", description = "This endpoint is used to get contents in a collection. If no colpath query param is passed", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))) })
    public Response collectionsColuuidGet( @NotNull  @QueryParam("coluuid") String coluuid,  @QueryParam("dir") String dir,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidGet(coluuid,dir,securityContext);
    }
    @POST
    @Path("/{coluuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add contents to a collection", description = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))) })
    public Response collectionsColuuidPost(@Parameter(description = "Content IDs to add to collection" ,required=true) List<Integer> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidPost(body,securityContext);
    }
    @POST
    @Path("/fs/add")
    
    
    @Operation(summary = "Add a file to a collection", description = "This endpoint adds a file to a collection", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = {  })
    public Response collectionsFsAddPost( @NotNull  @QueryParam("coluuid") String coluuid, @NotNull  @QueryParam("content") String content, @NotNull  @QueryParam("path") String path,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsFsAddPost(coluuid,content,path,securityContext);
    }
    @GET
    @Path("/")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all collections", description = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = MainCollection.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsGet( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsGet(id,securityContext);
    }
    @POST
    @Path("/")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Create a new collection", description = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MainCollection.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsPost(@Parameter(description = "Collection name and description" ,required=true) MainCreateCollectionBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsPost(body,securityContext);
    }
}
