package io.swagger.api;

import io.swagger.model.MainImportDealBody;
import org.springframework.core.io.Resource;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-27T20:41:13.008650-10:00[Pacific/Honolulu]")
@RestController
public class ContentApiController implements ContentApi {

    private static final Logger log = LoggerFactory.getLogger(ContentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> contentAddCarPost(@Parameter(in = ParameterIn.DEFAULT, description = "Car", required=true, schema=@Schema()) @Valid @RequestBody String body,@Parameter(in = ParameterIn.QUERY, description = "Filename" ,schema=@Schema()) @Valid @RequestParam(value = "filename", required = false) String filename,@Parameter(in = ParameterIn.QUERY, description = "Commp" ,schema=@Schema()) @Valid @RequestParam(value = "commp", required = false) String commp,@Parameter(in = ParameterIn.QUERY, description = "Size" ,schema=@Schema()) @Valid @RequestParam(value = "size", required = false) String size) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentAddIpfsPost(@Parameter(in = ParameterIn.DEFAULT, description = "IPFS Body", required=true, schema=@Schema()) @Valid @RequestBody UtilContentAddIpfsBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UtilContentAddResponse> contentAddPost(@Parameter(in = ParameterIn.PATH, description = "Collection UUID", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid,@Parameter(in = ParameterIn.PATH, description = "Directory", required=true, schema=@Schema()) @PathVariable("dir") String dir,@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile file) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UtilContentAddResponse>(objectMapper.readValue("{\n  \"retrieval_url\" : \"retrieval_url\",\n  \"estuaryId\" : 0,\n  \"providers\" : [ \"providers\", \"providers\" ],\n  \"cid\" : \"cid\"\n}", UtilContentAddResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UtilContentAddResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UtilContentAddResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> contentAggregatedContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("content") String content) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentAllDealsGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Begin" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "begin", required = true) String begin,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Duration" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "duration", required = true) String duration,@NotNull @Parameter(in = ParameterIn.QUERY, description = "All" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "all", required = true) String all) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentBwUsageContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("content") String content) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentCreatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Content", required=true, schema=@Schema()) @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentDealsGet(@Parameter(in = ParameterIn.QUERY, description = "Limit" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Offset" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentEnsureReplicationDatacidGet(@Parameter(in = ParameterIn.PATH, description = "Data CID", required=true, schema=@Schema()) @PathVariable("datacid") String datacid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> contentFailuresContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("content") String content) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentImportdealPost(@Parameter(in = ParameterIn.DEFAULT, description = "Import a deal", required=true, schema=@Schema()) @Valid @RequestBody MainImportDealBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<String>> contentListGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentReadContGet(@Parameter(in = ParameterIn.PATH, description = "CID", required=true, schema=@Schema()) @PathVariable("cont") String cont) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentStagingZonesGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentStatsGet(@Parameter(in = ParameterIn.PATH, description = "limit", required=true, schema=@Schema()) @PathVariable("limit") String limit) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentStatusIdGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
