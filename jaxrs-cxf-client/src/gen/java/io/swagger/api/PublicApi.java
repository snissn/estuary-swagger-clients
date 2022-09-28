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
public interface PublicApi  {

    /**
     * Get Content by Cid
     *
     * This endpoint returns the content associated with a CID
     *
     */
    @GET
    @Path("/public/by-cid/{cid}")
    @Operation(summary = "Get Content by Cid", tags={  })
    @ApiResponses(value = {  })
    public void publicByCidCidGet(@PathParam("cid") String cid);

    /**
     * Get public node info
     *
     * This endpoint returns information about the node
     *
     */
    @GET
    @Path("/public/info")
    @Operation(summary = "Get public node info", tags={  })
    @ApiResponses(value = {  })
    public void publicInfoGet();

    /**
     * Get deal metrics
     *
     * This endpoint is used to get deal metrics
     *
     */
    @GET
    @Path("/public/metrics/deals-on-chain")
    @Operation(summary = "Get deal metrics", tags={  })
    @ApiResponses(value = {  })
    public void publicMetricsDealsOnChainGet();

    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     *
     */
    @GET
    @Path("/public/miners/deals/{miner}")
    @Operation(summary = "Get all miners deals", tags={  })
    @ApiResponses(value = {  })
    public void publicMinersDealsMinerGet(@PathParam("miner") String miner);

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
     * Get miner stats
     *
     * This endpoint returns miner stats
     *
     */
    @GET
    @Path("/public/miners/stats/{miner}")
    @Operation(summary = "Get miner stats", tags={  })
    @ApiResponses(value = {  })
    public void publicMinersStatsMinerGet(@PathParam("miner") String miner);

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

    /**
     * Public stats
     *
     * This endpoint is used to get public stats.
     *
     */
    @GET
    @Path("/public/stats")
    @Operation(summary = "Public stats", tags={  })
    @ApiResponses(value = {  })
    public void publicStatsGet();
}
