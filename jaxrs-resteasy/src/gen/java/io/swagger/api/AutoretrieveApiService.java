package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-09-29T01:57:32.693Z")
public interface AutoretrieveApiService {
      Response autoretrieveHeartbeatPost(String token,SecurityContext securityContext)
      throws NotFoundException;
}
