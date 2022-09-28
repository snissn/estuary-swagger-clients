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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-09-27T20:40:37.264153-10:00[Pacific/Honolulu]")public interface ContentApiService {
    public Response contentAddCarPost(String body, String filename, String commp, String size,SecurityContext securityContext);
    public Response contentAddIpfsPost(UtilContentAddIpfsBody body,SecurityContext securityContext);
    public Response contentAddPost(InputStream fileInputStream, FormDataContentDisposition fileDetail,String coluuid,String dir,SecurityContext securityContext);
    public Response contentAggregatedContentGet(String content,SecurityContext securityContext);
    public Response contentAllDealsGet( @NotNull String begin, @NotNull String duration, @NotNull String all,SecurityContext securityContext);
    public Response contentBwUsageContentGet(String content,SecurityContext securityContext);
    public Response contentCreatePost(String body,SecurityContext securityContext);
    public Response contentDealsGet( Integer limit, Integer offset,SecurityContext securityContext);
    public Response contentEnsureReplicationDatacidGet(String datacid,SecurityContext securityContext);
    public Response contentFailuresContentGet(String content,SecurityContext securityContext);
    public Response contentImportdealPost(MainImportDealBody body,SecurityContext securityContext);
    public Response contentListGet(SecurityContext securityContext);
    public Response contentReadContGet(String cont,SecurityContext securityContext);
    public Response contentStagingZonesGet(SecurityContext securityContext);
    public Response contentStatsGet(String limit,SecurityContext securityContext);
    public Response contentStatusIdGet(Integer id,SecurityContext securityContext);
}