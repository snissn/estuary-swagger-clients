/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-09-27T20:40:53.180766-10:00[Pacific/Honolulu]")
@Controller
public interface ContentApi {


    @Operation(summary = "Add Car object", operationId = "contentAddCarPost", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory." , tags = {"content"})
    @Post(value = "/content/add-car", consumes = {"*/*"})
    default Single<HttpResponse<Void>> contentAddCarPost(@Parameter(description = "Car") @Valid @Body String body
,@Nullable @Parameter(description = "Filename") @Valid @QueryValue(value = "filename") String filename
,@Nullable @Parameter(description = "Commp") @Valid @QueryValue(value = "commp") String commp
,@Nullable @Parameter(description = "Size") @Valid @QueryValue(value = "size") String size
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add IPFS object", operationId = "contentAddIpfsPost", description = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory." , tags = {"content"})
    @Post(value = "/content/add-ipfs", consumes = {"*/*"})
    default Single<HttpResponse<Void>> contentAddIpfsPost(@Parameter(description = "IPFS Body") @Valid @Body UtilContentAddIpfsBody body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add new content", operationId = "contentAddPost", description = "This endpoint is used to upload new content." , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @Post(value = "/content/add", produces = { "application/json" }, consumes = {"multipart/form-data"})
    default Single<HttpResponse<UtilContentAddResponse>> contentAddPost(@Parameter(description = "file detail") @Valid MultipartFile file
,@Parameter(description = "Collection UUID") @PathVariable("coluuid") String coluuid
,@Parameter(description = "Directory") @PathVariable("dir") String dir
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get aggregated content stats", operationId = "contentAggregatedContentGet", description = "This endpoint returns aggregated content stats" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @Get(value = "/content/aggregated/{content}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentAggregatedContentGet(@Parameter(description = "Content ID") @PathVariable("content") String content
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all deals for a user", operationId = "contentAllDealsGet", description = "This endpoint is used to get all deals for a user" , tags = {"content"})
    @Get(value = "/content/all-deals")
    default Single<HttpResponse<Void>> contentAllDealsGet(@NotNull @Parameter(description = "Begin") @Valid @QueryValue(value = "begin") String begin
,@NotNull @Parameter(description = "Duration") @Valid @QueryValue(value = "duration") String duration
,@NotNull @Parameter(description = "All") @Valid @QueryValue(value = "all") String all
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get content bandwidth", operationId = "contentBwUsageContentGet", description = "This endpoint returns content bandwidth" , tags = {"content"})
    @Get(value = "/content/bw-usage/{content}")
    default Single<HttpResponse<Void>> contentBwUsageContentGet(@Parameter(description = "Content ID") @PathVariable("content") String content
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add a new content", operationId = "contentCreatePost", description = "This endpoint adds a new content" , tags = {"content"})
    @Post(value = "/content/create", consumes = {"*/*"})
    default Single<HttpResponse<Void>> contentCreatePost(@Parameter(description = "Content") @Valid @Body String body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Content with deals", operationId = "contentDealsGet", description = "This endpoint lists all content with deals" , tags = {"content"})
    @Get(value = "/content/deals")
    default Single<HttpResponse<Void>> contentDealsGet(@Nullable @Parameter(description = "Limit") @Valid @QueryValue(value = "limit") Integer limit
,@Nullable @Parameter(description = "Offset") @Valid @QueryValue(value = "offset") Integer offset
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Ensure Replication", operationId = "contentEnsureReplicationDatacidGet", description = "This endpoint ensures that the content is replicated to the specified number of providers" , tags = {"content"})
    @Get(value = "/content/ensure-replication/{datacid}")
    default Single<HttpResponse<Void>> contentEnsureReplicationDatacidGet(@Parameter(description = "Data CID") @PathVariable("datacid") String datacid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "List all failures for a content", operationId = "contentFailuresContentGet", description = "This endpoint returns all failures for a content" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @Get(value = "/content/failures/{content}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentFailuresContentGet(@Parameter(description = "Content ID") @PathVariable("content") String content
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Import a deal", operationId = "contentImportdealPost", description = "This endpoint imports a deal into the shuttle." , tags = {"content"})
    @Post(value = "/content/importdeal", consumes = {"*/*"})
    default Single<HttpResponse<Void>> contentImportdealPost(@Parameter(description = "Import a deal") @Valid @Body MainImportDealBody body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "List all pinned content", operationId = "contentListGet", description = "This endpoint lists all content" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @Get(value = "/content/list", produces = { "application/json" })
    default Single<HttpResponse<List<String>>> contentListGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Read content", operationId = "contentReadContGet", description = "This endpoint reads content from the blockstore" , tags = {"content"})
    @Get(value = "/content/read/{cont}")
    default Single<HttpResponse<Void>> contentReadContGet(@Parameter(description = "CID") @PathVariable("cont") String cont
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get staging zone for user", operationId = "contentStagingZonesGet", description = "This endpoint is used to get staging zone for user." , tags = {"content"})
    @Get(value = "/content/staging-zones")
    default Single<HttpResponse<Void>> contentStagingZonesGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get content statistics", operationId = "contentStatsGet", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten" , tags = {"content"})
    @Get(value = "/content/stats")
    default Single<HttpResponse<Void>> contentStatsGet(@Parameter(description = "limit") @PathVariable("limit") String limit
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Content Status", operationId = "contentStatusIdGet", description = "This endpoint returns the status of a content" , tags = {"content"})
    @Get(value = "/content/status/{id}")
    default Single<HttpResponse<Void>> contentStatusIdGet(@Parameter(description = "Content ID") @PathVariable("id") Integer id
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
