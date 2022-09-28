/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.35
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The MainEstimateDealBody model module.
 * @module model/MainEstimateDealBody
 * @version 0.0.0
 */
export class MainEstimateDealBody {
  /**
   * Constructs a new <code>MainEstimateDealBody</code>.
   * @alias module:model/MainEstimateDealBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>MainEstimateDealBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MainEstimateDealBody} obj Optional instance to populate.
   * @return {module:model/MainEstimateDealBody} The populated <code>MainEstimateDealBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MainEstimateDealBody();
      if (data.hasOwnProperty('durationBlks'))
        obj.durationBlks = ApiClient.convertToType(data['durationBlks'], 'Number');
      if (data.hasOwnProperty('replication'))
        obj.replication = ApiClient.convertToType(data['replication'], 'Number');
      if (data.hasOwnProperty('size'))
        obj.size = ApiClient.convertToType(data['size'], 'Number');
      if (data.hasOwnProperty('verified'))
        obj.verified = ApiClient.convertToType(data['verified'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Number} durationBlks
 */
MainEstimateDealBody.prototype.durationBlks = undefined;

/**
 * @member {Number} replication
 */
MainEstimateDealBody.prototype.replication = undefined;

/**
 * @member {Number} size
 */
MainEstimateDealBody.prototype.size = undefined;

/**
 * @member {Boolean} verified
 */
MainEstimateDealBody.prototype.verified = undefined;

