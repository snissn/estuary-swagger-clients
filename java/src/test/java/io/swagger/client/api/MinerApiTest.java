/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MinerApi
 */
@Ignore
public class MinerApiTest {

    private final MinerApi api = new MinerApi();

    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void publicMinersDealsMinerGetTest() throws Exception {
        String miner = null;
        api.publicMinersDealsMinerGet(miner);

        // TODO: test validations
    }
    /**
     * Get miner stats
     *
     * This endpoint returns miner stats
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void publicMinersStatsMinerGetTest() throws Exception {
        String miner = null;
        api.publicMinersStatsMinerGet(miner);

        // TODO: test validations
    }
}
