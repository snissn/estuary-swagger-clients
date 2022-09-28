//
// MainGetApiKeysResp.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class MainGetApiKeysResp: JSONEncodable {
    public var expiry: String?
    public var token: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["expiry"] = self.expiry
        nillableDictionary["token"] = self.token

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
