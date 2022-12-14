//
// MainImportDealBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class MainImportDealBody: JSONEncodable {
    public var coluuid: String?
    public var dealIDs: [Int32]?
    public var dir: String?
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["coluuid"] = self.coluuid
        nillableDictionary["dealIDs"] = self.dealIDs?.encodeToJSON()
        nillableDictionary["dir"] = self.dir
        nillableDictionary["name"] = self.name
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
