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


import * as $ from 'jquery';
import * as models from '../model/models';
import { COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


export class ContentApi {
    protected basePath = 'https://api.estuary.tech';
    public defaultHeaders: Array<string> = [];
    public defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings = null;
    public configuration: Configuration = new Configuration();

    constructor(basePath?: string, configuration?: Configuration, defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
        if (defaultExtraJQueryAjaxSettings) {
            this.defaultExtraJQueryAjaxSettings = defaultExtraJQueryAjaxSettings;
        }
    }

    private extendObj<T1, T2 extends T1>(objA: T2, objB: T2): T1|T2 {
        for (let key in objB) {
            if (objB.hasOwnProperty(key)) {
                objA[key] = objB[key];
            }
        }
        return objA;
    }

    /**
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     * @summary Add Car object
     * @param body Car
     * @param filename Filename
     * @param commp Commp
     * @param size Size
     */
    public contentAddCarPost(body: string, filename?: string, commp?: string, size?: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/add-car';

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling contentAddCarPost.');
        }

        if (filename !== null && filename !== undefined) {
            queryParameters['filename'] = <string><any>filename;
        }
        if (commp !== null && commp !== undefined) {
            queryParameters['commp'] = <string><any>commp;
        }
        if (size !== null && size !== undefined) {
            queryParameters['size'] = <string><any>size;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        headerParams['Content-Type'] = 'application/json';

        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        requestOptions.data = JSON.stringify(body);
        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     * @summary Add IPFS object
     * @param body IPFS Body
     */
    public contentAddIpfsPost(body: models.UtilContentAddIpfsBody, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/add-ipfs';

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling contentAddIpfsPost.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        headerParams['Content-Type'] = 'application/json';

        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        requestOptions.data = JSON.stringify(body);
        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint is used to upload new content.
     * @summary Add new content
     * @param data File to upload
     * @param coluuid Collection UUID
     * @param dir Directory
     */
    public contentAddPost(data: any, coluuid: string, dir: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body: models.UtilContentAddResponse;  }> {
        let localVarPath = this.basePath + '/content/add'.replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid))).replace('{' + 'dir' + '}', encodeURIComponent(String(dir)));

        let queryParameters: any = {};
        let headerParams: any = {};
        let formParams = new FormData();
        let reqHasFile = false;

        // verify required parameter 'data' is not null or undefined
        if (data === null || data === undefined) {
            throw new Error('Required parameter data was null or undefined when calling contentAddPost.');
        }

        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling contentAddPost.');
        }

        // verify required parameter 'dir' is not null or undefined
        if (dir === null || dir === undefined) {
            throw new Error('Required parameter dir was null or undefined when calling contentAddPost.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        reqHasFile = true;
        formParams.append("data", data);
        // to determine the Content-Type header
        let consumes: string[] = [
            'multipart/form-data'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }

        if (!reqHasFile) {
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }
        requestOptions.data = formParams;
        if (reqHasFile) {
            requestOptions.contentType = false;
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: models.UtilContentAddResponse, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint returns aggregated content stats
     * @summary Get aggregated content stats
     * @param content Content ID
     */
    public contentAggregatedContentGet(content: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body: string;  }> {
        let localVarPath = this.basePath + '/content/aggregated/{content}'.replace('{' + 'content' + '}', encodeURIComponent(String(content)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'content' is not null or undefined
        if (content === null || content === undefined) {
            throw new Error('Required parameter content was null or undefined when calling contentAggregatedContentGet.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: string, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint is used to get all deals for a user
     * @summary Get all deals for a user
     * @param begin Begin
     * @param duration Duration
     * @param all All
     */
    public contentAllDealsGet(begin: string, duration: string, all: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/all-deals';

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'begin' is not null or undefined
        if (begin === null || begin === undefined) {
            throw new Error('Required parameter begin was null or undefined when calling contentAllDealsGet.');
        }

        // verify required parameter 'duration' is not null or undefined
        if (duration === null || duration === undefined) {
            throw new Error('Required parameter duration was null or undefined when calling contentAllDealsGet.');
        }

        // verify required parameter 'all' is not null or undefined
        if (all === null || all === undefined) {
            throw new Error('Required parameter all was null or undefined when calling contentAllDealsGet.');
        }

        if (begin !== null && begin !== undefined) {
            queryParameters['begin'] = <string><any>begin;
        }
        if (duration !== null && duration !== undefined) {
            queryParameters['duration'] = <string><any>duration;
        }
        if (all !== null && all !== undefined) {
            queryParameters['all'] = <string><any>all;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint returns content bandwidth
     * @summary Get content bandwidth
     * @param content Content ID
     */
    public contentBwUsageContentGet(content: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/bw-usage/{content}'.replace('{' + 'content' + '}', encodeURIComponent(String(content)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'content' is not null or undefined
        if (content === null || content === undefined) {
            throw new Error('Required parameter content was null or undefined when calling contentBwUsageContentGet.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint adds a new content
     * @summary Add a new content
     * @param body Content
     */
    public contentCreatePost(body: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/create';

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling contentCreatePost.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        headerParams['Content-Type'] = 'application/json';

        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        requestOptions.data = JSON.stringify(body);
        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint lists all content with deals
     * @summary Content with deals
     * @param limit Limit
     * @param offset Offset
     */
    public contentDealsGet(limit?: number, offset?: number, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/deals';

        let queryParameters: any = {};
        let headerParams: any = {};
        if (limit !== null && limit !== undefined) {
            queryParameters['limit'] = <string><any>limit;
        }
        if (offset !== null && offset !== undefined) {
            queryParameters['offset'] = <string><any>offset;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint ensures that the content is replicated to the specified number of providers
     * @summary Ensure Replication
     * @param datacid Data CID
     */
    public contentEnsureReplicationDatacidGet(datacid: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/ensure-replication/{datacid}'.replace('{' + 'datacid' + '}', encodeURIComponent(String(datacid)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'datacid' is not null or undefined
        if (datacid === null || datacid === undefined) {
            throw new Error('Required parameter datacid was null or undefined when calling contentEnsureReplicationDatacidGet.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint returns all failures for a content
     * @summary List all failures for a content
     * @param content Content ID
     */
    public contentFailuresContentGet(content: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body: string;  }> {
        let localVarPath = this.basePath + '/content/failures/{content}'.replace('{' + 'content' + '}', encodeURIComponent(String(content)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'content' is not null or undefined
        if (content === null || content === undefined) {
            throw new Error('Required parameter content was null or undefined when calling contentFailuresContentGet.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: string, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint imports a deal into the shuttle.
     * @summary Import a deal
     * @param body Import a deal
     */
    public contentImportdealPost(body: models.MainImportDealBody, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/importdeal';

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling contentImportdealPost.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        headerParams['Content-Type'] = 'application/json';

        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        requestOptions.data = JSON.stringify(body);
        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint lists all content
     * @summary List all pinned content
     */
    public contentListGet(extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body: Array<string>;  }> {
        let localVarPath = this.basePath + '/content/list';

        let queryParameters: any = {};
        let headerParams: any = {};

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: Array<string>, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint reads content from the blockstore
     * @summary Read content
     * @param cont CID
     */
    public contentReadContGet(cont: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/read/{cont}'.replace('{' + 'cont' + '}', encodeURIComponent(String(cont)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'cont' is not null or undefined
        if (cont === null || cont === undefined) {
            throw new Error('Required parameter cont was null or undefined when calling contentReadContGet.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint is used to get staging zone for user.
     * @summary Get staging zone for user
     */
    public contentStagingZonesGet(extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/staging-zones';

        let queryParameters: any = {};
        let headerParams: any = {};

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
     * @summary Get content statistics
     * @param limit limit
     */
    public contentStatsGet(limit: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/stats'.replace('{' + 'limit' + '}', encodeURIComponent(String(limit)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'limit' is not null or undefined
        if (limit === null || limit === undefined) {
            throw new Error('Required parameter limit was null or undefined when calling contentStatsGet.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

    /**
     * This endpoint returns the status of a content
     * @summary Content Status
     * @param id Content ID
     */
    public contentStatusIdGet(id: number, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQueryPromise<{ response: JQueryXHR; body?: any;  }> {
        let localVarPath = this.basePath + '/content/status/{id}'.replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling contentStatusIdGet.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (bearerAuth) required
        if (this.configuration.apiKey) {
            headerParams['Authorization'] = this.configuration.apiKey;
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve(jqXHR, data),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject(xhr, errorThrown)
        );
        return dfd.promise();
    }

}
