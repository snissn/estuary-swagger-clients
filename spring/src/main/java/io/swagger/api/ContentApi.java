/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.MainImportDealBody;
import org.springframework.core.io.Resource;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-10-04T07:14:06.505Z")

@Validated
@Api(value = "content", description = "the content API")
@RequestMapping(value = "")
public interface ContentApi {

    @ApiOperation(value = "Add Car object", nickname = "contentAddCarPost", notes = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/add-car",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> contentAddCarPost(@ApiParam(value = "Car" ,required=true )  @Valid @RequestBody String body,@ApiParam(value = "Filename") @Valid @RequestParam(value = "filename", required = false) String filename,@ApiParam(value = "Commp") @Valid @RequestParam(value = "commp", required = false) String commp,@ApiParam(value = "Size") @Valid @RequestParam(value = "size", required = false) String size);


    @ApiOperation(value = "Add IPFS object", nickname = "contentAddIpfsPost", notes = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/add-ipfs",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> contentAddIpfsPost(@ApiParam(value = "IPFS Body" ,required=true )  @Valid @RequestBody UtilContentAddIpfsBody body);


    @ApiOperation(value = "Add new content", nickname = "contentAddPost", notes = "This endpoint is used to upload new content.", response = UtilContentAddResponse.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UtilContentAddResponse.class) })
    @RequestMapping(value = "/content/add",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<UtilContentAddResponse> contentAddPost(@ApiParam(value = "File to upload") @Valid @RequestPart(value="data", required=true) MultipartFile data,@ApiParam(value = "Collection UUID") @Valid @RequestParam(value = "coluuid", required = false) String coluuid,@ApiParam(value = "Directory") @Valid @RequestParam(value = "dir", required = false) String dir);


    @ApiOperation(value = "Get aggregated content stats", nickname = "contentAggregatedContentGet", notes = "This endpoint returns aggregated content stats", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    @RequestMapping(value = "/content/aggregated/{content}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> contentAggregatedContentGet(@ApiParam(value = "Content ID",required=true) @PathVariable("content") String content);


    @ApiOperation(value = "Get all deals for a user", nickname = "contentAllDealsGet", notes = "This endpoint is used to get all deals for a user", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/all-deals",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentAllDealsGet(@NotNull @ApiParam(value = "Begin", required = true) @Valid @RequestParam(value = "begin", required = true) String begin,@NotNull @ApiParam(value = "Duration", required = true) @Valid @RequestParam(value = "duration", required = true) String duration,@NotNull @ApiParam(value = "All", required = true) @Valid @RequestParam(value = "all", required = true) String all);


    @ApiOperation(value = "Get content bandwidth", nickname = "contentBwUsageContentGet", notes = "This endpoint returns content bandwidth", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/bw-usage/{content}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentBwUsageContentGet(@ApiParam(value = "Content ID",required=true) @PathVariable("content") String content);


    @ApiOperation(value = "Add a new content", nickname = "contentCreatePost", notes = "This endpoint adds a new content", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/create",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> contentCreatePost(@ApiParam(value = "Content" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "Content with deals", nickname = "contentDealsGet", notes = "This endpoint lists all content with deals", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/deals",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentDealsGet(@ApiParam(value = "Limit") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Offset") @Valid @RequestParam(value = "offset", required = false) Integer offset);


    @ApiOperation(value = "Ensure Replication", nickname = "contentEnsureReplicationDatacidGet", notes = "This endpoint ensures that the content is replicated to the specified number of providers", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/ensure-replication/{datacid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentEnsureReplicationDatacidGet(@ApiParam(value = "Data CID",required=true) @PathVariable("datacid") String datacid);


    @ApiOperation(value = "List all failures for a content", nickname = "contentFailuresContentGet", notes = "This endpoint returns all failures for a content", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    @RequestMapping(value = "/content/failures/{content}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> contentFailuresContentGet(@ApiParam(value = "Content ID",required=true) @PathVariable("content") String content);


    @ApiOperation(value = "Import a deal", nickname = "contentImportdealPost", notes = "This endpoint imports a deal into the shuttle.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/importdeal",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> contentImportdealPost(@ApiParam(value = "Import a deal" ,required=true )  @Valid @RequestBody MainImportDealBody body);


    @ApiOperation(value = "List all pinned content", nickname = "contentListGet", notes = "This endpoint lists all content", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @RequestMapping(value = "/content/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> contentListGet();


    @ApiOperation(value = "Read content", nickname = "contentReadContGet", notes = "This endpoint reads content from the blockstore", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/read/{cont}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentReadContGet(@ApiParam(value = "CID",required=true) @PathVariable("cont") String cont);


    @ApiOperation(value = "Get staging zone for user", nickname = "contentStagingZonesGet", notes = "This endpoint is used to get staging zone for user.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/staging-zones",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentStagingZonesGet();


    @ApiOperation(value = "Get content statistics", nickname = "contentStatsGet", notes = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/stats",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentStatsGet(@ApiParam(value = "limit",required=true) @PathVariable("limit") String limit);


    @ApiOperation(value = "Content Status", nickname = "contentStatusIdGet", notes = "This endpoint returns the status of a content", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/content/status/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> contentStatusIdGet(@ApiParam(value = "Content ID",required=true) @PathVariable("id") Integer id);

}
