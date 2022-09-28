package io.swagger.api.factories;

import io.swagger.api.AdminApiService;
import io.swagger.api.impl.AdminApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public class AdminApiServiceFactory {
    private final static AdminApiService service = new AdminApiServiceImpl();

    public static AdminApiService getAdminApi() {
        return service;
    }
}
