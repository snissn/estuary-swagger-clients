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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-10-04T07:14:06.505Z")

@Validated
@Api(value = "autoretrieve", description = "the autoretrieve API")
@RequestMapping(value = "")
public interface AutoretrieveApi {

    @ApiOperation(value = "Marks autoretrieve server as up", nickname = "autoretrieveHeartbeatPost", notes = "This endpoint updates the lastConnection field for autoretrieve", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/autoretrieve/heartbeat",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> autoretrieveHeartbeatPost(@ApiParam(value = "Autoretrieve's auth token" ,required=true) @RequestHeader(value="token", required=true) String token);

}