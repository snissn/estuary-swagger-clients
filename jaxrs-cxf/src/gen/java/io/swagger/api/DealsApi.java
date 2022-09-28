package io.swagger.api;

import io.swagger.model.MainEstimateDealBody;

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
public interface DealsApi  {

    /**
     * Estimate the cost of a deal
     *
     * This endpoint estimates the cost of a deal
     *
     */
    @POST
    @Path("/deal/estimate")
    @Consumes({ "*/*" })
    @Operation(summary = "Estimate the cost of a deal", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealEstimatePost(@Valid MainEstimateDealBody body);

    /**
     * Get Deal Info
     *
     * This endpoint returns the deal info for a deal
     *
     */
    @GET
    @Path("/deal/info/{dealid}")
    @Operation(summary = "Get Deal Info", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealInfoDealidGet(@PathParam("dealid") Integer dealid);

    /**
     * Get Proposal
     *
     * This endpoint returns the proposal for a deal
     *
     */
    @GET
    @Path("/deal/proposal/{propcid}")
    @Operation(summary = "Get Proposal", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealProposalPropcidGet(@PathParam("propcid") String propcid);

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    @GET
    @Path("/deal/query/{miner}")
    @Operation(summary = "Query Ask", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealQueryMinerGet(@PathParam("miner") String miner);

    /**
     * Get Deal Status by PropCid
     *
     * Get Deal Status by PropCid
     *
     */
    @GET
    @Path("/deal/status-by-proposal/{propcid}")
    @Operation(summary = "Get Deal Status by PropCid", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealStatusByProposalPropcidGet(@PathParam("propcid") String propcid);

    /**
     * Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    @GET
    @Path("/deal/status/{miner}/{propcid}")
    @Operation(summary = "Deal Status", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealStatusMinerPropcidGet(@PathParam("miner") String miner, @PathParam("propcid") String propcid);

    /**
     * Transfer In Progress
     *
     * This endpoint returns the in-progress transfers
     *
     */
    @GET
    @Path("/deal/transfer/in-progress")
    @Operation(summary = "Transfer In Progress", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealTransferInProgressGet();

    /**
     * Transfer Status
     *
     * This endpoint returns the status of a transfer
     *
     */
    @POST
    @Path("/deal/transfer/status")
    @Operation(summary = "Transfer Status", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealTransferStatusPost();

    /**
     * Get storage failures for user
     *
     * This endpoint returns a list of storage failures for user
     *
     */
    @GET
    @Path("/deals/failures")
    @Operation(summary = "Get storage failures for user", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealsFailuresGet();

    /**
     * Make Deal
     *
     * This endpoint makes a deal for a given content and miner
     *
     */
    @POST
    @Path("/deals/make/{miner}")
    @Consumes({ "*/*" })
    @Operation(summary = "Make Deal", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealsMakeMinerPost(@Valid String body, @PathParam("miner") String miner);

    /**
     * Get Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    @GET
    @Path("/deals/status/{deal}")
    @Operation(summary = "Get Deal Status", tags={ "deals" })
    @ApiResponses(value = {  })
    public void dealsStatusDealGet(@PathParam("deal") Integer deal);

    /**
     * Get storage failures
     *
     * This endpoint returns a list of storage failures
     *
     */
    @GET
    @Path("/public/deals/failures")
    @Operation(summary = "Get storage failures", tags={ "deals" })
    @ApiResponses(value = {  })
    public void publicDealsFailuresGet();

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    @GET
    @Path("/public/miners/storage/query/{miner}")
    @Operation(summary = "Query Ask", tags={ "deals" })
    @ApiResponses(value = {  })
    public void publicMinersStorageQueryMinerGet(@PathParam("miner") String miner);
}
