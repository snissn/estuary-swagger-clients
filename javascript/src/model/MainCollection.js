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
 * The MainCollection model module.
 * @module model/MainCollection
 * @version 0.0.0
 */
export class MainCollection {
  /**
   * Constructs a new <code>MainCollection</code>.
   * @alias module:model/MainCollection
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>MainCollection</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MainCollection} obj Optional instance to populate.
   * @return {module:model/MainCollection} The populated <code>MainCollection</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MainCollection();
      if (data.hasOwnProperty('cid'))
        obj.cid = ApiClient.convertToType(data['cid'], 'String');
      if (data.hasOwnProperty('createdAt'))
        obj.createdAt = ApiClient.convertToType(data['createdAt'], 'String');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('userId'))
        obj.userId = ApiClient.convertToType(data['userId'], 'Number');
      if (data.hasOwnProperty('uuid'))
        obj.uuid = ApiClient.convertToType(data['uuid'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} cid
 */
MainCollection.prototype.cid = undefined;

/**
 * @member {String} createdAt
 */
MainCollection.prototype.createdAt = undefined;

/**
 * @member {String} description
 */
MainCollection.prototype.description = undefined;

/**
 * @member {String} name
 */
MainCollection.prototype.name = undefined;

/**
 * @member {Number} userId
 */
MainCollection.prototype.userId = undefined;

/**
 * @member {String} uuid
 */
MainCollection.prototype.uuid = undefined;

