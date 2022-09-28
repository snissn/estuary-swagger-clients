package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-09-27T20:40:37.264153-10:00[Pacific/Honolulu]")public interface AdminApiService {
    public Response adminAutoretrieveInitPost(String body,SecurityContext securityContext);
    public Response adminAutoretrieveListGet(SecurityContext securityContext);
    public Response adminPeeringPeersDelete(SecurityContext securityContext);
    public Response adminPeeringPeersGet(SecurityContext securityContext);
    public Response adminPeeringPeersPost(SecurityContext securityContext);
    public Response adminPeeringStartPost(SecurityContext securityContext);
    public Response adminPeeringStatusGet(SecurityContext securityContext);
    public Response adminPeeringStopPost(SecurityContext securityContext);
    public Response adminSystemConfigGet(SecurityContext securityContext);
    public Response adminUsersGet(SecurityContext securityContext);
}
