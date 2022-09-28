package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DealsApiService;
import io.swagger.api.factories.DealsApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/deals")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public class DealsApi  {
   private final DealsApiService delegate;

   public DealsApi(@Context ServletConfig servletContext) {
      DealsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DealsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DealsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DealsApiServiceFactory.getDealsApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/failures")
    
    
    @Operation(summary = "Get storage failures for user", description = "This endpoint returns a list of storage failures for user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealsFailuresGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealsFailuresGet(securityContext);
    }
    @POST
    @Path("/make/{miner}")
    @Consumes({ "*/*" })
    
    @Operation(summary = "Make Deal", description = "This endpoint makes a deal for a given content and miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealsMakeMinerPost(@Parameter(in = ParameterIn.DEFAULT, description = "Deal Request" ,required=true) String body

,@Parameter(in = ParameterIn.PATH, description = "Miner",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealsMakeMinerPost(body,miner,securityContext);
    }
    @GET
    @Path("/status/{deal}")
    
    
    @Operation(summary = "Get Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealsStatusDealGet(@Parameter(in = ParameterIn.PATH, description = "Deal ID",required=true) @PathParam("deal") Integer deal
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealsStatusDealGet(deal,securityContext);
    }
}
