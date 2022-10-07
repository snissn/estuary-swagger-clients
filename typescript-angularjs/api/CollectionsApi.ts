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

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class CollectionsApi {
    protected basePath = 'https://api.estuary.tech';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     * @summary Produce a CID of the collection contents
     * @param coluuid coluuid
     */
    public collectionsColuuidCommitPost (coluuid: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<string> {
        const localVarPath = this.basePath + '/collections/{coluuid}/commit'
            .replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidCommitPost.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to delete an existing collection.
     * @summary Deletes a collection
     * @param coluuid Collection ID
     */
    public collectionsColuuidDelete (coluuid: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/collections/{coluuid}'
            .replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidDelete.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'DELETE',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     * @summary Get contents in a collection
     * @param coluuid Collection UUID
     * @param dir Directory
     */
    public collectionsColuuidGet (coluuid: string, dir?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<string> {
        const localVarPath = this.basePath + '/collections/{coluuid}';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidGet.');
        }

        if (coluuid !== undefined) {
            queryParameters['coluuid'] = coluuid;
        }

        if (dir !== undefined) {
            queryParameters['dir'] = dir;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     * @summary Add contents to a collection
     * @param body Content IDs to add to collection
     */
    public collectionsColuuidPost (body: Array<number>, extraHttpRequestParams?: any ) : ng.IHttpPromise<{ [key: string]: string; }> {
        const localVarPath = this.basePath + '/collections/{coluuid}';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling collectionsColuuidPost.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: body,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint adds a file to a collection
     * @summary Add a file to a collection
     * @param coluuid Collection ID
     * @param content Content
     * @param path Path to file
     */
    public collectionsFsAddPost (coluuid: string, content: string, path: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/collections/fs/add';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsFsAddPost.');
        }

        // verify required parameter 'content' is not null or undefined
        if (content === null || content === undefined) {
            throw new Error('Required parameter content was null or undefined when calling collectionsFsAddPost.');
        }

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new Error('Required parameter path was null or undefined when calling collectionsFsAddPost.');
        }

        if (coluuid !== undefined) {
            queryParameters['coluuid'] = coluuid;
        }

        if (content !== undefined) {
            queryParameters['content'] = content;
        }

        if (path !== undefined) {
            queryParameters['path'] = path;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     * @summary List all collections
     * @param id User ID
     */
    public collectionsGet (id: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<models.MainCollection>> {
        const localVarPath = this.basePath + '/collections/'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling collectionsGet.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     * @summary Create a new collection
     * @param body Collection name and description
     */
    public collectionsPost (body: models.MainCreateCollectionBody, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.MainCollection> {
        const localVarPath = this.basePath + '/collections/';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling collectionsPost.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: body,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}