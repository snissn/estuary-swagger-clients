package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-04T07:13:30.968Z")
public interface NetApiService {
      Response netAddrsGet(SecurityContext securityContext)
      throws NotFoundException;
}