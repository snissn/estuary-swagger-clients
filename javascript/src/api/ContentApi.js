/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.28
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/MainImportDealBody', 'model/UtilContentAddIpfsBody', 'model/UtilContentAddResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/MainImportDealBody'), require('../model/UtilContentAddIpfsBody'), require('../model/UtilContentAddResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.EstuaryApi) {
      root.EstuaryApi = {};
    }
    root.EstuaryApi.ContentApi = factory(root.EstuaryApi.ApiClient, root.EstuaryApi.MainImportDealBody, root.EstuaryApi.UtilContentAddIpfsBody, root.EstuaryApi.UtilContentAddResponse);
  }
}(this, function(ApiClient, MainImportDealBody, UtilContentAddIpfsBody, UtilContentAddResponse) {
  'use strict';

  /**
   * Content service.
   * @module api/ContentApi
   * @version 0.0.0
   */

  /**
   * Constructs a new ContentApi. 
   * @alias module:api/ContentApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the contentAddCarPost operation.
     * @callback module:api/ContentApi~contentAddCarPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add Car object
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     * @param {String} body Car
     * @param {Object} opts Optional parameters
     * @param {String} opts.filename Filename
     * @param {String} opts.commp Commp
     * @param {String} opts.size Size
     * @param {module:api/ContentApi~contentAddCarPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentAddCarPost = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling contentAddCarPost");
      }


      var pathParams = {
      };
      var queryParams = {
        'filename': opts['filename'],
        'commp': opts['commp'],
        'size': opts['size'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/add-car', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentAddIpfsPost operation.
     * @callback module:api/ContentApi~contentAddIpfsPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add IPFS object
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     * @param {module:model/UtilContentAddIpfsBody} body IPFS Body
     * @param {module:api/ContentApi~contentAddIpfsPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentAddIpfsPost = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling contentAddIpfsPost");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/add-ipfs', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentAddPost operation.
     * @callback module:api/ContentApi~contentAddPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UtilContentAddResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add new content
     * This endpoint is used to upload new content.
     * @param {File} data File to upload
     * @param {Object} opts Optional parameters
     * @param {String} opts.coluuid Collection UUID
     * @param {String} opts.dir Directory
     * @param {module:api/ContentApi~contentAddPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UtilContentAddResponse}
     */
    this.contentAddPost = function(data, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'data' is set
      if (data === undefined || data === null) {
        throw new Error("Missing the required parameter 'data' when calling contentAddPost");
      }


      var pathParams = {
      };
      var queryParams = {
        'coluuid': opts['coluuid'],
        'dir': opts['dir'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'data': data
      };

      var authNames = ['bearerAuth'];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json'];
      var returnType = UtilContentAddResponse;

      return this.apiClient.callApi(
        '/content/add', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentAggregatedContentGet operation.
     * @callback module:api/ContentApi~contentAggregatedContentGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get aggregated content stats
     * This endpoint returns aggregated content stats
     * @param {String} content Content ID
     * @param {module:api/ContentApi~contentAggregatedContentGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.contentAggregatedContentGet = function(content, callback) {
      var postBody = null;

      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling contentAggregatedContentGet");
      }


      var pathParams = {
        'content': content
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/content/aggregated/{content}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentAllDealsGet operation.
     * @callback module:api/ContentApi~contentAllDealsGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all deals for a user
     * This endpoint is used to get all deals for a user
     * @param {String} begin Begin
     * @param {String} duration Duration
     * @param {String} all All
     * @param {module:api/ContentApi~contentAllDealsGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentAllDealsGet = function(begin, duration, all, callback) {
      var postBody = null;

      // verify the required parameter 'begin' is set
      if (begin === undefined || begin === null) {
        throw new Error("Missing the required parameter 'begin' when calling contentAllDealsGet");
      }

      // verify the required parameter 'duration' is set
      if (duration === undefined || duration === null) {
        throw new Error("Missing the required parameter 'duration' when calling contentAllDealsGet");
      }

      // verify the required parameter 'all' is set
      if (all === undefined || all === null) {
        throw new Error("Missing the required parameter 'all' when calling contentAllDealsGet");
      }


      var pathParams = {
      };
      var queryParams = {
        'begin': begin,
        'duration': duration,
        'all': all,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/all-deals', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentBwUsageContentGet operation.
     * @callback module:api/ContentApi~contentBwUsageContentGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get content bandwidth
     * This endpoint returns content bandwidth
     * @param {String} content Content ID
     * @param {module:api/ContentApi~contentBwUsageContentGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentBwUsageContentGet = function(content, callback) {
      var postBody = null;

      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling contentBwUsageContentGet");
      }


      var pathParams = {
        'content': content
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/bw-usage/{content}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentCreatePost operation.
     * @callback module:api/ContentApi~contentCreatePostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a new content
     * This endpoint adds a new content
     * @param {String} body Content
     * @param {module:api/ContentApi~contentCreatePostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentCreatePost = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling contentCreatePost");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/create', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentDealsGet operation.
     * @callback module:api/ContentApi~contentDealsGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Content with deals
     * This endpoint lists all content with deals
     * @param {Object} opts Optional parameters
     * @param {Number} opts.limit Limit
     * @param {Number} opts.offset Offset
     * @param {module:api/ContentApi~contentDealsGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentDealsGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'limit': opts['limit'],
        'offset': opts['offset'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/deals', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentEnsureReplicationDatacidGet operation.
     * @callback module:api/ContentApi~contentEnsureReplicationDatacidGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Ensure Replication
     * This endpoint ensures that the content is replicated to the specified number of providers
     * @param {String} datacid Data CID
     * @param {module:api/ContentApi~contentEnsureReplicationDatacidGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentEnsureReplicationDatacidGet = function(datacid, callback) {
      var postBody = null;

      // verify the required parameter 'datacid' is set
      if (datacid === undefined || datacid === null) {
        throw new Error("Missing the required parameter 'datacid' when calling contentEnsureReplicationDatacidGet");
      }


      var pathParams = {
        'datacid': datacid
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/ensure-replication/{datacid}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentFailuresContentGet operation.
     * @callback module:api/ContentApi~contentFailuresContentGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all failures for a content
     * This endpoint returns all failures for a content
     * @param {String} content Content ID
     * @param {module:api/ContentApi~contentFailuresContentGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.contentFailuresContentGet = function(content, callback) {
      var postBody = null;

      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling contentFailuresContentGet");
      }


      var pathParams = {
        'content': content
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/content/failures/{content}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentImportdealPost operation.
     * @callback module:api/ContentApi~contentImportdealPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Import a deal
     * This endpoint imports a deal into the shuttle.
     * @param {module:model/MainImportDealBody} body Import a deal
     * @param {module:api/ContentApi~contentImportdealPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentImportdealPost = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling contentImportdealPost");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/importdeal', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentListGet operation.
     * @callback module:api/ContentApi~contentListGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all pinned content
     * This endpoint lists all content
     * @param {module:api/ContentApi~contentListGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<'String'>}
     */
    this.contentListGet = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = ['String'];

      return this.apiClient.callApi(
        '/content/list', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentReadContGet operation.
     * @callback module:api/ContentApi~contentReadContGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Read content
     * This endpoint reads content from the blockstore
     * @param {String} cont CID
     * @param {module:api/ContentApi~contentReadContGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentReadContGet = function(cont, callback) {
      var postBody = null;

      // verify the required parameter 'cont' is set
      if (cont === undefined || cont === null) {
        throw new Error("Missing the required parameter 'cont' when calling contentReadContGet");
      }


      var pathParams = {
        'cont': cont
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/read/{cont}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentStagingZonesGet operation.
     * @callback module:api/ContentApi~contentStagingZonesGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get staging zone for user
     * This endpoint is used to get staging zone for user.
     * @param {module:api/ContentApi~contentStagingZonesGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentStagingZonesGet = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/staging-zones', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentStatsGet operation.
     * @callback module:api/ContentApi~contentStatsGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get content statistics
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
     * @param {String} limit limit
     * @param {module:api/ContentApi~contentStatsGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentStatsGet = function(limit, callback) {
      var postBody = null;

      // verify the required parameter 'limit' is set
      if (limit === undefined || limit === null) {
        throw new Error("Missing the required parameter 'limit' when calling contentStatsGet");
      }


      var pathParams = {
        'limit': limit
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/stats', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the contentStatusIdGet operation.
     * @callback module:api/ContentApi~contentStatusIdGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Content Status
     * This endpoint returns the status of a content
     * @param {Number} id Content ID
     * @param {module:api/ContentApi~contentStatusIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.contentStatusIdGet = function(id, callback) {
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling contentStatusIdGet");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/content/status/{id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));