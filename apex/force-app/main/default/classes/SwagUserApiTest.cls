@isTest
private class SwagUserApiTest {
    /**
     * Get API keys for a user
     *
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     */
    @isTest
    private static void userApiKeysGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagUserApi api;
        List<SwagMainGetApiKeysResp> response;
        List<SwagMainGetApiKeysResp> expectedResponse;

        client = new SwagClient();
        api = new SwagUserApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{}');
        expectedResponse = new List<SwagMainGetApiKeysResp>{SwagMainGetApiKeysResp.getExample()};
        response = (List<SwagMainGetApiKeysResp>) api.userApiKeysGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Revoke a User API Key.
     *
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
     */
    @isTest
    private static void userApiKeysKeyDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'key' => 'key_example'
        };

        SwagClient client;
        SwagUserApi api;

        client = new SwagClient();
        api = new SwagUserApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.userApiKeysKeyDelete(params);
    }

    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     */
    @isTest
    private static void userApiKeysPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagUserApi api;
        SwagMainGetApiKeysResp response;
        SwagMainGetApiKeysResp expectedResponse;

        client = new SwagClient();
        api = new SwagUserApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{"empty": false}');
        expectedResponse = SwagMainGetApiKeysResp.getExample();
        response = (SwagMainGetApiKeysResp) api.userApiKeysPost();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Export user data
     *
     * This endpoint is used to get API keys for a user.
     */
    @isTest
    private static void userExportGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagUserApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagUserApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.userExportGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user.
     */
    @isTest
    private static void userStatsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagUserApi api;
        SwagMainUserStatsResponse response;
        SwagMainUserStatsResponse expectedResponse;

        client = new SwagClient();
        api = new SwagUserApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{"empty": false}');
        expectedResponse = SwagMainUserStatsResponse.getExample();
        response = (SwagMainUserStatsResponse) api.userStatsGet();
        System.assertEquals(expectedResponse, response);
    }
}