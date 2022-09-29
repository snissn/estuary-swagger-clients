/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.MainUserStatsResponse;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-29T01:53:12.142Z")

@Validated
@Api(value = "user", description = "the user API")
@RequestMapping(value = "")
public interface UserApi {

    @ApiOperation(value = "Get API keys for a user", nickname = "userApiKeysGet", notes = "This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.", response = MainGetApiKeysResp.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainGetApiKeysResp.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/user/api-keys",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<MainGetApiKeysResp>> userApiKeysGet();


    @ApiOperation(value = "Revoke a User API Key.", nickname = "userApiKeysKeyDelete", notes = "This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/user/api-keys/{key}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> userApiKeysKeyDelete(@ApiParam(value = "Key",required=true) @PathVariable("key") String key);


    @ApiOperation(value = "Create API keys for a user", nickname = "userApiKeysPost", notes = "This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.", response = MainGetApiKeysResp.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainGetApiKeysResp.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/user/api-keys",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<MainGetApiKeysResp> userApiKeysPost();


    @ApiOperation(value = "Export user data", nickname = "userExportGet", notes = "This endpoint is used to get API keys for a user.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    @RequestMapping(value = "/user/export",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> userExportGet();


    @ApiOperation(value = "Create API keys for a user", nickname = "userStatsGet", notes = "This endpoint is used to create API keys for a user.", response = MainUserStatsResponse.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainUserStatsResponse.class) })
    @RequestMapping(value = "/user/stats",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<MainUserStatsResponse> userStatsGet();

}
