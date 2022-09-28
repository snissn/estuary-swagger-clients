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
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public abstract class CollectionsApiService {
    public abstract Response collectionsColuuidCommitPost(String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidDelete(String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidGet( @NotNull String coluuid, String dir,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidPost(List<Integer> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsFsAddPost( @NotNull String coluuid, @NotNull String content, @NotNull String path,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsGet(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsPost(MainCreateCollectionBody body,SecurityContext securityContext) throws NotFoundException;
}
