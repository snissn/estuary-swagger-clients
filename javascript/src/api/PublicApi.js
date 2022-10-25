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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.EstuaryClient) {
      root.EstuaryClient = {};
    }
    root.EstuaryClient.PublicApi = factory(root.EstuaryClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * Public service.
   * @module api/PublicApi
   * @version 1.0.1
   */

  /**
   * Constructs a new PublicApi. 
   * @alias module:api/PublicApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the publicByCidCidGet operation.
     * @callback module:api/PublicApi~publicByCidCidGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Content by Cid
     * This endpoint returns the content associated with a CID
     * @param {String} cid Cid
     * @param {module:api/PublicApi~publicByCidCidGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicByCidCidGet = function(cid, callback) {
      var postBody = null;

      // verify the required parameter 'cid' is set
      if (cid === undefined || cid === null) {
        throw new Error("Missing the required parameter 'cid' when calling publicByCidCidGet");
      }


      var pathParams = {
        'cid': cid
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
        '/public/by-cid/{cid}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicInfoGet operation.
     * @callback module:api/PublicApi~publicInfoGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get public node info
     * This endpoint returns information about the node
     * @param {module:api/PublicApi~publicInfoGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicInfoGet = function(callback) {
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
        '/public/info', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicMetricsDealsOnChainGet operation.
     * @callback module:api/PublicApi~publicMetricsDealsOnChainGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get deal metrics
     * This endpoint is used to get deal metrics
     * @param {module:api/PublicApi~publicMetricsDealsOnChainGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicMetricsDealsOnChainGet = function(callback) {
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
        '/public/metrics/deals-on-chain', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicMinersDealsMinerGet operation.
     * @callback module:api/PublicApi~publicMinersDealsMinerGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all miners deals
     * This endpoint returns all miners deals
     * @param {String} miner Filter by miner
     * @param {Object} opts Optional parameters
     * @param {String} opts.ignoreFailed Ignore Failed
     * @param {module:api/PublicApi~publicMinersDealsMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicMinersDealsMinerGet = function(miner, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersDealsMinerGet");
      }


      var pathParams = {
        'miner': miner
      };
      var queryParams = {
        'ignore-failed': opts['ignoreFailed'],
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
        '/public/miners/deals/{miner}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicMinersFailuresMinerGet operation.
     * @callback module:api/PublicApi~publicMinersFailuresMinerGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all miners
     * This endpoint returns all miners
     * @param {String} miner Filter by miner
     * @param {module:api/PublicApi~publicMinersFailuresMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicMinersFailuresMinerGet = function(miner, callback) {
      var postBody = null;

      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersFailuresMinerGet");
      }


      var pathParams = {
        'miner': miner
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
        '/public/miners/failures/{miner}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicMinersGet operation.
     * @callback module:api/PublicApi~publicMinersGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all miners
     * This endpoint returns all miners
     * @param {module:api/PublicApi~publicMinersGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicMinersGet = function(callback) {
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
        '/public/miners', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicMinersStatsMinerGet operation.
     * @callback module:api/PublicApi~publicMinersStatsMinerGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get miner stats
     * This endpoint returns miner stats
     * @param {String} miner Filter by miner
     * @param {module:api/PublicApi~publicMinersStatsMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicMinersStatsMinerGet = function(miner, callback) {
      var postBody = null;

      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersStatsMinerGet");
      }


      var pathParams = {
        'miner': miner
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
        '/public/miners/stats/{miner}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicNetAddrsGet operation.
     * @callback module:api/PublicApi~publicNetAddrsGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Net Addrs
     * This endpoint is used to get net addrs
     * @param {module:api/PublicApi~publicNetAddrsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<'String'>}
     */
    this.publicNetAddrsGet = function(callback) {
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
        '/public/net/addrs', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicNetPeersGet operation.
     * @callback module:api/PublicApi~publicNetPeersGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Net Peers
     * This endpoint is used to get net peers
     * @param {module:api/PublicApi~publicNetPeersGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<'String'>}
     */
    this.publicNetPeersGet = function(callback) {
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
        '/public/net/peers', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicStatsGet operation.
     * @callback module:api/PublicApi~publicStatsGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Public stats
     * This endpoint is used to get public stats.
     * @param {module:api/PublicApi~publicStatsGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicStatsGet = function(callback) {
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
        '/public/stats', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
