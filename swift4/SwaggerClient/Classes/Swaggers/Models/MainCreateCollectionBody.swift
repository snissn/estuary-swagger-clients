//
// MainCreateCollectionBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct MainCreateCollectionBody: Codable {


    public var _description: String?

    public var name: String?
    public init(_description: String? = nil, name: String? = nil) { 
        self._description = _description
        self.name = name
    }
    public enum CodingKeys: String, CodingKey { 
        case _description = "description"
        case name
    }

}