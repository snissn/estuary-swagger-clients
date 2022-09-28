package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-09-27T20:40:33.778721-10:00[Pacific/Honolulu]")public interface CollectionsApiService {
      public Response collectionsColuuidCommitPost(String coluuid, SecurityContext securityContext);
      public Response collectionsColuuidDelete(String coluuid, SecurityContext securityContext);
      public Response collectionsColuuidGet(String coluuid, String dir, SecurityContext securityContext);
      public Response collectionsColuuidPost(List<Integer> body, SecurityContext securityContext);
      public Response collectionsFsAddPost(String coluuid, String content, String path, SecurityContext securityContext);
      public Response collectionsGet(Integer id, SecurityContext securityContext);
      public Response collectionsPost(MainCreateCollectionBody body, SecurityContext securityContext);
}