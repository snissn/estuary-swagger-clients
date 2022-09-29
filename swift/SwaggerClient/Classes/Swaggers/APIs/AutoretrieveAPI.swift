//
// AutoretrieveAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class AutoretrieveAPI: APIBase {
    /**
     Register autoretrieve server
     
     - parameter addresses: (body) Autoretrieve&#39;s comma-separated list of addresses 
     - parameter pubKey: (body) Autoretrieve&#39;s public key 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func adminAutoretrieveInitPost(addresses addresses: String, pubKey: String, completion: ((error: ErrorType?) -> Void)) {
        adminAutoretrieveInitPostWithRequestBuilder(addresses: addresses, pubKey: pubKey).execute { (response, error) -> Void in
            completion(error: error);
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
    public class func adminAutoretrieveInitPostWithRequestBuilder(addresses addresses: String, pubKey: String) -> RequestBuilder<Void> {
        let path = "/admin/autoretrieve/init"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = pubKey.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     List autoretrieve servers
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func adminAutoretrieveListGet(completion: ((error: ErrorType?) -> Void)) {
        adminAutoretrieveListGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(error: error);
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
    public class func adminAutoretrieveListGetWithRequestBuilder() -> RequestBuilder<Void> {
        let path = "/admin/autoretrieve/list"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Marks autoretrieve server as up
     
     - parameter token: (header) Autoretrieve&#39;s auth token 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func autoretrieveHeartbeatPost(token token: String, completion: ((error: ErrorType?) -> Void)) {
        autoretrieveHeartbeatPostWithRequestBuilder(token: token).execute { (response, error) -> Void in
            completion(error: error);
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
    public class func autoretrieveHeartbeatPostWithRequestBuilder(token token: String) -> RequestBuilder<Void> {
        let path = "/autoretrieve/heartbeat"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
        let nillableHeaders: [String: AnyObject?] = [
            "token": token
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

}
