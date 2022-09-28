package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-09-27T20:40:41.950348-10:00[Pacific/Honolulu]")public interface AdminApiService {
      Response adminAutoretrieveInitPost(String body,SecurityContext securityContext)
      throws NotFoundException;
      Response adminAutoretrieveListGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringPeersDelete(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringPeersGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringPeersPost(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringStartPost(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringStatusGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringStopPost(SecurityContext securityContext)
      throws NotFoundException;
      Response adminSystemConfigGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminUsersGet(SecurityContext securityContext)
      throws NotFoundException;
}
