package io.swagger.api.factories;

import io.swagger.api.CollectionsApiService;
import io.swagger.api.impl.CollectionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public class CollectionsApiServiceFactory {
    private final static CollectionsApiService service = new CollectionsApiServiceImpl();

    public static CollectionsApiService getCollectionsApi() {
        return service;
    }
}
