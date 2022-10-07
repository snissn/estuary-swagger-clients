package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import java.io.InputStream;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-10-07T01:37:04.283Z")
public interface ContentApiService {
      public Response contentAddCarPost(String body, String filename, String commp, String size, SecurityContext securityContext);
      public Response contentAddIpfsPost(UtilContentAddIpfsBody body, SecurityContext securityContext);
      public Response contentAddPost(InputStream dataInputStream, Attachment dataDetail, String coluuid, String dir, SecurityContext securityContext);
      public Response contentAggregatedContentGet(String content, SecurityContext securityContext);
      public Response contentAllDealsGet(String begin, String duration, String all, SecurityContext securityContext);
      public Response contentBwUsageContentGet(String content, SecurityContext securityContext);
      public Response contentCreatePost(String body, SecurityContext securityContext);
      public Response contentDealsGet(Integer limit, Integer offset, SecurityContext securityContext);
      public Response contentEnsureReplicationDatacidGet(String datacid, SecurityContext securityContext);
      public Response contentFailuresContentGet(String content, SecurityContext securityContext);
      public Response contentImportdealPost(MainImportDealBody body, SecurityContext securityContext);
      public Response contentListGet(SecurityContext securityContext);
      public Response contentReadContGet(String cont, SecurityContext securityContext);
      public Response contentStagingZonesGet(SecurityContext securityContext);
      public Response contentStatsGet(String limit, SecurityContext securityContext);
      public Response contentStatusIdGet(Integer id, SecurityContext securityContext);
}
