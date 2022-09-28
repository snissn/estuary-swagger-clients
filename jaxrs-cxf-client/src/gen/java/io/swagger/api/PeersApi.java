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
public interface PeersApi  {

    /**
     * Remove peers on Peering Service
     *
     * This endpoint can be used to remove a Peer from the Peering Service
     *
     */
    @DELETE
    @Path("/admin/peering/peers")
    @Operation(summary = "Remove peers on Peering Service", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringPeersDelete();

    /**
     * List all Peering peers
     *
     * This endpoint can be used to list all peers on Peering Service
     *
     */
    @GET
    @Path("/admin/peering/peers")
    @Operation(summary = "List all Peering peers", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringPeersGet();

    /**
     * Add peers on Peering Service
     *
     * This endpoint can be used to add a Peer from the Peering Service
     *
     */
    @POST
    @Path("/admin/peering/peers")
    @Operation(summary = "Add peers on Peering Service", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringPeersPost();

    /**
     * Start Peering
     *
     * This endpoint can be used to start the Peering Service
     *
     */
    @POST
    @Path("/admin/peering/start")
    @Operation(summary = "Start Peering", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringStartPost();

    /**
     * Check Peering Status
     *
     * This endpoint can be used to check the Peering status
     *
     */
    @GET
    @Path("/admin/peering/status")
    @Operation(summary = "Check Peering Status", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringStatusGet();

    /**
     * Stop Peering
     *
     * This endpoint can be used to stop the Peering Service
     *
     */
    @POST
    @Path("/admin/peering/stop")
    @Operation(summary = "Stop Peering", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringStopPost();
}
