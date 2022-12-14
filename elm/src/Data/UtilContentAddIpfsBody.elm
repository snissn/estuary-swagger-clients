{-
   Estuary API
   This is the API for the Estuary application.

   OpenAPI spec version: 0.0.0
   

   NOTE: This file is auto generated by the swagger code generator program.
   https://github.com/swagger-api/swagger-codegen.git
   Do not edit this file manually.
-}


module Data.UtilContentAddIpfsBody exposing (UtilContentAddIpfsBody, utilContentAddIpfsBodyDecoder, utilContentAddIpfsBodyEncoder)

import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (decode, optional, required)
import Json.Encode as Encode
import Maybe exposing (map, withDefault)




type alias UtilContentAddIpfsBody =
    { coluuid : Maybe String
    , dir : Maybe String
    , filename : Maybe String
    , peers : Maybe (List String)
    , root : Maybe String
    }


utilContentAddIpfsBodyDecoder : Decoder UtilContentAddIpfsBody
utilContentAddIpfsBodyDecoder =
    decode UtilContentAddIpfsBody
        |> optional "coluuid" (Decode.nullable Decode.string) Nothing
        |> optional "dir" (Decode.nullable Decode.string) Nothing
        |> optional "filename" (Decode.nullable Decode.string) Nothing
        |> optional "peers" (Decode.nullable (Decode.list Decode.string)) Nothing
        |> optional "root" (Decode.nullable Decode.string) Nothing



utilContentAddIpfsBodyEncoder : UtilContentAddIpfsBody -> Encode.Value
utilContentAddIpfsBodyEncoder model =
    Encode.object
        [ ( "coluuid", withDefault Encode.null (map Encode.string model.coluuid) )
        , ( "dir", withDefault Encode.null (map Encode.string model.dir) )
        , ( "filename", withDefault Encode.null (map Encode.string model.filename) )
        , ( "peers", withDefault Encode.null (map (Encode.list << List.map Encode.string) model.peers) )
        , ( "root", withDefault Encode.null (map Encode.string model.root) )
        ]


