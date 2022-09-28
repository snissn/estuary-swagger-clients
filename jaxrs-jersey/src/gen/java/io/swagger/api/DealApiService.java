package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.MainEstimateDealBody;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-09-27T20:40:39.504997-10:00[Pacific/Honolulu]")public abstract class DealApiService {
    public abstract Response dealEstimatePost(MainEstimateDealBody body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealInfoDealidGet(Integer dealid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealProposalPropcidGet(String propcid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealQueryMinerGet(String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealStatusByProposalPropcidGet(String propcid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealStatusMinerPropcidGet(String miner,String propcid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealTransferInProgressGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealTransferStatusPost(SecurityContext securityContext) throws NotFoundException;
}
