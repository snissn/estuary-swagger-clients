package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-07T01:37:08.288Z")
public interface PinningApiService {
      Response pinningPinsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidDelete(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidGet(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidPost(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPost(String cid,String name,SecurityContext securityContext)
      throws NotFoundException;
}
