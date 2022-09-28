package io.swagger.api;

import io.swagger.model.MainEstimateDealBody;
import io.swagger.api.DealApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/deal")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-09-27T20:40:33.778721-10:00[Pacific/Honolulu]")
public class DealApi  {

  @Context SecurityContext securityContext;

  @Inject DealApiService delegate;


    @POST
    @Path("/estimate")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Estimate the cost of a deal", description = "This endpoint estimates the cost of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealEstimatePost(
@Parameter(description = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks" ,required=true) MainEstimateDealBody body
) {
        return delegate.dealEstimatePost(body, securityContext);
    }

    @GET
    @Path("/info/{dealid}")
    
    
    @Operation(summary = "Get Deal Info", description = "This endpoint returns the deal info for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealInfoDealidGet(
@Parameter(description = "Deal ID",required=true) @PathParam("dealid") Integer dealid
) {
        return delegate.dealInfoDealidGet(dealid, securityContext);
    }

    @GET
    @Path("/proposal/{propcid}")
    
    
    @Operation(summary = "Get Proposal", description = "This endpoint returns the proposal for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealProposalPropcidGet(
@Parameter(description = "Proposal CID",required=true) @PathParam("propcid") String propcid
) {
        return delegate.dealProposalPropcidGet(propcid, securityContext);
    }

    @GET
    @Path("/query/{miner}")
    
    
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealQueryMinerGet(
@Parameter(description = "CID",required=true) @PathParam("miner") String miner
) {
        return delegate.dealQueryMinerGet(miner, securityContext);
    }

    @GET
    @Path("/status-by-proposal/{propcid}")
    
    
    @Operation(summary = "Get Deal Status by PropCid", description = "Get Deal Status by PropCid", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealStatusByProposalPropcidGet(
@Parameter(description = "PropCid",required=true) @PathParam("propcid") String propcid
) {
        return delegate.dealStatusByProposalPropcidGet(propcid, securityContext);
    }

    @GET
    @Path("/status/{miner}/{propcid}")
    
    
    @Operation(summary = "Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealStatusMinerPropcidGet(
@Parameter(description = "Miner",required=true) @PathParam("miner") String miner
, 
@Parameter(description = "Proposal CID",required=true) @PathParam("propcid") String propcid
) {
        return delegate.dealStatusMinerPropcidGet(miner, propcid, securityContext);
    }

    @GET
    @Path("/transfer/in-progress")
    
    
    @Operation(summary = "Transfer In Progress", description = "This endpoint returns the in-progress transfers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealTransferInProgressGet() {
        return delegate.dealTransferInProgressGet(securityContext);
    }

    @POST
    @Path("/transfer/status")
    
    
    @Operation(summary = "Transfer Status", description = "This endpoint returns the status of a transfer", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealTransferStatusPost() {
        return delegate.dealTransferStatusPost(securityContext);
    }
}
