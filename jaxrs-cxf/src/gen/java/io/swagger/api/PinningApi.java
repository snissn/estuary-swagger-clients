package io.swagger.api;

import io.swagger.model.UtilHttpError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
public interface PinningApi  {

    /**
     * List all pin status objects
     *
     * This endpoint lists all pin status objects
     *
     */
    @GET
    @Path("/pinning/pins")
    @Produces({ "application/json" })
    @Operation(summary = "List all pin status objects", tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public void pinningPinsGet();

    /**
     * Delete a pinned object
     *
     * This endpoint deletes a pinned object.
     *
     */
    @DELETE
    @Path("/pinning/pins/{pinid}")
    @Operation(summary = "Delete a pinned object", tags={ "pinning" })
    @ApiResponses(value = {  })
    public void pinningPinsPinidDelete(@PathParam("pinid") String pinid);

    /**
     * Get a pin status object
     *
     * This endpoint returns a pin status object.
     *
     */
    @GET
    @Path("/pinning/pins/{pinid}")
    @Operation(summary = "Get a pin status object", tags={ "pinning" })
    @ApiResponses(value = {  })
    public void pinningPinsPinidGet(@PathParam("pinid") String pinid);

    /**
     * Replace a pinned object
     *
     * This endpoint replaces a pinned object.
     *
     */
    @POST
    @Path("/pinning/pins/{pinid}")
    @Operation(summary = "Replace a pinned object", tags={ "pinning" })
    @ApiResponses(value = {  })
    public void pinningPinsPinidPost(@PathParam("pinid") String pinid);

    /**
     * Add and pin object
     *
     * This endpoint adds a pin to the IPFS daemon.
     *
     */
    @POST
    @Path("/pinning/pins")
    @Operation(summary = "Add and pin object", tags={ "pinning" })
    @ApiResponses(value = {  })
    public void pinningPinsPost(@PathParam("cid") String cid, @PathParam("name") String name);
}
