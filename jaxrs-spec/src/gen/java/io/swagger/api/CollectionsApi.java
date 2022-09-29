package io.swagger.api;

import java.util.List;
import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/collections")
@Api(description = "the collections API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-09-29T08:05:38.359Z")
public class CollectionsApi {

    @POST
    @Path("/{coluuid}/commit")
    @Produces({ "application/json" })
    @ApiOperation(value = "Produce a CID of the collection contents", notes = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class)
    })
    public Response collectionsColuuidCommitPost(@PathParam("coluuid") @ApiParam("coluuid") String coluuid) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{coluuid}")
    @ApiOperation(value = "Deletes a collection", notes = "This endpoint is used to delete an existing collection.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
    })
    public Response collectionsColuuidDelete(@PathParam("coluuid") @ApiParam("Collection ID") String coluuid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{coluuid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get contents in a collection", notes = "This endpoint is used to get contents in a collection. If no colpath query param is passed", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class)
    })
    public Response collectionsColuuidGet(@QueryParam("coluuid") @NotNull   @ApiParam("Collection UUID")  String coluuid,@QueryParam("dir")   @ApiParam("Directory")  String dir) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{coluuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add contents to a collection", notes = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", response = String.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Map.class, responseContainer = "Map")
    })
    public Response collectionsColuuidPost(@Valid List<Integer> body) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/fs/add")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a file to a collection", notes = "This endpoint adds a file to a collection", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
    })
    public Response collectionsFsAddPost(@QueryParam("coluuid") @NotNull   @ApiParam("Collection ID")  String coluuid,@QueryParam("content") @NotNull   @ApiParam("Content")  String content,@QueryParam("path") @NotNull   @ApiParam("Path to file")  String path) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all collections", notes = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", response = MainCollection.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainCollection.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response collectionsGet(@PathParam("id") @ApiParam("User ID") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new collection", notes = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", response = MainCollection.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainCollection.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response collectionsPost(@Valid MainCreateCollectionBody body) {
        return Response.ok().entity("magic!").build();
    }
}
