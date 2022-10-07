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
    define(['ApiClient', 'model/MainEstimateDealBody'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/MainEstimateDealBody'));
  } else {
    // Browser globals (root is window)
    if (!root.EstuaryApi) {
      root.EstuaryApi = {};
    }
    root.EstuaryApi.DealsApi = factory(root.EstuaryApi.ApiClient, root.EstuaryApi.MainEstimateDealBody);
  }
}(this, function(ApiClient, MainEstimateDealBody) {
  'use strict';

  /**
   * Deals service.
   * @module api/DealsApi
   * @version 0.0.0
   */

  /**
   * Constructs a new DealsApi. 
   * @alias module:api/DealsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the dealEstimatePost operation.
     * @callback module:api/DealsApi~dealEstimatePostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Estimate the cost of a deal
     * This endpoint estimates the cost of a deal
     * @param {module:model/MainEstimateDealBody} body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
     * @param {module:api/DealsApi~dealEstimatePostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealEstimatePost = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dealEstimatePost");
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
        '/deal/estimate', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealInfoDealidGet operation.
     * @callback module:api/DealsApi~dealInfoDealidGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Deal Info
     * This endpoint returns the deal info for a deal
     * @param {Number} dealid Deal ID
     * @param {module:api/DealsApi~dealInfoDealidGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealInfoDealidGet = function(dealid, callback) {
      var postBody = null;

      // verify the required parameter 'dealid' is set
      if (dealid === undefined || dealid === null) {
        throw new Error("Missing the required parameter 'dealid' when calling dealInfoDealidGet");
      }


      var pathParams = {
        'dealid': dealid
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
        '/deal/info/{dealid}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealProposalPropcidGet operation.
     * @callback module:api/DealsApi~dealProposalPropcidGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Proposal
     * This endpoint returns the proposal for a deal
     * @param {String} propcid Proposal CID
     * @param {module:api/DealsApi~dealProposalPropcidGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealProposalPropcidGet = function(propcid, callback) {
      var postBody = null;

      // verify the required parameter 'propcid' is set
      if (propcid === undefined || propcid === null) {
        throw new Error("Missing the required parameter 'propcid' when calling dealProposalPropcidGet");
      }


      var pathParams = {
        'propcid': propcid
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
        '/deal/proposal/{propcid}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealQueryMinerGet operation.
     * @callback module:api/DealsApi~dealQueryMinerGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param {String} miner CID
     * @param {module:api/DealsApi~dealQueryMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealQueryMinerGet = function(miner, callback) {
      var postBody = null;

      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling dealQueryMinerGet");
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
        '/deal/query/{miner}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealStatusByProposalPropcidGet operation.
     * @callback module:api/DealsApi~dealStatusByProposalPropcidGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Deal Status by PropCid
     * Get Deal Status by PropCid
     * @param {String} propcid PropCid
     * @param {module:api/DealsApi~dealStatusByProposalPropcidGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealStatusByProposalPropcidGet = function(propcid, callback) {
      var postBody = null;

      // verify the required parameter 'propcid' is set
      if (propcid === undefined || propcid === null) {
        throw new Error("Missing the required parameter 'propcid' when calling dealStatusByProposalPropcidGet");
      }


      var pathParams = {
        'propcid': propcid
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
        '/deal/status-by-proposal/{propcid}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealStatusMinerPropcidGet operation.
     * @callback module:api/DealsApi~dealStatusMinerPropcidGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deal Status
     * This endpoint returns the status of a deal
     * @param {String} miner Miner
     * @param {String} propcid Proposal CID
     * @param {module:api/DealsApi~dealStatusMinerPropcidGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealStatusMinerPropcidGet = function(miner, propcid, callback) {
      var postBody = null;

      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling dealStatusMinerPropcidGet");
      }

      // verify the required parameter 'propcid' is set
      if (propcid === undefined || propcid === null) {
        throw new Error("Missing the required parameter 'propcid' when calling dealStatusMinerPropcidGet");
      }


      var pathParams = {
        'miner': miner,
        'propcid': propcid
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
        '/deal/status/{miner}/{propcid}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealTransferInProgressGet operation.
     * @callback module:api/DealsApi~dealTransferInProgressGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Transfer In Progress
     * This endpoint returns the in-progress transfers
     * @param {module:api/DealsApi~dealTransferInProgressGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealTransferInProgressGet = function(callback) {
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
        '/deal/transfer/in-progress', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealTransferStatusPost operation.
     * @callback module:api/DealsApi~dealTransferStatusPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Transfer Status
     * This endpoint returns the status of a transfer
     * @param {module:api/DealsApi~dealTransferStatusPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealTransferStatusPost = function(callback) {
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
        '/deal/transfer/status', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealsFailuresGet operation.
     * @callback module:api/DealsApi~dealsFailuresGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get storage failures for user
     * This endpoint returns a list of storage failures for user
     * @param {module:api/DealsApi~dealsFailuresGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealsFailuresGet = function(callback) {
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
        '/deals/failures', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealsMakeMinerPost operation.
     * @callback module:api/DealsApi~dealsMakeMinerPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Make Deal
     * This endpoint makes a deal for a given content and miner
     * @param {String} miner Miner
     * @param {String} dealRequest Deal Request
     * @param {module:api/DealsApi~dealsMakeMinerPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealsMakeMinerPost = function(miner, dealRequest, callback) {
      var postBody = dealRequest;

      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling dealsMakeMinerPost");
      }

      // verify the required parameter 'dealRequest' is set
      if (dealRequest === undefined || dealRequest === null) {
        throw new Error("Missing the required parameter 'dealRequest' when calling dealsMakeMinerPost");
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
        '/deals/make/{miner}', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the dealsStatusDealGet operation.
     * @callback module:api/DealsApi~dealsStatusDealGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Deal Status
     * This endpoint returns the status of a deal
     * @param {Number} deal Deal ID
     * @param {module:api/DealsApi~dealsStatusDealGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.dealsStatusDealGet = function(deal, callback) {
      var postBody = null;

      // verify the required parameter 'deal' is set
      if (deal === undefined || deal === null) {
        throw new Error("Missing the required parameter 'deal' when calling dealsStatusDealGet");
      }


      var pathParams = {
        'deal': deal
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
        '/deals/status/{deal}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicDealsFailuresGet operation.
     * @callback module:api/DealsApi~publicDealsFailuresGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get storage failures
     * This endpoint returns a list of storage failures
     * @param {module:api/DealsApi~publicDealsFailuresGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicDealsFailuresGet = function(callback) {
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
        '/public/deals/failures', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the publicMinersStorageQueryMinerGet operation.
     * @callback module:api/DealsApi~publicMinersStorageQueryMinerGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param {String} miner CID
     * @param {module:api/DealsApi~publicMinersStorageQueryMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.publicMinersStorageQueryMinerGet = function(miner, callback) {
      var postBody = null;

      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersStorageQueryMinerGet");
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
        '/public/miners/storage/query/{miner}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
