/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.MainEstimateDealBody;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-29T01:54:50.129Z")

@Validated
@Api(value = "deal", description = "the deal API")
@RequestMapping(value = "")
public interface DealApi {

    @ApiOperation(value = "Estimate the cost of a deal", nickname = "dealEstimatePost", notes = "This endpoint estimates the cost of a deal", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/estimate",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> dealEstimatePost(@ApiParam(value = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks" ,required=true )  @Valid @RequestBody MainEstimateDealBody body);


    @ApiOperation(value = "Get Deal Info", nickname = "dealInfoDealidGet", notes = "This endpoint returns the deal info for a deal", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/info/{dealid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> dealInfoDealidGet(@ApiParam(value = "Deal ID",required=true) @PathVariable("dealid") Integer dealid);


    @ApiOperation(value = "Get Proposal", nickname = "dealProposalPropcidGet", notes = "This endpoint returns the proposal for a deal", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/proposal/{propcid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> dealProposalPropcidGet(@ApiParam(value = "Proposal CID",required=true) @PathVariable("propcid") String propcid);


    @ApiOperation(value = "Query Ask", nickname = "dealQueryMinerGet", notes = "This endpoint returns the ask for a given CID", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/query/{miner}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> dealQueryMinerGet(@ApiParam(value = "CID",required=true) @PathVariable("miner") String miner);


    @ApiOperation(value = "Get Deal Status by PropCid", nickname = "dealStatusByProposalPropcidGet", notes = "Get Deal Status by PropCid", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/status-by-proposal/{propcid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> dealStatusByProposalPropcidGet(@ApiParam(value = "PropCid",required=true) @PathVariable("propcid") String propcid);


    @ApiOperation(value = "Deal Status", nickname = "dealStatusMinerPropcidGet", notes = "This endpoint returns the status of a deal", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/status/{miner}/{propcid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> dealStatusMinerPropcidGet(@ApiParam(value = "Miner",required=true) @PathVariable("miner") String miner,@ApiParam(value = "Proposal CID",required=true) @PathVariable("propcid") String propcid);


    @ApiOperation(value = "Transfer In Progress", nickname = "dealTransferInProgressGet", notes = "This endpoint returns the in-progress transfers", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/transfer/in-progress",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> dealTransferInProgressGet();


    @ApiOperation(value = "Transfer Status", nickname = "dealTransferStatusPost", notes = "This endpoint returns the status of a transfer", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/deal/transfer/status",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> dealTransferStatusPost();

}
