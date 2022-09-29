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
 * publicMinersDealsMinerGet - parameters interface
 */
export interface IPublicMinersDealsMinerGetParams {
  miner: string;
}

/**
 * publicMinersStatsMinerGet - parameters interface
 */
export interface IPublicMinersStatsMinerGetParams {
  miner: string;
}

/**
 * MinerApi - API class
 */
@autoinject()
export class MinerApi extends Api {

  /**
   * Creates a new MinerApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Get all miners deals
   * This endpoint returns all miners deals
   * @param params.miner Filter by miner
   */
  async publicMinersDealsMinerGet(params: IPublicMinersDealsMinerGetParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('publicMinersDealsMinerGet', params, 'miner');

    // Create URL to call
    const url = `${this.basePath}/public/miners/deals/{miner}`
      .replace(`{${'miner'}}`, encodeURIComponent(`${params['miner']}`));

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

  /**
   * Get miner stats
   * This endpoint returns miner stats
   * @param params.miner Filter by miner
   */
  async publicMinersStatsMinerGet(params: IPublicMinersStatsMinerGetParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('publicMinersStatsMinerGet', params, 'miner');

    // Create URL to call
    const url = `${this.basePath}/public/miners/stats/{miner}`
      .replace(`{${'miner'}}`, encodeURIComponent(`${params['miner']}`));

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

