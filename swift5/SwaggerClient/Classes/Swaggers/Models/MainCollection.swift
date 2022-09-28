//
// MainCollection.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MainCollection: Codable {

    public var cid: String?
    public var createdAt: String?
    public var _description: String?
    public var name: String?
    public var userId: Int?
    public var uuid: String?

    public init(cid: String? = nil, createdAt: String? = nil, _description: String? = nil, name: String? = nil, userId: Int? = nil, uuid: String? = nil) {
        self.cid = cid
        self.createdAt = createdAt
        self._description = _description
        self.name = name
        self.userId = userId
        self.uuid = uuid
    }

    public enum CodingKeys: String, CodingKey { 
        case cid
        case createdAt
        case _description = "description"
        case name
        case userId
        case uuid
    }

}
