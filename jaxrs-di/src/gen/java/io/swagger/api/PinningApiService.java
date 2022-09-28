package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-09-27T20:40:37.264153-10:00[Pacific/Honolulu]")public interface PinningApiService {
    public Response pinningPinsGet(SecurityContext securityContext);
    public Response pinningPinsPinidDelete(String pinid,SecurityContext securityContext);
    public Response pinningPinsPinidGet(String pinid,SecurityContext securityContext);
    public Response pinningPinsPinidPost(String pinid,SecurityContext securityContext);
    public Response pinningPinsPost(String cid,String name,SecurityContext securityContext);
}
