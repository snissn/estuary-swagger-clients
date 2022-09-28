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

import { MainEstimateDealBody } from '../model/mainEstimateDealBody';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class DealsService {

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
     * Estimate the cost of a deal
     * This endpoint estimates the cost of a deal
     * @param body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealEstimatePost(body: MainEstimateDealBody, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealEstimatePost(body: MainEstimateDealBody, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealEstimatePost(body: MainEstimateDealBody, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealEstimatePost(body: MainEstimateDealBody, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling dealEstimatePost.');
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
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('post',`${this.basePath}/deal/estimate`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get Deal Info
     * This endpoint returns the deal info for a deal
     * @param dealid Deal ID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealInfoDealidGet(dealid: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealInfoDealidGet(dealid: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealInfoDealidGet(dealid: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealInfoDealidGet(dealid: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (dealid === null || dealid === undefined) {
            throw new Error('Required parameter dealid was null or undefined when calling dealInfoDealidGet.');
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

        return this.httpClient.request<any>('get',`${this.basePath}/deal/info/${encodeURIComponent(String(dealid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get Proposal
     * This endpoint returns the proposal for a deal
     * @param propcid Proposal CID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealProposalPropcidGet(propcid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealProposalPropcidGet(propcid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealProposalPropcidGet(propcid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealProposalPropcidGet(propcid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (propcid === null || propcid === undefined) {
            throw new Error('Required parameter propcid was null or undefined when calling dealProposalPropcidGet.');
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

        return this.httpClient.request<any>('get',`${this.basePath}/deal/proposal/${encodeURIComponent(String(propcid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param miner CID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealQueryMinerGet(miner: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealQueryMinerGet(miner: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealQueryMinerGet(miner: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealQueryMinerGet(miner: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (miner === null || miner === undefined) {
            throw new Error('Required parameter miner was null or undefined when calling dealQueryMinerGet.');
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

        return this.httpClient.request<any>('get',`${this.basePath}/deal/query/${encodeURIComponent(String(miner))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get Deal Status by PropCid
     * Get Deal Status by PropCid
     * @param propcid PropCid
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealStatusByProposalPropcidGet(propcid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealStatusByProposalPropcidGet(propcid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealStatusByProposalPropcidGet(propcid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealStatusByProposalPropcidGet(propcid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (propcid === null || propcid === undefined) {
            throw new Error('Required parameter propcid was null or undefined when calling dealStatusByProposalPropcidGet.');
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

        return this.httpClient.request<any>('get',`${this.basePath}/deal/status-by-proposal/${encodeURIComponent(String(propcid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Deal Status
     * This endpoint returns the status of a deal
     * @param miner Miner
     * @param propcid Proposal CID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealStatusMinerPropcidGet(miner: string, propcid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealStatusMinerPropcidGet(miner: string, propcid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealStatusMinerPropcidGet(miner: string, propcid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealStatusMinerPropcidGet(miner: string, propcid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (miner === null || miner === undefined) {
            throw new Error('Required parameter miner was null or undefined when calling dealStatusMinerPropcidGet.');
        }

        if (propcid === null || propcid === undefined) {
            throw new Error('Required parameter propcid was null or undefined when calling dealStatusMinerPropcidGet.');
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

        return this.httpClient.request<any>('get',`${this.basePath}/deal/status/${encodeURIComponent(String(miner))}/${encodeURIComponent(String(propcid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Transfer In Progress
     * This endpoint returns the in-progress transfers
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealTransferInProgressGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealTransferInProgressGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealTransferInProgressGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealTransferInProgressGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.request<any>('get',`${this.basePath}/deal/transfer/in-progress`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Transfer Status
     * This endpoint returns the status of a transfer
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealTransferStatusPost(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealTransferStatusPost(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealTransferStatusPost(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealTransferStatusPost(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.request<any>('post',`${this.basePath}/deal/transfer/status`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get storage failures for user
     * This endpoint returns a list of storage failures for user
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealsFailuresGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealsFailuresGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealsFailuresGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealsFailuresGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.request<any>('get',`${this.basePath}/deals/failures`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Make Deal
     * This endpoint makes a deal for a given content and miner
     * @param body Deal Request
     * @param miner Miner
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealsMakeMinerPost(body: string, miner: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealsMakeMinerPost(body: string, miner: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealsMakeMinerPost(body: string, miner: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealsMakeMinerPost(body: string, miner: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling dealsMakeMinerPost.');
        }

        if (miner === null || miner === undefined) {
            throw new Error('Required parameter miner was null or undefined when calling dealsMakeMinerPost.');
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
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('post',`${this.basePath}/deals/make/${encodeURIComponent(String(miner))}`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get Deal Status
     * This endpoint returns the status of a deal
     * @param deal Deal ID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public dealsStatusDealGet(deal: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public dealsStatusDealGet(deal: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public dealsStatusDealGet(deal: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public dealsStatusDealGet(deal: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (deal === null || deal === undefined) {
            throw new Error('Required parameter deal was null or undefined when calling dealsStatusDealGet.');
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

        return this.httpClient.request<any>('get',`${this.basePath}/deals/status/${encodeURIComponent(String(deal))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get storage failures
     * This endpoint returns a list of storage failures
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicDealsFailuresGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicDealsFailuresGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicDealsFailuresGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicDealsFailuresGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.request<any>('get',`${this.basePath}/public/deals/failures`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param miner CID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicMinersStorageQueryMinerGet(miner: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicMinersStorageQueryMinerGet(miner: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicMinersStorageQueryMinerGet(miner: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicMinersStorageQueryMinerGet(miner: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (miner === null || miner === undefined) {
            throw new Error('Required parameter miner was null or undefined when calling publicMinersStorageQueryMinerGet.');
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

        return this.httpClient.request<any>('get',`${this.basePath}/public/miners/storage/query/${encodeURIComponent(String(miner))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
