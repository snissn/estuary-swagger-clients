//
// ContentAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class ContentAPI: APIBase {
    /**
     Add Car object
     - parameter body: (body) Car 
     - parameter filename: (query) Filename (optional)
     - parameter commp: (query) Commp (optional)
     - parameter size: (query) Size (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAddCarPost(body: String, filename: String? = nil, commp: String? = nil, size: String? = nil, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentAddCarPostWithRequestBuilder(body: body, filename: filename, commp: commp, size: size).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Add Car object
     - POST /content/add-car
     - This endpoint is used to add a car object to the network. The object can be a file or a directory.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter body: (body) Car 
     - parameter filename: (query) Filename (optional)
     - parameter commp: (query) Commp (optional)
     - parameter size: (query) Size (optional)
     - returns: RequestBuilder<Void> 
     */
    open class func contentAddCarPostWithRequestBuilder(body: String, filename: String? = nil, commp: String? = nil, size: String? = nil) -> RequestBuilder<Void> {
        let path = "/content/add-car"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON()
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "filename": filename,
                        "commp": commp,
                        "size": size
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Add IPFS object
     - parameter body: (body) IPFS Body 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAddIpfsPost(body: UtilContentAddIpfsBody, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentAddIpfsPostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Add IPFS object
     - POST /content/add-ipfs
     - This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter body: (body) IPFS Body 
     - returns: RequestBuilder<Void> 
     */
    open class func contentAddIpfsPostWithRequestBuilder(body: UtilContentAddIpfsBody) -> RequestBuilder<Void> {
        let path = "/content/add-ipfs"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Add new content
     - parameter file: (form)  
     - parameter coluuid: (path) Collection UUID 
     - parameter dir: (path) Directory 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAddPost(file: Data, coluuid: String, dir: String, completion: @escaping ((_ data: UtilContentAddResponse?, _ error: ErrorResponse?) -> Void)) {
        contentAddPostWithRequestBuilder(file: file, coluuid: coluuid, dir: dir).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Add new content
     - POST /content/add
     - This endpoint is used to upload new content.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "retrieval_url" : "retrieval_url",
  "estuaryId" : 0,
  "providers" : [ "providers", "providers" ],
  "cid" : "cid"
}}]
     - parameter file: (form)  
     - parameter coluuid: (path) Collection UUID 
     - parameter dir: (path) Directory 
     - returns: RequestBuilder<UtilContentAddResponse> 
     */
    open class func contentAddPostWithRequestBuilder(file: Data, coluuid: String, dir: String) -> RequestBuilder<UtilContentAddResponse> {
        var path = "/content/add"
        let coluuidPreEscape = "\(coluuid)"
        let coluuidPostEscape = coluuidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{coluuid}", with: coluuidPostEscape, options: .literal, range: nil)
        let dirPreEscape = "\(dir)"
        let dirPostEscape = dirPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{dir}", with: dirPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let formParams: [String:Any?] = [
                        "file": file
        ]

        let nonNullParameters = APIHelper.rejectNil(formParams)
        let parameters = APIHelper.convertBoolToString(nonNullParameters)

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<UtilContentAddResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get aggregated content stats
     - parameter content: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAggregatedContentGet(content: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentAggregatedContentGetWithRequestBuilder(content: content).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get aggregated content stats
     - GET /content/aggregated/{content}
     - This endpoint returns aggregated content stats
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter content: (path) Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentAggregatedContentGetWithRequestBuilder(content: String) -> RequestBuilder<String> {
        var path = "/content/aggregated/{content}"
        let contentPreEscape = "\(content)"
        let contentPostEscape = contentPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{content}", with: contentPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get all deals for a user
     - parameter begin: (query) Begin 
     - parameter duration: (query) Duration 
     - parameter all: (query) All 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAllDealsGet(begin: String, duration: String, all: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentAllDealsGetWithRequestBuilder(begin: begin, duration: duration, all: all).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Get all deals for a user
     - GET /content/all-deals
     - This endpoint is used to get all deals for a user
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter begin: (query) Begin 
     - parameter duration: (query) Duration 
     - parameter all: (query) All 
     - returns: RequestBuilder<Void> 
     */
    open class func contentAllDealsGetWithRequestBuilder(begin: String, duration: String, all: String) -> RequestBuilder<Void> {
        let path = "/content/all-deals"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "begin": begin,
                        "duration": duration,
                        "all": all
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get content bandwidth
     - parameter content: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentBwUsageContentGet(content: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentBwUsageContentGetWithRequestBuilder(content: content).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Get content bandwidth
     - GET /content/bw-usage/{content}
     - This endpoint returns content bandwidth
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter content: (path) Content ID 
     - returns: RequestBuilder<Void> 
     */
    open class func contentBwUsageContentGetWithRequestBuilder(content: String) -> RequestBuilder<Void> {
        var path = "/content/bw-usage/{content}"
        let contentPreEscape = "\(content)"
        let contentPostEscape = contentPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{content}", with: contentPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Add a new content
     - parameter body: (body) Content 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentCreatePost(body: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentCreatePostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Add a new content
     - POST /content/create
     - This endpoint adds a new content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter body: (body) Content 
     - returns: RequestBuilder<Void> 
     */
    open class func contentCreatePostWithRequestBuilder(body: String) -> RequestBuilder<Void> {
        let path = "/content/create"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Content with deals
     - parameter limit: (query) Limit (optional)
     - parameter offset: (query) Offset (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentDealsGet(limit: Int32? = nil, offset: Int32? = nil, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentDealsGetWithRequestBuilder(limit: limit, offset: offset).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Content with deals
     - GET /content/deals
     - This endpoint lists all content with deals
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter limit: (query) Limit (optional)
     - parameter offset: (query) Offset (optional)
     - returns: RequestBuilder<Void> 
     */
    open class func contentDealsGetWithRequestBuilder(limit: Int32? = nil, offset: Int32? = nil) -> RequestBuilder<Void> {
        let path = "/content/deals"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "limit": limit?.encodeToJSON(),
                        "offset": offset?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Ensure Replication
     - parameter datacid: (path) Data CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentEnsureReplicationDatacidGet(datacid: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentEnsureReplicationDatacidGetWithRequestBuilder(datacid: datacid).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Ensure Replication
     - GET /content/ensure-replication/{datacid}
     - This endpoint ensures that the content is replicated to the specified number of providers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter datacid: (path) Data CID 
     - returns: RequestBuilder<Void> 
     */
    open class func contentEnsureReplicationDatacidGetWithRequestBuilder(datacid: String) -> RequestBuilder<Void> {
        var path = "/content/ensure-replication/{datacid}"
        let datacidPreEscape = "\(datacid)"
        let datacidPostEscape = datacidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{datacid}", with: datacidPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     List all failures for a content
     - parameter content: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentFailuresContentGet(content: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentFailuresContentGetWithRequestBuilder(content: content).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List all failures for a content
     - GET /content/failures/{content}
     - This endpoint returns all failures for a content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter content: (path) Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentFailuresContentGetWithRequestBuilder(content: String) -> RequestBuilder<String> {
        var path = "/content/failures/{content}"
        let contentPreEscape = "\(content)"
        let contentPostEscape = contentPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{content}", with: contentPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Import a deal
     - parameter body: (body) Import a deal 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentImportdealPost(body: MainImportDealBody, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentImportdealPostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Import a deal
     - POST /content/importdeal
     - This endpoint imports a deal into the shuttle.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter body: (body) Import a deal 
     - returns: RequestBuilder<Void> 
     */
    open class func contentImportdealPostWithRequestBuilder(body: MainImportDealBody) -> RequestBuilder<Void> {
        let path = "/content/importdeal"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     List all pinned content
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentListGet(completion: @escaping ((_ data: [String]?, _ error: ErrorResponse?) -> Void)) {
        contentListGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List all pinned content
     - GET /content/list
     - This endpoint lists all content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=[ "", "" ]}]
     - returns: RequestBuilder<[String]> 
     */
    open class func contentListGetWithRequestBuilder() -> RequestBuilder<[String]> {
        let path = "/content/list"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[String]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Read content
     - parameter cont: (path) CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentReadContGet(cont: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentReadContGetWithRequestBuilder(cont: cont).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Read content
     - GET /content/read/{cont}
     - This endpoint reads content from the blockstore
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter cont: (path) CID 
     - returns: RequestBuilder<Void> 
     */
    open class func contentReadContGetWithRequestBuilder(cont: String) -> RequestBuilder<Void> {
        var path = "/content/read/{cont}"
        let contPreEscape = "\(cont)"
        let contPostEscape = contPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{cont}", with: contPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get staging zone for user
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStagingZonesGet(completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentStagingZonesGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Get staging zone for user
     - GET /content/staging-zones
     - This endpoint is used to get staging zone for user.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - returns: RequestBuilder<Void> 
     */
    open class func contentStagingZonesGetWithRequestBuilder() -> RequestBuilder<Void> {
        let path = "/content/staging-zones"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get content statistics
     - parameter limit: (path) limit 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStatsGet(limit: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentStatsGetWithRequestBuilder(limit: limit).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Get content statistics
     - GET /content/stats
     - This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter limit: (path) limit 
     - returns: RequestBuilder<Void> 
     */
    open class func contentStatsGetWithRequestBuilder(limit: String) -> RequestBuilder<Void> {
        var path = "/content/stats"
        let limitPreEscape = "\(limit)"
        let limitPostEscape = limitPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{limit}", with: limitPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Content Status
     - parameter id: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStatusIdGet(id: Int32, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        contentStatusIdGetWithRequestBuilder(id: id).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Content Status
     - GET /content/status/{id}
     - This endpoint returns the status of a content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter id: (path) Content ID 
     - returns: RequestBuilder<Void> 
     */
    open class func contentStatusIdGetWithRequestBuilder(id: Int32) -> RequestBuilder<Void> {
        var path = "/content/status/{id}"
        let idPreEscape = "\(id)"
        let idPostEscape = idPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{id}", with: idPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
