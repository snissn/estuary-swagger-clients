//
// AutoretrieveAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class AutoretrieveAPI: APIBase {
    /**
     Register autoretrieve server
     - parameter addresses: (body) Autoretrieve&#39;s comma-separated list of addresses 
     - parameter pubKey: (body) Autoretrieve&#39;s public key 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminAutoretrieveInitPost(addresses: String, pubKey: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        adminAutoretrieveInitPostWithRequestBuilder(addresses: addresses, pubKey: pubKey).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Register autoretrieve server
     - POST /admin/autoretrieve/init
     - This endpoint registers a new autoretrieve server
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter addresses: (body) Autoretrieve&#39;s comma-separated list of addresses 
     - parameter pubKey: (body) Autoretrieve&#39;s public key 
     - returns: RequestBuilder<Void> 
     */
    open class func adminAutoretrieveInitPostWithRequestBuilder(addresses: String, pubKey: String) -> RequestBuilder<Void> {
        let path = "/admin/autoretrieve/init"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = pubKey.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     List autoretrieve servers
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminAutoretrieveListGet(completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        adminAutoretrieveListGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     List autoretrieve servers
     - GET /admin/autoretrieve/list
     - This endpoint lists all registered autoretrieve servers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - returns: RequestBuilder<Void> 
     */
    open class func adminAutoretrieveListGetWithRequestBuilder() -> RequestBuilder<Void> {
        let path = "/admin/autoretrieve/list"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Marks autoretrieve server as up
     - parameter token: (header) Autoretrieve&#39;s auth token 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func autoretrieveHeartbeatPost(token: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        autoretrieveHeartbeatPostWithRequestBuilder(token: token).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Marks autoretrieve server as up
     - POST /autoretrieve/heartbeat
     - This endpoint updates the lastConnection field for autoretrieve
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter token: (header) Autoretrieve&#39;s auth token 
     - returns: RequestBuilder<Void> 
     */
    open class func autoretrieveHeartbeatPostWithRequestBuilder(token: String) -> RequestBuilder<Void> {
        let path = "/autoretrieve/heartbeat"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)
        let nillableHeaders: [String: Any?] = [
            "token": token
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false, headers: headerParameters)
    }

}
