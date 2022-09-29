/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.UtilHttpError;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-29T08:49:46.056Z")

@Validated
@Api(value = "pinning", description = "the pinning API")
@RequestMapping(value = "")
public interface PinningApi {

    @ApiOperation(value = "List all pin status objects", nickname = "pinningPinsGet", notes = "This endpoint lists all pin status objects", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/pinning/pins",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> pinningPinsGet();


    @ApiOperation(value = "Delete a pinned object", nickname = "pinningPinsPinidDelete", notes = "This endpoint deletes a pinned object.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/pinning/pins/{pinid}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> pinningPinsPinidDelete(@ApiParam(value = "Pin ID",required=true) @PathVariable("pinid") String pinid);


    @ApiOperation(value = "Get a pin status object", nickname = "pinningPinsPinidGet", notes = "This endpoint returns a pin status object.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/pinning/pins/{pinid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> pinningPinsPinidGet(@ApiParam(value = "cid",required=true) @PathVariable("pinid") String pinid);


    @ApiOperation(value = "Replace a pinned object", nickname = "pinningPinsPinidPost", notes = "This endpoint replaces a pinned object.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/pinning/pins/{pinid}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> pinningPinsPinidPost(@ApiParam(value = "Pin ID",required=true) @PathVariable("pinid") String pinid);


    @ApiOperation(value = "Add and pin object", nickname = "pinningPinsPost", notes = "This endpoint adds a pin to the IPFS daemon.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/pinning/pins",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> pinningPinsPost(@ApiParam(value = "cid",required=true) @PathVariable("cid") String cid,@ApiParam(value = "name",required=true) @PathVariable("name") String name);

}
