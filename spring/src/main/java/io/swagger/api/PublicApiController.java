package io.swagger.api;

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
public class PublicApiController implements PublicApi {

    private static final Logger log = LoggerFactory.getLogger(PublicApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PublicApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> publicByCidCidGet(@Parameter(in = ParameterIn.PATH, description = "Cid", required=true, schema=@Schema()) @PathVariable("cid") String cid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicDealsFailuresGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicInfoGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicMetricsDealsOnChainGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicMinersDealsMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicMinersFailuresMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicMinersGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicMinersStatsMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> publicMinersStorageQueryMinerGet(@Parameter(in = ParameterIn.PATH, description = "CID", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<String>> publicNetAddrsGet() {
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

    public ResponseEntity<List<String>> publicNetPeersGet() {
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

    public ResponseEntity<Void> publicStatsGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
