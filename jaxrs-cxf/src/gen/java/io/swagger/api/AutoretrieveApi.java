package io.swagger.api;


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
public interface AutoretrieveApi  {

    /**
     * Register autoretrieve server
     *
     * This endpoint registers a new autoretrieve server
     *
     */
    @POST
    @Path("/admin/autoretrieve/init")
    @Consumes({ "*/*" })
    @Operation(summary = "Register autoretrieve server", tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public void adminAutoretrieveInitPost(@Valid String body);

    /**
     * List autoretrieve servers
     *
     * This endpoint lists all registered autoretrieve servers
     *
     */
    @GET
    @Path("/admin/autoretrieve/list")
    @Operation(summary = "List autoretrieve servers", tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public void adminAutoretrieveListGet();

    /**
     * Marks autoretrieve server as up
     *
     * This endpoint updates the lastConnection field for autoretrieve
     *
     */
    @POST
    @Path("/autoretrieve/heartbeat")
    @Operation(summary = "Marks autoretrieve server as up", tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public void autoretrieveHeartbeatPost(@HeaderParam("token") String token);
}
