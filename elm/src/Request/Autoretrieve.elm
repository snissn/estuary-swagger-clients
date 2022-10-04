{-
   Estuary API
   This is the API for the Estuary application.

   OpenAPI spec version: 0.0.0
   

   NOTE: This file is auto generated by the swagger code generator program.
   https://github.com/swagger-api/swagger-codegen.git
   Do not edit this file manually.
-}


module Request.Autoretrieve exposing (adminAutoretrieveInitPost, adminAutoretrieveListGet, autoretrieveHeartbeatPost)

import Http
import Json.Decode as Decode


basePath : String
basePath =
    "https://api.estuary.tech"


{-
   This endpoint registers a new autoretrieve server Q@&amp;^5#^&amp;*Q^Wasdfalsdkjflkj
-}
adminAutoretrieveInitPost : Http.Request 
adminAutoretrieveInitPost =
    { method = "POST"
    , url = basePath ++ "/admin/autoretrieve/init"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint lists all registered autoretrieve servers
-}
adminAutoretrieveListGet : Http.Request 
adminAutoretrieveListGet =
    { method = "GET"
    , url = basePath ++ "/admin/autoretrieve/list"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint updates the lastConnection field for autoretrieve
-}
autoretrieveHeartbeatPost : Http.Request 
autoretrieveHeartbeatPost =
    { method = "POST"
    , url = basePath ++ "/autoretrieve/heartbeat"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


