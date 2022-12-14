/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-10-07T01:37:44.986Z")

@Validated
@Api(value = "public", description = "the public API")
@RequestMapping(value = "")
public interface PublicApi {

    @ApiOperation(value = "Get Content by Cid", nickname = "publicByCidCidGet", notes = "This endpoint returns the content associated with a CID", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/by-cid/{cid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicByCidCidGet(@ApiParam(value = "Cid",required=true) @PathVariable("cid") String cid);


    @ApiOperation(value = "Get storage failures", nickname = "publicDealsFailuresGet", notes = "This endpoint returns a list of storage failures", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/deals/failures",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicDealsFailuresGet();


    @ApiOperation(value = "Get public node info", nickname = "publicInfoGet", notes = "This endpoint returns information about the node", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/info",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicInfoGet();


    @ApiOperation(value = "Get deal metrics", nickname = "publicMetricsDealsOnChainGet", notes = "This endpoint is used to get deal metrics", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public","metrics", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/metrics/deals-on-chain",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicMetricsDealsOnChainGet();


    @ApiOperation(value = "Get all miners deals", nickname = "publicMinersDealsMinerGet", notes = "This endpoint returns all miners deals", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public","miner", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/miners/deals/{miner}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicMinersDealsMinerGet(@ApiParam(value = "Filter by miner",required=true) @PathVariable("miner") String miner);


    @ApiOperation(value = "Get all miners", nickname = "publicMinersFailuresMinerGet", notes = "This endpoint returns all miners", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/miners/failures/{miner}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicMinersFailuresMinerGet(@ApiParam(value = "Filter by miner",required=true) @PathVariable("miner") String miner);


    @ApiOperation(value = "Get all miners", nickname = "publicMinersGet", notes = "This endpoint returns all miners", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/miners",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicMinersGet();


    @ApiOperation(value = "Get miner stats", nickname = "publicMinersStatsMinerGet", notes = "This endpoint returns miner stats", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public","miner", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/miners/stats/{miner}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicMinersStatsMinerGet(@ApiParam(value = "Filter by miner",required=true) @PathVariable("miner") String miner);


    @ApiOperation(value = "Query Ask", nickname = "publicMinersStorageQueryMinerGet", notes = "This endpoint returns the ask for a given CID", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/miners/storage/query/{miner}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicMinersStorageQueryMinerGet(@ApiParam(value = "CID",required=true) @PathVariable("miner") String miner);


    @ApiOperation(value = "Net Addrs", nickname = "publicNetAddrsGet", notes = "This endpoint is used to get net addrs", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @RequestMapping(value = "/public/net/addrs",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> publicNetAddrsGet();


    @ApiOperation(value = "Net Peers", nickname = "publicNetPeersGet", notes = "This endpoint is used to get net peers", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public","net", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @RequestMapping(value = "/public/net/peers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> publicNetPeersGet();


    @ApiOperation(value = "Public stats", nickname = "publicStatsGet", notes = "This endpoint is used to get public stats.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/public/stats",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> publicStatsGet();

}
