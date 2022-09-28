package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.MainEstimateDealBody;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/deal")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-09-27T20:40:44.339579-10:00[Pacific/Honolulu]")public interface DealApi  {
   
    @POST
    @Path("/estimate")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Estimate the cost of a deal", description = "This endpoint estimates the cost of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealEstimatePost(@Parameter(description = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks" ,required=true) MainEstimateDealBody body,@Context SecurityContext securityContext);

    @GET
    @Path("/info/{dealid}")
    
    
    @Operation(summary = "Get Deal Info", description = "This endpoint returns the deal info for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealInfoDealidGet( @PathParam("dealid") Integer dealid,@Context SecurityContext securityContext);

    @GET
    @Path("/proposal/{propcid}")
    
    
    @Operation(summary = "Get Proposal", description = "This endpoint returns the proposal for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealProposalPropcidGet( @PathParam("propcid") String propcid,@Context SecurityContext securityContext);

    @GET
    @Path("/query/{miner}")
    
    
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealQueryMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @GET
    @Path("/status-by-proposal/{propcid}")
    
    
    @Operation(summary = "Get Deal Status by PropCid", description = "Get Deal Status by PropCid", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealStatusByProposalPropcidGet( @PathParam("propcid") String propcid,@Context SecurityContext securityContext);

    @GET
    @Path("/status/{miner}/{propcid}")
    
    
    @Operation(summary = "Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealStatusMinerPropcidGet( @PathParam("miner") String miner, @PathParam("propcid") String propcid,@Context SecurityContext securityContext);

    @GET
    @Path("/transfer/in-progress")
    
    
    @Operation(summary = "Transfer In Progress", description = "This endpoint returns the in-progress transfers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealTransferInProgressGet(@Context SecurityContext securityContext);

    @POST
    @Path("/transfer/status")
    
    
    @Operation(summary = "Transfer Status", description = "This endpoint returns the status of a transfer", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {
 })
    Response dealTransferStatusPost(@Context SecurityContext securityContext);

}
