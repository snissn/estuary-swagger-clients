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

import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.MainUserStatsResponse;
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
 * API tests for UserApi 
 */
public class UserApiTest {


    private UserApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://api.estuary.tech", UserApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Get API keys for a user
     *
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userApiKeysGetTest() {
        //List<MainGetApiKeysResp> response = api.userApiKeysGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Revoke a User API Key.
     *
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userApiKeysKeyDeleteTest() {
        String key = null;
        //api.userApiKeysKeyDelete(key);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userApiKeysPostTest() {
        //MainGetApiKeysResp response = api.userApiKeysPost();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Export user data
     *
     * This endpoint is used to get API keys for a user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userExportGetTest() {
        //String response = api.userExportGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userStatsGetTest() {
        //MainUserStatsResponse response = api.userStatsGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
