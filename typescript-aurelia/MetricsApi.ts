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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
} from './models';

/**
 * publicMetricsDealsOnChainGet - parameters interface
 */
export interface IPublicMetricsDealsOnChainGetParams {
}

/**
 * MetricsApi - API class
 */
@autoinject()
export class MetricsApi extends Api {

  /**
   * Creates a new MetricsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Get deal metrics
   * This endpoint is used to get deal metrics
   */
  async publicMetricsDealsOnChainGet(): Promise<any> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/public/metrics/deals-on-chain`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}
