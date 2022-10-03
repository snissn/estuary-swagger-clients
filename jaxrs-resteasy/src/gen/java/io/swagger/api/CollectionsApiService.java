package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.CollectionsCollection;
import java.util.List;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-03T07:43:19.698Z")
public interface CollectionsApiService {
      Response collectionsColuuidCommitPost(String coluuid,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidContentsDelete(String coluuid,String contentid,String by,String value,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidDelete(String coluuid,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidGet(String coluuid,String dir,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidPost(List<Integer> body,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsFsAddPost(String coluuid,String content,String path,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsPost(MainCreateCollectionBody body,SecurityContext securityContext)
      throws NotFoundException;
}
