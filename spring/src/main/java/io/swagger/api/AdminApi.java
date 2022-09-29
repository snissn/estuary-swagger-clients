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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-29T01:58:01.165Z")

@Validated
@Api(value = "admin", description = "the admin API")
@RequestMapping(value = "")
public interface AdminApi {

    @ApiOperation(value = "Register autoretrieve server", nickname = "adminAutoretrieveInitPost", notes = "This endpoint registers a new autoretrieve server", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/autoretrieve/init",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> adminAutoretrieveInitPost(@ApiParam(value = "Autoretrieve's comma-separated list of addresses" ,required=true )  @Valid @RequestBody String addresses,@ApiParam(value = "Autoretrieve's public key" ,required=true )  @Valid @RequestBody String pubKey);


    @ApiOperation(value = "List autoretrieve servers", nickname = "adminAutoretrieveListGet", notes = "This endpoint lists all registered autoretrieve servers", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/autoretrieve/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> adminAutoretrieveListGet();


    @ApiOperation(value = "Remove peers on Peering Service", nickname = "adminPeeringPeersDelete", notes = "This endpoint can be used to remove a Peer from the Peering Service", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/peering/peers",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> adminPeeringPeersDelete();


    @ApiOperation(value = "List all Peering peers", nickname = "adminPeeringPeersGet", notes = "This endpoint can be used to list all peers on Peering Service", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/peering/peers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> adminPeeringPeersGet();


    @ApiOperation(value = "Add peers on Peering Service", nickname = "adminPeeringPeersPost", notes = "This endpoint can be used to add a Peer from the Peering Service", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/peering/peers",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> adminPeeringPeersPost();


    @ApiOperation(value = "Start Peering", nickname = "adminPeeringStartPost", notes = "This endpoint can be used to start the Peering Service", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/peering/start",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> adminPeeringStartPost();


    @ApiOperation(value = "Check Peering Status", nickname = "adminPeeringStatusGet", notes = "This endpoint can be used to check the Peering status", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/peering/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> adminPeeringStatusGet();


    @ApiOperation(value = "Stop Peering", nickname = "adminPeeringStopPost", notes = "This endpoint can be used to stop the Peering Service", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/peering/stop",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> adminPeeringStopPost();


    @ApiOperation(value = "Get systems(estuary/shuttle) config", nickname = "adminSystemConfigGet", notes = "This endpoint is used to get system configs.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/system/config",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> adminSystemConfigGet();


    @ApiOperation(value = "Get all users", nickname = "adminUsersGet", notes = "This endpoint is used to get all users.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/admin/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> adminUsersGet();

}
