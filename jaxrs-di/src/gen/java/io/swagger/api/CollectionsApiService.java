package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-09-27T20:40:37.264153-10:00[Pacific/Honolulu]")public interface CollectionsApiService {
    public Response collectionsColuuidCommitPost(String coluuid,SecurityContext securityContext);
    public Response collectionsColuuidDelete(String coluuid,SecurityContext securityContext);
    public Response collectionsColuuidGet( @NotNull String coluuid, String dir,SecurityContext securityContext);
    public Response collectionsColuuidPost(List<Integer> body,SecurityContext securityContext);
    public Response collectionsFsAddPost( @NotNull String coluuid, @NotNull String content, @NotNull String path,SecurityContext securityContext);
    public Response collectionsGet(Integer id,SecurityContext securityContext);
    public Response collectionsPost(MainCreateCollectionBody body,SecurityContext securityContext);
}
