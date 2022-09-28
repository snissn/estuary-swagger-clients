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
 * The MainCreateCollectionBody model module.
 * @module model/MainCreateCollectionBody
 * @version 0.0.0
 */
export class MainCreateCollectionBody {
  /**
   * Constructs a new <code>MainCreateCollectionBody</code>.
   * @alias module:model/MainCreateCollectionBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>MainCreateCollectionBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MainCreateCollectionBody} obj Optional instance to populate.
   * @return {module:model/MainCreateCollectionBody} The populated <code>MainCreateCollectionBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MainCreateCollectionBody();
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} description
 */
MainCreateCollectionBody.prototype.description = undefined;

/**
 * @member {String} name
 */
MainCreateCollectionBody.prototype.name = undefined;
