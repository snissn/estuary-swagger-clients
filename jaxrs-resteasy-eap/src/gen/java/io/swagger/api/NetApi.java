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


import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/net")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-09-27T20:40:44.339579-10:00[Pacific/Honolulu]")public interface NetApi  {
   
    @GET
    @Path("/addrs")
    
    @Produces({ "application/json" })
    @Operation(summary = "Net Addrs", description = "This endpoint is used to get net addrs", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "net" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))))
         })
    Response netAddrsGet(@Context SecurityContext securityContext);

}
