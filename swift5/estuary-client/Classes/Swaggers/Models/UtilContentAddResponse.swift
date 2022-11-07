//
// UtilContentAddResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct UtilContentAddResponse: Codable {

    public var cid: String?
    public var estuaryId: Int?
    public var providers: [String]?
    public var retrievalUrl: String?

    public init(cid: String?, estuaryId: Int?, providers: [String]?, retrievalUrl: String?) {
        self.cid = cid
        self.estuaryId = estuaryId
        self.providers = providers
        self.retrievalUrl = retrievalUrl
    }

    public enum CodingKeys: String, CodingKey { 
        case cid
        case estuaryId
        case providers
        case retrievalUrl = "retrieval_url"
    }


}
