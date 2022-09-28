/* tslint:disable */
/* eslint-disable */
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
import globalAxios, { AxiosResponse, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
/**
 * NetApi - axios parameter creator
 * @export
 */
export const NetApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * This endpoint is used to get net addrs
         * @summary Net Addrs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        netAddrsGet: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/net/addrs`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint returns all miners
         * @summary Get all miners
         * @param {string} miner Filter by miner
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        publicMinersFailuresMinerGet: async (miner: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'miner' is not null or undefined
            if (miner === null || miner === undefined) {
                throw new RequiredError('miner','Required parameter miner was null or undefined when calling publicMinersFailuresMinerGet.');
            }
            const localVarPath = `/public/miners/failures/{miner}`
                .replace(`{${"miner"}}`, encodeURIComponent(String(miner)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint returns all miners
         * @summary Get all miners
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        publicMinersGet: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/public/miners`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint is used to get net addrs
         * @summary Net Addrs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        publicNetAddrsGet: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/public/net/addrs`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint is used to get net peers
         * @summary Net Peers
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        publicNetPeersGet: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/public/net/peers`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * NetApi - functional programming interface
 * @export
 */
export const NetApiFp = function(configuration?: Configuration) {
    return {
        /**
         * This endpoint is used to get net addrs
         * @summary Net Addrs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async netAddrsGet(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<Array<string>>>> {
            const localVarAxiosArgs = await NetApiAxiosParamCreator(configuration).netAddrsGet(options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint returns all miners
         * @summary Get all miners
         * @param {string} miner Filter by miner
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersFailuresMinerGet(miner: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await NetApiAxiosParamCreator(configuration).publicMinersFailuresMinerGet(miner, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint returns all miners
         * @summary Get all miners
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersGet(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await NetApiAxiosParamCreator(configuration).publicMinersGet(options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint is used to get net addrs
         * @summary Net Addrs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicNetAddrsGet(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<Array<string>>>> {
            const localVarAxiosArgs = await NetApiAxiosParamCreator(configuration).publicNetAddrsGet(options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint is used to get net peers
         * @summary Net Peers
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicNetPeersGet(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<Array<string>>>> {
            const localVarAxiosArgs = await NetApiAxiosParamCreator(configuration).publicNetPeersGet(options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * NetApi - factory interface
 * @export
 */
export const NetApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * This endpoint is used to get net addrs
         * @summary Net Addrs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async netAddrsGet(options?: AxiosRequestConfig): Promise<AxiosResponse<Array<string>>> {
            return NetApiFp(configuration).netAddrsGet(options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint returns all miners
         * @summary Get all miners
         * @param {string} miner Filter by miner
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersFailuresMinerGet(miner: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return NetApiFp(configuration).publicMinersFailuresMinerGet(miner, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint returns all miners
         * @summary Get all miners
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersGet(options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return NetApiFp(configuration).publicMinersGet(options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint is used to get net addrs
         * @summary Net Addrs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicNetAddrsGet(options?: AxiosRequestConfig): Promise<AxiosResponse<Array<string>>> {
            return NetApiFp(configuration).publicNetAddrsGet(options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint is used to get net peers
         * @summary Net Peers
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicNetPeersGet(options?: AxiosRequestConfig): Promise<AxiosResponse<Array<string>>> {
            return NetApiFp(configuration).publicNetPeersGet(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * NetApi - object-oriented interface
 * @export
 * @class NetApi
 * @extends {BaseAPI}
 */
export class NetApi extends BaseAPI {
    /**
     * This endpoint is used to get net addrs
     * @summary Net Addrs
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof NetApi
     */
    public async netAddrsGet(options?: AxiosRequestConfig) : Promise<AxiosResponse<Array<string>>> {
        return NetApiFp(this.configuration).netAddrsGet(options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint returns all miners
     * @summary Get all miners
     * @param {string} miner Filter by miner
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof NetApi
     */
    public async publicMinersFailuresMinerGet(miner: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return NetApiFp(this.configuration).publicMinersFailuresMinerGet(miner, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint returns all miners
     * @summary Get all miners
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof NetApi
     */
    public async publicMinersGet(options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return NetApiFp(this.configuration).publicMinersGet(options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint is used to get net addrs
     * @summary Net Addrs
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof NetApi
     */
    public async publicNetAddrsGet(options?: AxiosRequestConfig) : Promise<AxiosResponse<Array<string>>> {
        return NetApiFp(this.configuration).publicNetAddrsGet(options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint is used to get net peers
     * @summary Net Peers
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof NetApi
     */
    public async publicNetPeersGet(options?: AxiosRequestConfig) : Promise<AxiosResponse<Array<string>>> {
        return NetApiFp(this.configuration).publicNetPeersGet(options).then((request) => request(this.axios, this.basePath));
    }
}
