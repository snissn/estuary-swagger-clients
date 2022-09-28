//
// MinerAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class MinerAPI {
    /**
     Get all miners deals
     - parameter miner: (path) Filter by miner 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicMinersDealsMinerGet(miner: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        publicMinersDealsMinerGetWithRequestBuilder(miner: miner).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Get all miners deals
     - GET /public/miners/deals/{miner}
     - This endpoint returns all miners deals
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter miner: (path) Filter by miner 

     - returns: RequestBuilder<Void> 
     */
    open class func publicMinersDealsMinerGetWithRequestBuilder(miner: String) -> RequestBuilder<Void> {
        var path = "/public/miners/deals/{miner}"
        let minerPreEscape = "\(miner)"
        let minerPostEscape = minerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{miner}", with: minerPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get miner stats
     - parameter miner: (path) Filter by miner 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicMinersStatsMinerGet(miner: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        publicMinersStatsMinerGetWithRequestBuilder(miner: miner).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Get miner stats
     - GET /public/miners/stats/{miner}
     - This endpoint returns miner stats
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter miner: (path) Filter by miner 

     - returns: RequestBuilder<Void> 
     */
    open class func publicMinersStatsMinerGetWithRequestBuilder(miner: String) -> RequestBuilder<Void> {
        var path = "/public/miners/stats/{miner}"
        let minerPreEscape = "\(miner)"
        let minerPostEscape = minerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{miner}", with: minerPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
