package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public abstract class ContentApiService {
    public abstract Response contentAddCarPost(String body, String filename, String commp, String size,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAddIpfsPost(UtilContentAddIpfsBody body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAddPost(InputStream fileInputStream, FormDataContentDisposition fileDetail,String coluuid,String dir,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAggregatedContentGet(String content,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAllDealsGet( @NotNull String begin, @NotNull String duration, @NotNull String all,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentBwUsageContentGet(String content,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentCreatePost(String body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentDealsGet( Integer limit, Integer offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentEnsureReplicationDatacidGet(String datacid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentFailuresContentGet(String content,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentImportdealPost(MainImportDealBody body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentListGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentReadContGet(String cont,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStagingZonesGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStatsGet(String limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStatusIdGet(Integer id,SecurityContext securityContext) throws NotFoundException;
}
