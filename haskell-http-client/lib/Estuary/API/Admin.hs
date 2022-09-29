{-
   Estuary API

   This is the API for the Estuary application.

   OpenAPI spec version: 2.0
   Estuary API API version: 0.0.0
   Generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
-}

{-|
Module : Estuary.API.Admin
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Estuary.API.Admin where

import Estuary.Core
import Estuary.MimeTypes
import Estuary.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Admin

-- *** adminPeeringPeersDelete

-- | @DELETE \/admin\/peering\/peers@
-- 
-- Remove peers on Peering Service
-- 
-- This endpoint can be used to remove a Peer from the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringPeersDelete 
  :: EstuaryRequest AdminPeeringPeersDelete MimeNoContent res MimeJSON
adminPeeringPeersDelete =
  _mkRequest "DELETE" ["/admin/peering/peers"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringPeersDelete  
-- | @application/json@
instance Produces AdminPeeringPeersDelete MimeJSON


-- *** adminPeeringPeersGet

-- | @GET \/admin\/peering\/peers@
-- 
-- List all Peering peers
-- 
-- This endpoint can be used to list all peers on Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringPeersGet 
  :: EstuaryRequest AdminPeeringPeersGet MimeNoContent res MimeJSON
adminPeeringPeersGet =
  _mkRequest "GET" ["/admin/peering/peers"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringPeersGet  
-- | @application/json@
instance Produces AdminPeeringPeersGet MimeJSON


-- *** adminPeeringPeersPost

-- | @POST \/admin\/peering\/peers@
-- 
-- Add peers on Peering Service
-- 
-- This endpoint can be used to add a Peer from the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringPeersPost 
  :: EstuaryRequest AdminPeeringPeersPost MimeNoContent res MimeJSON
adminPeeringPeersPost =
  _mkRequest "POST" ["/admin/peering/peers"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringPeersPost  
-- | @application/json@
instance Produces AdminPeeringPeersPost MimeJSON


-- *** adminPeeringStartPost

-- | @POST \/admin\/peering\/start@
-- 
-- Start Peering
-- 
-- This endpoint can be used to start the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringStartPost 
  :: EstuaryRequest AdminPeeringStartPost MimeNoContent res MimeJSON
adminPeeringStartPost =
  _mkRequest "POST" ["/admin/peering/start"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringStartPost  
-- | @application/json@
instance Produces AdminPeeringStartPost MimeJSON


-- *** adminPeeringStatusGet

-- | @GET \/admin\/peering\/status@
-- 
-- Check Peering Status
-- 
-- This endpoint can be used to check the Peering status
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringStatusGet 
  :: EstuaryRequest AdminPeeringStatusGet MimeNoContent res MimeJSON
adminPeeringStatusGet =
  _mkRequest "GET" ["/admin/peering/status"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringStatusGet  
-- | @application/json@
instance Produces AdminPeeringStatusGet MimeJSON


-- *** adminPeeringStopPost

-- | @POST \/admin\/peering\/stop@
-- 
-- Stop Peering
-- 
-- This endpoint can be used to stop the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringStopPost 
  :: EstuaryRequest AdminPeeringStopPost MimeNoContent res MimeJSON
adminPeeringStopPost =
  _mkRequest "POST" ["/admin/peering/stop"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringStopPost  
-- | @application/json@
instance Produces AdminPeeringStopPost MimeJSON


-- *** adminSystemConfigGet

-- | @GET \/admin\/system\/config@
-- 
-- Get systems(estuary/shuttle) config
-- 
-- This endpoint is used to get system configs.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminSystemConfigGet 
  :: EstuaryRequest AdminSystemConfigGet MimeNoContent res MimeJSON
adminSystemConfigGet =
  _mkRequest "GET" ["/admin/system/config"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminSystemConfigGet  
-- | @application/json@
instance Produces AdminSystemConfigGet MimeJSON


-- *** adminUsersGet

-- | @GET \/admin\/users@
-- 
-- Get all users
-- 
-- This endpoint is used to get all users.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminUsersGet 
  :: EstuaryRequest AdminUsersGet MimeNoContent res MimeJSON
adminUsersGet =
  _mkRequest "GET" ["/admin/users"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminUsersGet  
-- | @application/json@
instance Produces AdminUsersGet MimeJSON
