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

import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.UtilHttpError;
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
 * API tests for CollectionsApi 
 */
public class CollectionsApiTest {


    private CollectionsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("//api.estuary.tech/", CollectionsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Produce a CID of the collection contents
     *
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidCommitPostTest() {
        String coluuid = null;
        //String response = api.collectionsColuuidCommitPost(coluuid);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Deletes a collection
     *
     * This endpoint is used to delete an existing collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidDeleteTest() {
        String coluuid = null;
        //api.collectionsColuuidDelete(coluuid);
        
        // TODO: test validations
        
        
    }
    /**
     * Get contents in a collection
     *
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidGetTest() {
        String coluuid = null;
        String dir = null;
        //String response = api.collectionsColuuidGet(coluuid, dir);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Add contents to a collection
     *
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidPostTest() {
        List<Integer> body = null;
        //Map<String, String> response = api.collectionsColuuidPost(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Add a file to a collection
     *
     * This endpoint adds a file to a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsFsAddPostTest() {
        String coluuid = null;
        String content = null;
        String path = null;
        //api.collectionsFsAddPost(coluuid, content, path);
        
        // TODO: test validations
        
        
    }
    /**
     * List all collections
     *
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsGetTest() {
        Integer id = null;
        //List<MainCollection> response = api.collectionsGet(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Create a new collection
     *
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsPostTest() {
        MainCreateCollectionBody body = null;
        //MainCollection response = api.collectionsPost(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
