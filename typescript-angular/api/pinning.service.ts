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
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { UtilHttpError } from '../model/utilHttpError';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class PinningService {

    protected basePath = '//api.estuary.tech/';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * List all pin status objects
     * This endpoint lists all pin status objects
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public pinningPinsGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public pinningPinsGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public pinningPinsGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public pinningPinsGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('get',`${this.basePath}/pinning/pins`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Delete a pinned object
     * This endpoint deletes a pinned object.
     * @param pinid Pin ID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public pinningPinsPinidDelete(pinid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public pinningPinsPinidDelete(pinid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public pinningPinsPinidDelete(pinid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public pinningPinsPinidDelete(pinid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (pinid === null || pinid === undefined) {
            throw new Error('Required parameter pinid was null or undefined when calling pinningPinsPinidDelete.');
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('delete',`${this.basePath}/pinning/pins/${encodeURIComponent(String(pinid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get a pin status object
     * This endpoint returns a pin status object.
     * @param pinid cid
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public pinningPinsPinidGet(pinid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public pinningPinsPinidGet(pinid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public pinningPinsPinidGet(pinid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public pinningPinsPinidGet(pinid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (pinid === null || pinid === undefined) {
            throw new Error('Required parameter pinid was null or undefined when calling pinningPinsPinidGet.');
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('get',`${this.basePath}/pinning/pins/${encodeURIComponent(String(pinid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Replace a pinned object
     * This endpoint replaces a pinned object.
     * @param pinid Pin ID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public pinningPinsPinidPost(pinid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public pinningPinsPinidPost(pinid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public pinningPinsPinidPost(pinid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public pinningPinsPinidPost(pinid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (pinid === null || pinid === undefined) {
            throw new Error('Required parameter pinid was null or undefined when calling pinningPinsPinidPost.');
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('post',`${this.basePath}/pinning/pins/${encodeURIComponent(String(pinid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Add and pin object
     * This endpoint adds a pin to the IPFS daemon.
     * @param cid cid
     * @param name name
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public pinningPinsPost(cid: string, name: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public pinningPinsPost(cid: string, name: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public pinningPinsPost(cid: string, name: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public pinningPinsPost(cid: string, name: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (cid === null || cid === undefined) {
            throw new Error('Required parameter cid was null or undefined when calling pinningPinsPost.');
        }

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling pinningPinsPost.');
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('post',`${this.basePath}/pinning/pins`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
