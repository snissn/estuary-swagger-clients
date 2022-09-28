package io.swagger.api;

import io.swagger.model.MainEstimateDealBody;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/deal")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-09-27T20:40:46.691587-10:00[Pacific/Honolulu]")
public class DealApi {

    @POST
    @Path("/estimate")
    @Consumes({ "*/*" })
    @Operation(summary = "Estimate the cost of a deal", description = "This endpoint estimates the cost of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealEstimatePost(@Valid MainEstimateDealBody body) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/info/{dealid}")
    @Operation(summary = "Get Deal Info", description = "This endpoint returns the deal info for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealInfoDealidGet( @PathParam("dealid")

 @Parameter(description = "Deal ID") Integer dealid
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/proposal/{propcid}")
    @Operation(summary = "Get Proposal", description = "This endpoint returns the proposal for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealProposalPropcidGet( @PathParam("propcid")

 @Parameter(description = "Proposal CID") String propcid
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/query/{miner}")
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealQueryMinerGet( @PathParam("miner")

 @Parameter(description = "CID") String miner
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/status-by-proposal/{propcid}")
    @Operation(summary = "Get Deal Status by PropCid", description = "Get Deal Status by PropCid", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealStatusByProposalPropcidGet( @PathParam("propcid")

 @Parameter(description = "PropCid") String propcid
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/status/{miner}/{propcid}")
    @Operation(summary = "Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealStatusMinerPropcidGet( @PathParam("miner")

 @Parameter(description = "Miner") String miner
, @PathParam("propcid")

 @Parameter(description = "Proposal CID") String propcid
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/transfer/in-progress")
    @Operation(summary = "Transfer In Progress", description = "This endpoint returns the in-progress transfers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealTransferInProgressGet() {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/transfer/status")
    @Operation(summary = "Transfer Status", description = "This endpoint returns the status of a transfer", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealTransferStatusPost() {
        return Response.ok().entity("magic!").build();
    }}
