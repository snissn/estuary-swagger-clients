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
  MainUserStatsResponse,
  MainGetApiKeysResp,
} from './models';

/**
 * userApiKeysGet - parameters interface
 */
export interface IUserApiKeysGetParams {
}

/**
 * userApiKeysKeyDelete - parameters interface
 */
export interface IUserApiKeysKeyDeleteParams {
  key: string;
}

/**
 * userApiKeysPost - parameters interface
 */
export interface IUserApiKeysPostParams {
}

/**
 * userExportGet - parameters interface
 */
export interface IUserExportGetParams {
}

/**
 * userStatsGet - parameters interface
 */
export interface IUserStatsGetParams {
}

/**
 * UserApi - API class
 */
@autoinject()
export class UserApi extends Api {

  /**
   * Creates a new UserApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Get API keys for a user
   * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
   */
  async userApiKeysGet(): Promise<Array<MainGetApiKeysResp>> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/user/api-keys`;

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
   * Revoke a User API Key.
   * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
   * @param params.key Key
   */
  async userApiKeysKeyDelete(params: IUserApiKeysKeyDeleteParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('userApiKeysKeyDelete', params, 'key');

    // Create URL to call
    const url = `${this.basePath}/user/api-keys/{key}`
      .replace(`{${'key'}}`, encodeURIComponent(`${params['key']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()

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
   * Create API keys for a user
   * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
   */
  async userApiKeysPost(): Promise<MainGetApiKeysResp> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/user/api-keys`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()

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
   * Export user data
   * This endpoint is used to get API keys for a user.
   */
  async userExportGet(): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/user/export`;

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
   * Create API keys for a user
   * This endpoint is used to create API keys for a user.
   */
  async userStatsGet(): Promise<MainUserStatsResponse> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/user/stats`;

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

