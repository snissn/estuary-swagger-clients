/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 * API tests for ContentApi 
 */
public class ContentApiTest {


    private ContentApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://api.estuary.tech", ContentApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Add Car object
     *
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentAddCarPostTest() {
        String body = null;
        String filename = null;
        String commp = null;
        String size = null;
        //api.contentAddCarPost(body, filename, commp, size);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Add IPFS object
     *
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentAddIpfsPostTest() {
        UtilContentAddIpfsBody body = null;
        //api.contentAddIpfsPost(body);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Add new content
     *
     * This endpoint is used to upload new content.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentAddPostTest() {
        org.apache.cxf.jaxrs.ext.multipart.Attachment data = null;
        String coluuid = null;
        String dir = null;
        //UtilContentAddResponse response = api.contentAddPost(data, coluuid, dir);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get aggregated content stats
     *
     * This endpoint returns aggregated content stats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentAggregatedContentGetTest() {
        String content = null;
        //String response = api.contentAggregatedContentGet(content);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get all deals for a user
     *
     * This endpoint is used to get all deals for a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentAllDealsGetTest() {
        String begin = null;
        String duration = null;
        String all = null;
        //api.contentAllDealsGet(begin, duration, all);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get content bandwidth
     *
     * This endpoint returns content bandwidth
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentBwUsageContentGetTest() {
        String content = null;
        //api.contentBwUsageContentGet(content);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Add a new content
     *
     * This endpoint adds a new content
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentCreatePostTest() {
        String body = null;
        //api.contentCreatePost(body);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Content with deals
     *
     * This endpoint lists all content with deals
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentDealsGetTest() {
        Integer limit = null;
        Integer offset = null;
        //api.contentDealsGet(limit, offset);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Ensure Replication
     *
     * This endpoint ensures that the content is replicated to the specified number of providers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentEnsureReplicationDatacidGetTest() {
        String datacid = null;
        //api.contentEnsureReplicationDatacidGet(datacid);
        
        // TODO: test validations
        
        
    }
    
    /**
     * List all failures for a content
     *
     * This endpoint returns all failures for a content
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentFailuresContentGetTest() {
        String content = null;
        //String response = api.contentFailuresContentGet(content);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Import a deal
     *
     * This endpoint imports a deal into the shuttle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentImportdealPostTest() {
        MainImportDealBody body = null;
        //api.contentImportdealPost(body);
        
        // TODO: test validations
        
        
    }
    
    /**
     * List all pinned content
     *
     * This endpoint lists all content
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentListGetTest() {
        //List<String> response = api.contentListGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Read content
     *
     * This endpoint reads content from the blockstore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentReadContGetTest() {
        String cont = null;
        //api.contentReadContGet(cont);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get staging zone for user
     *
     * This endpoint is used to get staging zone for user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentStagingZonesGetTest() {
        //api.contentStagingZonesGet();
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get content statistics
     *
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentStatsGetTest() {
        String limit = null;
        //api.contentStatsGet(limit);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Content Status
     *
     * This endpoint returns the status of a content
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentStatusIdGetTest() {
        Integer id = null;
        //api.contentStatusIdGet(id);
        
        // TODO: test validations
        
        
    }
    
}
