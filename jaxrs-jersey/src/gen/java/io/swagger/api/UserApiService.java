package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.MainUserStatsResponse;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public abstract class UserApiService {
    public abstract Response userApiKeysGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userApiKeysKeyDelete(String key,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userApiKeysPost(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userExportGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userStatsGet(SecurityContext securityContext) throws NotFoundException;
}
