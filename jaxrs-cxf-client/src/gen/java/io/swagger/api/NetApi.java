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

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
public interface NetApi  {

    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     *
     */
    @GET
    @Path("/net/addrs")
    @Produces({ "application/json" })
    @Operation(summary = "Net Addrs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public List<String> netAddrsGet();

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    @GET
    @Path("/public/miners/failures/{miner}")
    @Operation(summary = "Get all miners", tags={  })
    @ApiResponses(value = {  })
    public void publicMinersFailuresMinerGet(@PathParam("miner") String miner);

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    @GET
    @Path("/public/miners")
    @Operation(summary = "Get all miners", tags={  })
    @ApiResponses(value = {  })
    public void publicMinersGet();

    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     *
     */
    @GET
    @Path("/public/net/addrs")
    @Produces({ "application/json" })
    @Operation(summary = "Net Addrs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public List<String> publicNetAddrsGet();

    /**
     * Net Peers
     *
     * This endpoint is used to get net peers
     *
     */
    @GET
    @Path("/public/net/peers")
    @Produces({ "application/json" })
    @Operation(summary = "Net Peers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public List<String> publicNetPeersGet();
}
