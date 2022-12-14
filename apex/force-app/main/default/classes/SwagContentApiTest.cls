@isTest
private class SwagContentApiTest {
    /**
     * Add Car object
     *
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     */
    @isTest
    private static void contentAddCarPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => 'body_example',
            'filename' => 'filename_example',
            'commp' => 'commp_example',
            'size' => 'size_example'
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentAddCarPost(params);
    }

    /**
     * Add IPFS object
     *
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     */
    @isTest
    private static void contentAddIpfsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagUtilContentAddIpfsBody.getExample()
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentAddIpfsPost(params);
    }

    /**
     * Add new content
     *
     * This endpoint is used to upload new content.
     */
    @isTest
    private static void contentAddPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'data' => Blob.valueOf('Sample text file\nContents'),
            'coluuid' => 'coluuid_example',
            'dir' => 'dir_example'
        };

        SwagClient client;
        SwagContentApi api;
        SwagUtilContentAddResponse response;
        SwagUtilContentAddResponse expectedResponse;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{"empty": false}');
        expectedResponse = SwagUtilContentAddResponse.getExample();
        response = (SwagUtilContentAddResponse) api.contentAddPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get aggregated content stats
     *
     * This endpoint returns aggregated content stats
     */
    @isTest
    private static void contentAggregatedContentGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'content' => 'content_example'
        };

        SwagClient client;
        SwagContentApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.contentAggregatedContentGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get all deals for a user
     *
     * This endpoint is used to get all deals for a user
     */
    @isTest
    private static void contentAllDealsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_begin' => 'r_begin_example',
            'duration' => 'duration_example',
            'all' => 'all_example'
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentAllDealsGet(params);
    }

    /**
     * Get content bandwidth
     *
     * This endpoint returns content bandwidth
     */
    @isTest
    private static void contentBwUsageContentGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'content' => 'content_example'
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentBwUsageContentGet(params);
    }

    /**
     * Add a new content
     *
     * This endpoint adds a new content
     */
    @isTest
    private static void contentCreatePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => 'body_example'
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentCreatePost(params);
    }

    /**
     * Content with deals
     *
     * This endpoint lists all content with deals
     */
    @isTest
    private static void contentDealsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => 56,
            'offset' => 56
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentDealsGet(params);
    }

    /**
     * Ensure Replication
     *
     * This endpoint ensures that the content is replicated to the specified number of providers
     */
    @isTest
    private static void contentEnsureReplicationDatacidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'datacid' => 'datacid_example'
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentEnsureReplicationDatacidGet(params);
    }

    /**
     * List all failures for a content
     *
     * This endpoint returns all failures for a content
     */
    @isTest
    private static void contentFailuresContentGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'content' => 'content_example'
        };

        SwagClient client;
        SwagContentApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.contentFailuresContentGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Import a deal
     *
     * This endpoint imports a deal into the shuttle.
     */
    @isTest
    private static void contentImportdealPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagMainImportDealBody.getExample()
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentImportdealPost(params);
    }

    /**
     * List all pinned content
     *
     * This endpoint lists all content
     */
    @isTest
    private static void contentListGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagContentApi api;
        List<String> response;
        List<String> expectedResponse;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{}');
        expectedResponse = new List<String>{'aeiou'};
        response = (List<String>) api.contentListGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Read content
     *
     * This endpoint reads content from the blockstore
     */
    @isTest
    private static void contentReadContGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'cont' => 'cont_example'
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentReadContGet(params);
    }

    /**
     * Get staging zone for user
     *
     * This endpoint is used to get staging zone for user.
     */
    @isTest
    private static void contentStagingZonesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentStagingZonesGet();
    }

    /**
     * Get content statistics
     *
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
     */
    @isTest
    private static void contentStatsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => 'r_limit_example'
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentStatsGet(params);
    }

    /**
     * Content Status
     *
     * This endpoint returns the status of a content
     */
    @isTest
    private static void contentStatusIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 56
        };

        SwagClient client;
        SwagContentApi api;

        client = new SwagClient();
        api = new SwagContentApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.contentStatusIdGet(params);
    }
}