//
// MainGetApiKeysResp.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MainGetApiKeysResp: Codable {

    public var expiry: String?
    public var token: String?

    public init(expiry: String? = nil, token: String? = nil) {
        self.expiry = expiry
        self.token = token
    }


}