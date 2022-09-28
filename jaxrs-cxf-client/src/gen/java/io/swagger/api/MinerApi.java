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
public interface MinerApi  {

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
}
