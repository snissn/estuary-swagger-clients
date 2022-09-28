package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-09-27T20:40:33.778721-10:00[Pacific/Honolulu]")public interface PinningApiService {
      public Response pinningPinsGet(SecurityContext securityContext);
      public Response pinningPinsPinidDelete(String pinid, SecurityContext securityContext);
      public Response pinningPinsPinidGet(String pinid, SecurityContext securityContext);
      public Response pinningPinsPinidPost(String pinid, SecurityContext securityContext);
      public Response pinningPinsPost(String cid, String name, SecurityContext securityContext);
}
