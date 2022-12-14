//
// NetAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class NetAPI: APIBase {
    /**
     Net Addrs
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func netAddrsGet(completion: ((data: [String]?, error: ErrorType?) -> Void)) {
        netAddrsGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Net Addrs
     - GET /net/addrs
     - This endpoint is used to get net addrs
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={}}]

     - returns: RequestBuilder<[String]> 
     */
    public class func netAddrsGetWithRequestBuilder() -> RequestBuilder<[String]> {
        let path = "/net/addrs"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[String]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Get all miners
     
     - parameter miner: (path) Filter by miner 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func publicMinersFailuresMinerGet(miner miner: String, completion: ((error: ErrorType?) -> Void)) {
        publicMinersFailuresMinerGetWithRequestBuilder(miner: miner).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     Get all miners
     - GET /public/miners/failures/{miner}
     - This endpoint returns all miners
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     
     - parameter miner: (path) Filter by miner 

     - returns: RequestBuilder<Void> 
     */
    public class func publicMinersFailuresMinerGetWithRequestBuilder(miner miner: String) -> RequestBuilder<Void> {
        var path = "/public/miners/failures/{miner}"
        path = path.stringByReplacingOccurrencesOfString("{miner}", withString: "\(miner)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Get all miners
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func publicMinersGet(completion: ((error: ErrorType?) -> Void)) {
        publicMinersGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     Get all miners
     - GET /public/miners
     - This endpoint returns all miners
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth

     - returns: RequestBuilder<Void> 
     */
    public class func publicMinersGetWithRequestBuilder() -> RequestBuilder<Void> {
        let path = "/public/miners"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Net Addrs
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func publicNetAddrsGet(completion: ((data: [String]?, error: ErrorType?) -> Void)) {
        publicNetAddrsGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Net Addrs
     - GET /public/net/addrs
     - This endpoint is used to get net addrs
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={}}]

     - returns: RequestBuilder<[String]> 
     */
    public class func publicNetAddrsGetWithRequestBuilder() -> RequestBuilder<[String]> {
        let path = "/public/net/addrs"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[String]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Net Peers
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func publicNetPeersGet(completion: ((data: [String]?, error: ErrorType?) -> Void)) {
        publicNetPeersGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Net Peers
     - GET /public/net/peers
     - This endpoint is used to get net peers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={}}]

     - returns: RequestBuilder<[String]> 
     */
    public class func publicNetPeersGetWithRequestBuilder() -> RequestBuilder<[String]> {
        let path = "/public/net/peers"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[String]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
