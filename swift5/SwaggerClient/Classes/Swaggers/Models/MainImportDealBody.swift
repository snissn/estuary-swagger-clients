//
// MainImportDealBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MainImportDealBody: Codable {

    public var coluuid: String?
    public var dealIDs: [Int]?
    public var dir: String?
    public var name: String?

    public init(coluuid: String?, dealIDs: [Int]?, dir: String?, name: String?) {
        self.coluuid = coluuid
        self.dealIDs = dealIDs
        self.dir = dir
        self.name = name
    }


}

