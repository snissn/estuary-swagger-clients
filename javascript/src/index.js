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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/CollectionsCollection', 'model/MainCreateCollectionBody', 'model/MainDeleteContentFromCollectionBody', 'model/MainEstimateDealBody', 'model/MainGetApiKeysResp', 'model/MainImportDealBody', 'model/MainUserStatsResponse', 'model/UtilContentAddIpfsBody', 'model/UtilContentAddResponse', 'model/UtilHttpError', 'api/AdminApi', 'api/AutoretrieveApi', 'api/CollectionsApi', 'api/ContentApi', 'api/DealsApi', 'api/MetricsApi', 'api/MinerApi', 'api/NetApi', 'api/PeeringApi', 'api/PeersApi', 'api/PinningApi', 'api/PublicApi', 'api/UserApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/CollectionsCollection'), require('./model/MainCreateCollectionBody'), require('./model/MainDeleteContentFromCollectionBody'), require('./model/MainEstimateDealBody'), require('./model/MainGetApiKeysResp'), require('./model/MainImportDealBody'), require('./model/MainUserStatsResponse'), require('./model/UtilContentAddIpfsBody'), require('./model/UtilContentAddResponse'), require('./model/UtilHttpError'), require('./api/AdminApi'), require('./api/AutoretrieveApi'), require('./api/CollectionsApi'), require('./api/ContentApi'), require('./api/DealsApi'), require('./api/MetricsApi'), require('./api/MinerApi'), require('./api/NetApi'), require('./api/PeeringApi'), require('./api/PeersApi'), require('./api/PinningApi'), require('./api/PublicApi'), require('./api/UserApi'));
  }
}(function(ApiClient, CollectionsCollection, MainCreateCollectionBody, MainDeleteContentFromCollectionBody, MainEstimateDealBody, MainGetApiKeysResp, MainImportDealBody, MainUserStatsResponse, UtilContentAddIpfsBody, UtilContentAddResponse, UtilHttpError, AdminApi, AutoretrieveApi, CollectionsApi, ContentApi, DealsApi, MetricsApi, MinerApi, NetApi, PeeringApi, PeersApi, PinningApi, PublicApi, UserApi) {
  'use strict';

  /**
   * This_is_the_API_for_the_Estuary_application_.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var EstuaryApi = require('index'); // See note below*.
   * var xxxSvc = new EstuaryApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new EstuaryApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new EstuaryApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new EstuaryApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 0.0.0
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The CollectionsCollection model constructor.
     * @property {module:model/CollectionsCollection}
     */
    CollectionsCollection: CollectionsCollection,
    /**
     * The MainCreateCollectionBody model constructor.
     * @property {module:model/MainCreateCollectionBody}
     */
    MainCreateCollectionBody: MainCreateCollectionBody,
    /**
     * The MainDeleteContentFromCollectionBody model constructor.
     * @property {module:model/MainDeleteContentFromCollectionBody}
     */
    MainDeleteContentFromCollectionBody: MainDeleteContentFromCollectionBody,
    /**
     * The MainEstimateDealBody model constructor.
     * @property {module:model/MainEstimateDealBody}
     */
    MainEstimateDealBody: MainEstimateDealBody,
    /**
     * The MainGetApiKeysResp model constructor.
     * @property {module:model/MainGetApiKeysResp}
     */
    MainGetApiKeysResp: MainGetApiKeysResp,
    /**
     * The MainImportDealBody model constructor.
     * @property {module:model/MainImportDealBody}
     */
    MainImportDealBody: MainImportDealBody,
    /**
     * The MainUserStatsResponse model constructor.
     * @property {module:model/MainUserStatsResponse}
     */
    MainUserStatsResponse: MainUserStatsResponse,
    /**
     * The UtilContentAddIpfsBody model constructor.
     * @property {module:model/UtilContentAddIpfsBody}
     */
    UtilContentAddIpfsBody: UtilContentAddIpfsBody,
    /**
     * The UtilContentAddResponse model constructor.
     * @property {module:model/UtilContentAddResponse}
     */
    UtilContentAddResponse: UtilContentAddResponse,
    /**
     * The UtilHttpError model constructor.
     * @property {module:model/UtilHttpError}
     */
    UtilHttpError: UtilHttpError,
    /**
     * The AdminApi service constructor.
     * @property {module:api/AdminApi}
     */
    AdminApi: AdminApi,
    /**
     * The AutoretrieveApi service constructor.
     * @property {module:api/AutoretrieveApi}
     */
    AutoretrieveApi: AutoretrieveApi,
    /**
     * The CollectionsApi service constructor.
     * @property {module:api/CollectionsApi}
     */
    CollectionsApi: CollectionsApi,
    /**
     * The ContentApi service constructor.
     * @property {module:api/ContentApi}
     */
    ContentApi: ContentApi,
    /**
     * The DealsApi service constructor.
     * @property {module:api/DealsApi}
     */
    DealsApi: DealsApi,
    /**
     * The MetricsApi service constructor.
     * @property {module:api/MetricsApi}
     */
    MetricsApi: MetricsApi,
    /**
     * The MinerApi service constructor.
     * @property {module:api/MinerApi}
     */
    MinerApi: MinerApi,
    /**
     * The NetApi service constructor.
     * @property {module:api/NetApi}
     */
    NetApi: NetApi,
    /**
     * The PeeringApi service constructor.
     * @property {module:api/PeeringApi}
     */
    PeeringApi: PeeringApi,
    /**
     * The PeersApi service constructor.
     * @property {module:api/PeersApi}
     */
    PeersApi: PeersApi,
    /**
     * The PinningApi service constructor.
     * @property {module:api/PinningApi}
     */
    PinningApi: PinningApi,
    /**
     * The PublicApi service constructor.
     * @property {module:api/PublicApi}
     */
    PublicApi: PublicApi,
    /**
     * The UserApi service constructor.
     * @property {module:api/UserApi}
     */
    UserApi: UserApi
  };

  return exports;
}));
