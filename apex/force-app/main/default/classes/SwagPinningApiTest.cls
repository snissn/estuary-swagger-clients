@isTest
private class SwagPinningApiTest {
    /**
     * List all pin status objects
     *
     * This endpoint lists all pin status objects
     */
    @isTest
    private static void pinningPinsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagPinningApi api;

        client = new SwagClient();
        api = new SwagPinningApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.pinningPinsGet();
    }

    /**
     * Delete a pinned object
     *
     * This endpoint deletes a pinned object.
     */
    @isTest
    private static void pinningPinsPinidDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinid' => 'pinid_example'
        };

        SwagClient client;
        SwagPinningApi api;

        client = new SwagClient();
        api = new SwagPinningApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.pinningPinsPinidDelete(params);
    }

    /**
     * Get a pin status object
     *
     * This endpoint returns a pin status object.
     */
    @isTest
    private static void pinningPinsPinidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinid' => 'pinid_example'
        };

        SwagClient client;
        SwagPinningApi api;

        client = new SwagClient();
        api = new SwagPinningApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.pinningPinsPinidGet(params);
    }

    /**
     * Replace a pinned object
     *
     * This endpoint replaces a pinned object.
     */
    @isTest
    private static void pinningPinsPinidPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinid' => 'pinid_example'
        };

        SwagClient client;
        SwagPinningApi api;

        client = new SwagClient();
        api = new SwagPinningApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.pinningPinsPinidPost(params);
    }

    /**
     * Add and pin object
     *
     * This endpoint adds a pin to the IPFS daemon.
     */
    @isTest
    private static void pinningPinsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'cid' => 'cid_example',
            'name' => 'name_example'
        };

        SwagClient client;
        SwagPinningApi api;

        client = new SwagClient();
        api = new SwagPinningApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.pinningPinsPost(params);
    }
}