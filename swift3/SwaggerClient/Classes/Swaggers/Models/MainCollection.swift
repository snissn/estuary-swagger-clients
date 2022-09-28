//
// MainCollection.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class MainCollection: JSONEncodable {
    public var cid: String?
    public var createdAt: String?
    public var description: String?
    public var name: String?
    public var userId: Int32?
    public var uuid: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["cid"] = self.cid
        nillableDictionary["createdAt"] = self.createdAt
        nillableDictionary["description"] = self.description
        nillableDictionary["name"] = self.name
        nillableDictionary["userId"] = self.userId?.encodeToJSON()
        nillableDictionary["uuid"] = self.uuid

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
