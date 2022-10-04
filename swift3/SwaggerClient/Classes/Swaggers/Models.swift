// Models.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

protocol JSONEncodable {
    func encodeToJSON() -> Any
}

public enum ErrorResponse : Error {
    case HttpError(statusCode: Int, data: Data?, error: Error)
    case DecodeError(response: Data?, decodeError: DecodeError)
}

open class Response<T> {
    open let statusCode: Int
    open let header: [String: String]
    open let body: T?

    public init(statusCode: Int, header: [String: String], body: T?) {
        self.statusCode = statusCode
        self.header = header
        self.body = body
    }

    public convenience init(response: HTTPURLResponse, body: T?) {
        let rawHeader = response.allHeaderFields
        var header = [String:String]()
        for case let (key, value) as (String, String) in rawHeader {
            header[key] = value
        }
        self.init(statusCode: response.statusCode, header: header, body: body)
    }
}

public enum Decoded<ValueType> {
    case success(ValueType)
    case failure(DecodeError)
}

public extension Decoded {
    var value: ValueType? {
        switch self {
        case let .success(value):
            return value
        case .failure:
            return nil
        }
    }
}

public enum DecodeError {
    case typeMismatch(expected: String, actual: String)
    case missingKey(key: String)
    case parseError(message: String)
}

private var once = Int()
class Decoders {
    static fileprivate var decoders = Dictionary<String, ((AnyObject, AnyObject?) -> AnyObject)>()

    static func addDecoder<T>(clazz: T.Type, decoder: @escaping ((AnyObject, AnyObject?) -> Decoded<T>)) {
        let key = "\(T.self)"
        decoders[key] = { decoder($0, $1) as AnyObject }
    }

    static func decode<T>(clazz: T.Type, discriminator: String, source: AnyObject) -> Decoded<T> {
        let key = discriminator
        if let decoder = decoders[key], let value = decoder(source, nil) as? Decoded<T> {
            return value
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decode<T>(clazz: [T].Type, source: AnyObject) -> Decoded<[T]> {
        if let sourceArray = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in sourceArray {
                switch Decoders.decode(clazz: T.self, source: sourceValue, instance: nil) {
                case let .success(value):
                    values.append(value)
                case let .failure(error):
                    return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decode<T>(clazz: T.Type, source: AnyObject) -> Decoded<T> {
        switch Decoders.decode(clazz: T.self, source: source, instance: nil) {
    	    case let .success(value):
                return .success(value)
            case let .failure(error):
                return .failure(error)
        }
    }

    static open func decode<T: RawRepresentable>(clazz: T.Type, source: AnyObject) -> Decoded<T> {
        if let value = source as? T.RawValue {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "\(T.RawValue.self) matching a case from the enumeration \(T.self)", actual: String(describing: type(of: source))))
        }
    }

    static func decode<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject) -> Decoded<[Key:T]> {
        if let sourceDictionary = source as? [Key: AnyObject] {
            var dictionary = [Key:T]()
            for (key, value) in sourceDictionary {
                switch Decoders.decode(clazz: T.self, source: value, instance: nil) {
                case let .success(value):
                    dictionary[key] = value
                case let .failure(error):
                    return .failure(error)
                }
            }
            return .success(dictionary)
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decodeOptional<T: RawRepresentable>(clazz: T.Type, source: AnyObject?) -> Decoded<T?> {
        guard !(source is NSNull), source != nil else { return .success(nil) }
        if let value = source as? T.RawValue {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "\(T.RawValue.self) matching a case from the enumeration \(T.self)", actual: String(describing: type(of: source))))
        }
    }

    static func decode<T>(clazz: T.Type, source: AnyObject, instance: AnyObject?) -> Decoded<T> {
        initialize()
        if let sourceNumber = source as? NSNumber, let value = sourceNumber.int32Value as? T, T.self is Int32.Type {
            return .success(value)
        }
        if let sourceNumber = source as? NSNumber, let value = sourceNumber.int32Value as? T, T.self is Int64.Type {
     	    return .success(value)
        }
        if let intermediate = source as? String, let value = UUID(uuidString: intermediate) as? T, source is String, T.self is UUID.Type {
            return .success(value)
        }
        if let value = source as? T {
            return .success(value)
        }
        if let intermediate = source as? String, let value = Data(base64Encoded: intermediate) as? T {
            return .success(value)
        }

        let key = "\(T.self)"
        if let decoder = decoders[key], let value = decoder(source, instance) as? Decoded<T> {
           return value
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    //Convert a Decoded so that its value is optional. DO WE STILL NEED THIS?
    static func toOptional<T>(decoded: Decoded<T>) -> Decoded<T?> {
        return .success(decoded.value)
    }

    static func decodeOptional<T>(clazz: T.Type, source: AnyObject?) -> Decoded<T?> {
        if let source = source, !(source is NSNull) {
            switch Decoders.decode(clazz: clazz, source: source, instance: nil) {
            case let .success(value): return .success(value)
            case let .failure(error): return .failure(error)
            }
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T>(clazz: [T].Type, source: AnyObject?) -> Decoded<[T]?> where T: RawRepresentable {
        if let source = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in source {
                switch Decoders.decodeOptional(clazz: T.self, source: sourceValue) {
                case let .success(value): if let value = value { values.append(value) }
                case let .failure(error): return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T>(clazz: [T].Type, source: AnyObject?) -> Decoded<[T]?> {
        if let source = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in source {
                switch Decoders.decode(clazz: T.self, source: sourceValue, instance: nil) {
                case let .success(value): values.append(value)
                case let .failure(error): return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject?) -> Decoded<[Key:T]?> {
        if let sourceDictionary = source as? [Key: AnyObject] {
            var dictionary = [Key:T]()
            for (key, value) in sourceDictionary {
                switch Decoders.decode(clazz: T.self, source: value, instance: nil) {
                case let .success(value): dictionary[key] = value
                case let .failure(error): return .failure(error)
                }
            }
            return .success(dictionary)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T: RawRepresentable, U: AnyObject>(clazz: T, source: AnyObject) -> Decoded<T?> where T.RawValue == U {
        if let value = source as? U {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "String", actual: String(describing: type(of: source))))
        }
    }


    private static var __once: () = {
        let formatters = [
            "yyyy-MM-dd",
            "yyyy-MM-dd'T'HH:mm:ssZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss'Z'",
            "yyyy-MM-dd'T'HH:mm:ss.SSS",
            "yyyy-MM-dd HH:mm:ss"
        ].map { (format: String) -> DateFormatter in
            let formatter = DateFormatter()
            formatter.locale = Locale(identifier: "en_US_POSIX")
            formatter.dateFormat = format
            return formatter
        }
        // Decoder for Date
        Decoders.addDecoder(clazz: Date.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<Date> in
           if let sourceString = source as? String {
                for formatter in formatters {
                    if let date = formatter.date(from: sourceString) {
                        return .success(date)
                    }
                }
            }
            if let sourceInt = source as? Int {
                // treat as a java date
                return .success(Date(timeIntervalSince1970: Double(sourceInt / 1000) ))
            }
            if source is String || source is Int {
                return .failure(.parseError(message: "Could not decode date"))
            } else {
                return .failure(.typeMismatch(expected: "String or Int", actual: "\(source)"))
            }
        }

        // Decoder for ISOFullDate
        Decoders.addDecoder(clazz: ISOFullDate.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<ISOFullDate> in
            if let string = source as? String,
               let isoDate = ISOFullDate.from(string: string) {
                return .success(isoDate)
            } else {
            	return .failure(.typeMismatch(expected: "ISO date", actual: "\(source)"))
            }
        }

        // Decoder for [CollectionsCollection]
        Decoders.addDecoder(clazz: [CollectionsCollection].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[CollectionsCollection]> in
            return Decoders.decode(clazz: [CollectionsCollection].self, source: source)
        }

        // Decoder for CollectionsCollection
        Decoders.addDecoder(clazz: CollectionsCollection.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<CollectionsCollection> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? CollectionsCollection() : instance as! CollectionsCollection
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["cid"] as AnyObject?) {
                
                case let .success(value): _result.cid = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["createdAt"] as AnyObject?) {
                
                case let .success(value): _result.createdAt = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["description"] as AnyObject?) {
                
                case let .success(value): _result.description = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["name"] as AnyObject?) {
                
                case let .success(value): _result.name = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["userId"] as AnyObject?) {
                
                case let .success(value): _result.userId = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["uuid"] as AnyObject?) {
                
                case let .success(value): _result.uuid = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "CollectionsCollection", actual: "\(source)"))
            }
        }
        // Decoder for [MainCreateCollectionBody]
        Decoders.addDecoder(clazz: [MainCreateCollectionBody].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[MainCreateCollectionBody]> in
            return Decoders.decode(clazz: [MainCreateCollectionBody].self, source: source)
        }

        // Decoder for MainCreateCollectionBody
        Decoders.addDecoder(clazz: MainCreateCollectionBody.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<MainCreateCollectionBody> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? MainCreateCollectionBody() : instance as! MainCreateCollectionBody
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["description"] as AnyObject?) {
                
                case let .success(value): _result.description = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["name"] as AnyObject?) {
                
                case let .success(value): _result.name = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "MainCreateCollectionBody", actual: "\(source)"))
            }
        }
        // Decoder for [MainDeleteContentFromCollectionBody]
        Decoders.addDecoder(clazz: [MainDeleteContentFromCollectionBody].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[MainDeleteContentFromCollectionBody]> in
            return Decoders.decode(clazz: [MainDeleteContentFromCollectionBody].self, source: source)
        }

        // Decoder for MainDeleteContentFromCollectionBody
        Decoders.addDecoder(clazz: MainDeleteContentFromCollectionBody.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<MainDeleteContentFromCollectionBody> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? MainDeleteContentFromCollectionBody() : instance as! MainDeleteContentFromCollectionBody
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["by"] as AnyObject?) {
                
                case let .success(value): _result.by = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["value"] as AnyObject?) {
                
                case let .success(value): _result.value = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "MainDeleteContentFromCollectionBody", actual: "\(source)"))
            }
        }
        // Decoder for [MainEstimateDealBody]
        Decoders.addDecoder(clazz: [MainEstimateDealBody].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[MainEstimateDealBody]> in
            return Decoders.decode(clazz: [MainEstimateDealBody].self, source: source)
        }

        // Decoder for MainEstimateDealBody
        Decoders.addDecoder(clazz: MainEstimateDealBody.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<MainEstimateDealBody> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? MainEstimateDealBody() : instance as! MainEstimateDealBody
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["durationBlks"] as AnyObject?) {
                
                case let .success(value): _result.durationBlks = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["replication"] as AnyObject?) {
                
                case let .success(value): _result.replication = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["size"] as AnyObject?) {
                
                case let .success(value): _result.size = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["verified"] as AnyObject?) {
                
                case let .success(value): _result.verified = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "MainEstimateDealBody", actual: "\(source)"))
            }
        }
        // Decoder for [MainGetApiKeysResp]
        Decoders.addDecoder(clazz: [MainGetApiKeysResp].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[MainGetApiKeysResp]> in
            return Decoders.decode(clazz: [MainGetApiKeysResp].self, source: source)
        }

        // Decoder for MainGetApiKeysResp
        Decoders.addDecoder(clazz: MainGetApiKeysResp.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<MainGetApiKeysResp> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? MainGetApiKeysResp() : instance as! MainGetApiKeysResp
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["expiry"] as AnyObject?) {
                
                case let .success(value): _result.expiry = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["token"] as AnyObject?) {
                
                case let .success(value): _result.token = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "MainGetApiKeysResp", actual: "\(source)"))
            }
        }
        // Decoder for [MainImportDealBody]
        Decoders.addDecoder(clazz: [MainImportDealBody].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[MainImportDealBody]> in
            return Decoders.decode(clazz: [MainImportDealBody].self, source: source)
        }

        // Decoder for MainImportDealBody
        Decoders.addDecoder(clazz: MainImportDealBody.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<MainImportDealBody> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? MainImportDealBody() : instance as! MainImportDealBody
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["coluuid"] as AnyObject?) {
                
                case let .success(value): _result.coluuid = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: [Int32].self, source: sourceDictionary["dealIDs"] as AnyObject?) {
                
                case let .success(value): _result.dealIDs = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["dir"] as AnyObject?) {
                
                case let .success(value): _result.dir = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["name"] as AnyObject?) {
                
                case let .success(value): _result.name = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "MainImportDealBody", actual: "\(source)"))
            }
        }
        // Decoder for [MainUserStatsResponse]
        Decoders.addDecoder(clazz: [MainUserStatsResponse].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[MainUserStatsResponse]> in
            return Decoders.decode(clazz: [MainUserStatsResponse].self, source: source)
        }

        // Decoder for MainUserStatsResponse
        Decoders.addDecoder(clazz: MainUserStatsResponse.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<MainUserStatsResponse> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? MainUserStatsResponse() : instance as! MainUserStatsResponse
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["numPins"] as AnyObject?) {
                
                case let .success(value): _result.numPins = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["totalSize"] as AnyObject?) {
                
                case let .success(value): _result.totalSize = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "MainUserStatsResponse", actual: "\(source)"))
            }
        }
        // Decoder for [UtilContentAddIpfsBody]
        Decoders.addDecoder(clazz: [UtilContentAddIpfsBody].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[UtilContentAddIpfsBody]> in
            return Decoders.decode(clazz: [UtilContentAddIpfsBody].self, source: source)
        }

        // Decoder for UtilContentAddIpfsBody
        Decoders.addDecoder(clazz: UtilContentAddIpfsBody.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<UtilContentAddIpfsBody> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? UtilContentAddIpfsBody() : instance as! UtilContentAddIpfsBody
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["coluuid"] as AnyObject?) {
                
                case let .success(value): _result.coluuid = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["dir"] as AnyObject?) {
                
                case let .success(value): _result.dir = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["filename"] as AnyObject?) {
                
                case let .success(value): _result.filename = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: [String].self, source: sourceDictionary["peers"] as AnyObject?) {
                
                case let .success(value): _result.peers = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["root"] as AnyObject?) {
                
                case let .success(value): _result.root = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "UtilContentAddIpfsBody", actual: "\(source)"))
            }
        }
        // Decoder for [UtilContentAddResponse]
        Decoders.addDecoder(clazz: [UtilContentAddResponse].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[UtilContentAddResponse]> in
            return Decoders.decode(clazz: [UtilContentAddResponse].self, source: source)
        }

        // Decoder for UtilContentAddResponse
        Decoders.addDecoder(clazz: UtilContentAddResponse.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<UtilContentAddResponse> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? UtilContentAddResponse() : instance as! UtilContentAddResponse
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["cid"] as AnyObject?) {
                
                case let .success(value): _result.cid = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["estuaryId"] as AnyObject?) {
                
                case let .success(value): _result.estuaryId = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: [String].self, source: sourceDictionary["providers"] as AnyObject?) {
                
                case let .success(value): _result.providers = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["retrieval_url"] as AnyObject?) {
                
                case let .success(value): _result.retrievalUrl = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "UtilContentAddResponse", actual: "\(source)"))
            }
        }
        // Decoder for [UtilHttpError]
        Decoders.addDecoder(clazz: [UtilHttpError].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[UtilHttpError]> in
            return Decoders.decode(clazz: [UtilHttpError].self, source: source)
        }

        // Decoder for UtilHttpError
        Decoders.addDecoder(clazz: UtilHttpError.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<UtilHttpError> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? UtilHttpError() : instance as! UtilHttpError
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["code"] as AnyObject?) {
                
                case let .success(value): _result.code = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["details"] as AnyObject?) {
                
                case let .success(value): _result.details = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["reason"] as AnyObject?) {
                
                case let .success(value): _result.reason = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "UtilHttpError", actual: "\(source)"))
            }
        }
    }()

    static fileprivate func initialize() {
        _ = Decoders.__once
    }
}
