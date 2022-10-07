/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import { HttpClient } from 'aurelia-http-client';
import { AuthStorage } from './AuthStorage';

const BASE_PATH = 'https://api.estuary.tech'.replace(/\/+$/, '');

export class Api {
  basePath: string;
  httpClient: HttpClient;
  authStorage: AuthStorage;

  constructor(httpClient: HttpClient, authStorage: AuthStorage, basePath: string = BASE_PATH) {
    this.basePath = basePath;
    this.httpClient = httpClient;
    this.authStorage = authStorage;
  }

  /**
   * Encodes a query string.
   *
   * @param params The params to encode.
   * @return An encoded query string.
   */
  protected queryString(params: { [key: string]: any }): string {
    const queries = [];
    for (let key in params) {
      const value = this.toString(params[key]);
      if (value != null) {
        queries.push(`${key}=${encodeURIComponent(value)}`);
      }
    }

    return queries.join('&');
  }

  /**
   * Converts a value to string.
   *
   * @param value The value to convert.
   */
  protected toString(value: any): string | null {
    if (value === null) {
      return null;
    }
    switch (typeof value) {
      case 'undefined': return null;
      case 'boolean': return value ? 'true' : 'false';
      case 'string': return value;
      default: return '' + value;
    }
  }

  /**
   * Ensures that a given parameter is set.
   *
   * @param context A name for the callee's context.
   * @param params The parameters being set.
   * @param paramName The required parameter to check.
   */
  protected ensureParamIsSet<T>(context: string, params: T, paramName: keyof T): void {
    if (null === params[paramName]) {
      throw new Error(`Missing required parameter ${paramName} when calling ${context}`);
    }
  }
}
