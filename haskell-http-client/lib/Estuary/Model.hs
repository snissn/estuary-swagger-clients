{-
   Estuary API

   This is the API for the Estuary application.

   OpenAPI spec version: 2.0
   Estuary API API version: 0.0.0
   Generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
-}

{-|
Module : Estuary.Model
-}

{-# LANGUAGE DeriveDataTypeable #-}
{-# LANGUAGE DeriveFoldable #-}
{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE DeriveTraversable #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE LambdaCase #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE TupleSections #-}
{-# LANGUAGE TypeFamilies #-}
{-# OPTIONS_GHC -fno-warn-unused-matches -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Estuary.Model where

import Estuary.Core
import Estuary.MimeTypes

import Data.Aeson ((.:),(.:!),(.:?),(.=))

import qualified Control.Arrow as P (left)
import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Base64 as B64
import qualified Data.ByteString.Char8 as BC
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.HashMap.Lazy as HM
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Time as TI
import qualified Lens.Micro as L
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Control.Applicative ((<|>))
import Control.Applicative (Alternative)
import Data.Function ((&))
import Data.Monoid ((<>))
import Data.Text (Text)
import Prelude (($),(/=),(.),(<$>),(<*>),(>>=),(=<<),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)

import qualified Prelude as P



-- * Parameter newtypes


-- ** Addresses2
newtype Addresses2 = Addresses2 { unAddresses2 :: Text } deriving (P.Eq, P.Show, A.ToJSON)

-- ** All
newtype All = All { unAll :: Text } deriving (P.Eq, P.Show)

-- ** Begin
newtype Begin = Begin { unBegin :: Text } deriving (P.Eq, P.Show)

-- ** Body
newtype Body = Body { unBody :: [Int] } deriving (P.Eq, P.Show, A.ToJSON)

-- ** BodyText
newtype BodyText = BodyText { unBodyText :: Text } deriving (P.Eq, P.Show, A.ToJSON)

-- ** Cid
newtype Cid = Cid { unCid :: Text } deriving (P.Eq, P.Show)

-- ** Coluuid
newtype Coluuid = Coluuid { unColuuid :: Text } deriving (P.Eq, P.Show)

-- ** Commp
newtype Commp = Commp { unCommp :: Text } deriving (P.Eq, P.Show)

-- ** Cont
newtype Cont = Cont { unCont :: Text } deriving (P.Eq, P.Show)

-- ** Content
newtype Content = Content { unContent :: Text } deriving (P.Eq, P.Show)

-- ** Datacid
newtype Datacid = Datacid { unDatacid :: Text } deriving (P.Eq, P.Show)

-- ** Deal
newtype Deal = Deal { unDeal :: Int } deriving (P.Eq, P.Show)

-- ** DealRequest2
newtype DealRequest2 = DealRequest2 { unDealRequest2 :: Text } deriving (P.Eq, P.Show, A.ToJSON)

-- ** Dealid
newtype Dealid = Dealid { unDealid :: Int } deriving (P.Eq, P.Show)

-- ** Dir
newtype Dir = Dir { unDir :: Text } deriving (P.Eq, P.Show)

-- ** Duration
newtype Duration = Duration { unDuration :: Text } deriving (P.Eq, P.Show)

-- ** File
newtype File = File { unFile :: FilePath } deriving (P.Eq, P.Show)

-- ** Filename
newtype Filename = Filename { unFilename :: Text } deriving (P.Eq, P.Show)

-- ** Id
newtype Id = Id { unId :: Int } deriving (P.Eq, P.Show)

-- ** Key
newtype Key = Key { unKey :: Text } deriving (P.Eq, P.Show)

-- ** Limit
newtype Limit = Limit { unLimit :: Int } deriving (P.Eq, P.Show)

-- ** LimitText
newtype LimitText = LimitText { unLimitText :: Text } deriving (P.Eq, P.Show)

-- ** Miner
newtype Miner = Miner { unMiner :: Text } deriving (P.Eq, P.Show)

-- ** Name
newtype Name = Name { unName :: Text } deriving (P.Eq, P.Show)

-- ** Offset
newtype Offset = Offset { unOffset :: Int } deriving (P.Eq, P.Show)

-- ** Path
newtype Path = Path { unPath :: Text } deriving (P.Eq, P.Show)

-- ** Pinid
newtype Pinid = Pinid { unPinid :: Text } deriving (P.Eq, P.Show)

-- ** Propcid
newtype Propcid = Propcid { unPropcid :: Text } deriving (P.Eq, P.Show)

-- ** PubKey2
newtype PubKey2 = PubKey2 { unPubKey2 :: Text } deriving (P.Eq, P.Show, A.ToJSON)

-- ** Size
newtype Size = Size { unSize :: Text } deriving (P.Eq, P.Show)

-- ** Token
newtype Token = Token { unToken :: Text } deriving (P.Eq, P.Show)

-- * Models


-- ** MainCollection
-- | MainCollection
data MainCollection = MainCollection
  { mainCollectionCid :: !(Maybe Text) -- ^ "cid"
  , mainCollectionCreatedAt :: !(Maybe Text) -- ^ "createdAt"
  , mainCollectionDescription :: !(Maybe Text) -- ^ "description"
  , mainCollectionName :: !(Maybe Text) -- ^ "name"
  , mainCollectionUserId :: !(Maybe Int) -- ^ "userId"
  , mainCollectionUuid :: !(Maybe Text) -- ^ "uuid"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MainCollection
instance A.FromJSON MainCollection where
  parseJSON = A.withObject "MainCollection" $ \o ->
    MainCollection
      <$> (o .:? "cid")
      <*> (o .:? "createdAt")
      <*> (o .:? "description")
      <*> (o .:? "name")
      <*> (o .:? "userId")
      <*> (o .:? "uuid")

-- | ToJSON MainCollection
instance A.ToJSON MainCollection where
  toJSON MainCollection {..} =
   _omitNulls
      [ "cid" .= mainCollectionCid
      , "createdAt" .= mainCollectionCreatedAt
      , "description" .= mainCollectionDescription
      , "name" .= mainCollectionName
      , "userId" .= mainCollectionUserId
      , "uuid" .= mainCollectionUuid
      ]


-- | Construct a value of type 'MainCollection' (by applying it's required fields, if any)
mkMainCollection
  :: MainCollection
mkMainCollection =
  MainCollection
  { mainCollectionCid = Nothing
  , mainCollectionCreatedAt = Nothing
  , mainCollectionDescription = Nothing
  , mainCollectionName = Nothing
  , mainCollectionUserId = Nothing
  , mainCollectionUuid = Nothing
  }

-- ** MainCreateCollectionBody
-- | MainCreateCollectionBody
data MainCreateCollectionBody = MainCreateCollectionBody
  { mainCreateCollectionBodyDescription :: !(Maybe Text) -- ^ "description"
  , mainCreateCollectionBodyName :: !(Maybe Text) -- ^ "name"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MainCreateCollectionBody
instance A.FromJSON MainCreateCollectionBody where
  parseJSON = A.withObject "MainCreateCollectionBody" $ \o ->
    MainCreateCollectionBody
      <$> (o .:? "description")
      <*> (o .:? "name")

-- | ToJSON MainCreateCollectionBody
instance A.ToJSON MainCreateCollectionBody where
  toJSON MainCreateCollectionBody {..} =
   _omitNulls
      [ "description" .= mainCreateCollectionBodyDescription
      , "name" .= mainCreateCollectionBodyName
      ]


-- | Construct a value of type 'MainCreateCollectionBody' (by applying it's required fields, if any)
mkMainCreateCollectionBody
  :: MainCreateCollectionBody
mkMainCreateCollectionBody =
  MainCreateCollectionBody
  { mainCreateCollectionBodyDescription = Nothing
  , mainCreateCollectionBodyName = Nothing
  }

-- ** MainEstimateDealBody
-- | MainEstimateDealBody
data MainEstimateDealBody = MainEstimateDealBody
  { mainEstimateDealBodyDurationBlks :: !(Maybe Int) -- ^ "durationBlks"
  , mainEstimateDealBodyReplication :: !(Maybe Int) -- ^ "replication"
  , mainEstimateDealBodySize :: !(Maybe Int) -- ^ "size"
  , mainEstimateDealBodyVerified :: !(Maybe Bool) -- ^ "verified"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MainEstimateDealBody
instance A.FromJSON MainEstimateDealBody where
  parseJSON = A.withObject "MainEstimateDealBody" $ \o ->
    MainEstimateDealBody
      <$> (o .:? "durationBlks")
      <*> (o .:? "replication")
      <*> (o .:? "size")
      <*> (o .:? "verified")

-- | ToJSON MainEstimateDealBody
instance A.ToJSON MainEstimateDealBody where
  toJSON MainEstimateDealBody {..} =
   _omitNulls
      [ "durationBlks" .= mainEstimateDealBodyDurationBlks
      , "replication" .= mainEstimateDealBodyReplication
      , "size" .= mainEstimateDealBodySize
      , "verified" .= mainEstimateDealBodyVerified
      ]


-- | Construct a value of type 'MainEstimateDealBody' (by applying it's required fields, if any)
mkMainEstimateDealBody
  :: MainEstimateDealBody
mkMainEstimateDealBody =
  MainEstimateDealBody
  { mainEstimateDealBodyDurationBlks = Nothing
  , mainEstimateDealBodyReplication = Nothing
  , mainEstimateDealBodySize = Nothing
  , mainEstimateDealBodyVerified = Nothing
  }

-- ** MainGetApiKeysResp
-- | MainGetApiKeysResp
data MainGetApiKeysResp = MainGetApiKeysResp
  { mainGetApiKeysRespExpiry :: !(Maybe Text) -- ^ "expiry"
  , mainGetApiKeysRespToken :: !(Maybe Text) -- ^ "token"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MainGetApiKeysResp
instance A.FromJSON MainGetApiKeysResp where
  parseJSON = A.withObject "MainGetApiKeysResp" $ \o ->
    MainGetApiKeysResp
      <$> (o .:? "expiry")
      <*> (o .:? "token")

-- | ToJSON MainGetApiKeysResp
instance A.ToJSON MainGetApiKeysResp where
  toJSON MainGetApiKeysResp {..} =
   _omitNulls
      [ "expiry" .= mainGetApiKeysRespExpiry
      , "token" .= mainGetApiKeysRespToken
      ]


-- | Construct a value of type 'MainGetApiKeysResp' (by applying it's required fields, if any)
mkMainGetApiKeysResp
  :: MainGetApiKeysResp
mkMainGetApiKeysResp =
  MainGetApiKeysResp
  { mainGetApiKeysRespExpiry = Nothing
  , mainGetApiKeysRespToken = Nothing
  }

-- ** MainImportDealBody
-- | MainImportDealBody
data MainImportDealBody = MainImportDealBody
  { mainImportDealBodyColuuid :: !(Maybe Text) -- ^ "coluuid"
  , mainImportDealBodyDealIDs :: !(Maybe [Int]) -- ^ "dealIDs"
  , mainImportDealBodyDir :: !(Maybe Text) -- ^ "dir"
  , mainImportDealBodyName :: !(Maybe Text) -- ^ "name"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MainImportDealBody
instance A.FromJSON MainImportDealBody where
  parseJSON = A.withObject "MainImportDealBody" $ \o ->
    MainImportDealBody
      <$> (o .:? "coluuid")
      <*> (o .:? "dealIDs")
      <*> (o .:? "dir")
      <*> (o .:? "name")

-- | ToJSON MainImportDealBody
instance A.ToJSON MainImportDealBody where
  toJSON MainImportDealBody {..} =
   _omitNulls
      [ "coluuid" .= mainImportDealBodyColuuid
      , "dealIDs" .= mainImportDealBodyDealIDs
      , "dir" .= mainImportDealBodyDir
      , "name" .= mainImportDealBodyName
      ]


-- | Construct a value of type 'MainImportDealBody' (by applying it's required fields, if any)
mkMainImportDealBody
  :: MainImportDealBody
mkMainImportDealBody =
  MainImportDealBody
  { mainImportDealBodyColuuid = Nothing
  , mainImportDealBodyDealIDs = Nothing
  , mainImportDealBodyDir = Nothing
  , mainImportDealBodyName = Nothing
  }

-- ** MainUserStatsResponse
-- | MainUserStatsResponse
data MainUserStatsResponse = MainUserStatsResponse
  { mainUserStatsResponseNumPins :: !(Maybe Int) -- ^ "numPins"
  , mainUserStatsResponseTotalSize :: !(Maybe Int) -- ^ "totalSize"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MainUserStatsResponse
instance A.FromJSON MainUserStatsResponse where
  parseJSON = A.withObject "MainUserStatsResponse" $ \o ->
    MainUserStatsResponse
      <$> (o .:? "numPins")
      <*> (o .:? "totalSize")

-- | ToJSON MainUserStatsResponse
instance A.ToJSON MainUserStatsResponse where
  toJSON MainUserStatsResponse {..} =
   _omitNulls
      [ "numPins" .= mainUserStatsResponseNumPins
      , "totalSize" .= mainUserStatsResponseTotalSize
      ]


-- | Construct a value of type 'MainUserStatsResponse' (by applying it's required fields, if any)
mkMainUserStatsResponse
  :: MainUserStatsResponse
mkMainUserStatsResponse =
  MainUserStatsResponse
  { mainUserStatsResponseNumPins = Nothing
  , mainUserStatsResponseTotalSize = Nothing
  }

-- ** UtilContentAddIpfsBody
-- | UtilContentAddIpfsBody
data UtilContentAddIpfsBody = UtilContentAddIpfsBody
  { utilContentAddIpfsBodyColuuid :: !(Maybe Text) -- ^ "coluuid"
  , utilContentAddIpfsBodyDir :: !(Maybe Text) -- ^ "dir"
  , utilContentAddIpfsBodyFilename :: !(Maybe Text) -- ^ "filename"
  , utilContentAddIpfsBodyPeers :: !(Maybe [Text]) -- ^ "peers"
  , utilContentAddIpfsBodyRoot :: !(Maybe Text) -- ^ "root"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON UtilContentAddIpfsBody
instance A.FromJSON UtilContentAddIpfsBody where
  parseJSON = A.withObject "UtilContentAddIpfsBody" $ \o ->
    UtilContentAddIpfsBody
      <$> (o .:? "coluuid")
      <*> (o .:? "dir")
      <*> (o .:? "filename")
      <*> (o .:? "peers")
      <*> (o .:? "root")

-- | ToJSON UtilContentAddIpfsBody
instance A.ToJSON UtilContentAddIpfsBody where
  toJSON UtilContentAddIpfsBody {..} =
   _omitNulls
      [ "coluuid" .= utilContentAddIpfsBodyColuuid
      , "dir" .= utilContentAddIpfsBodyDir
      , "filename" .= utilContentAddIpfsBodyFilename
      , "peers" .= utilContentAddIpfsBodyPeers
      , "root" .= utilContentAddIpfsBodyRoot
      ]


-- | Construct a value of type 'UtilContentAddIpfsBody' (by applying it's required fields, if any)
mkUtilContentAddIpfsBody
  :: UtilContentAddIpfsBody
mkUtilContentAddIpfsBody =
  UtilContentAddIpfsBody
  { utilContentAddIpfsBodyColuuid = Nothing
  , utilContentAddIpfsBodyDir = Nothing
  , utilContentAddIpfsBodyFilename = Nothing
  , utilContentAddIpfsBodyPeers = Nothing
  , utilContentAddIpfsBodyRoot = Nothing
  }

-- ** UtilContentAddResponse
-- | UtilContentAddResponse
data UtilContentAddResponse = UtilContentAddResponse
  { utilContentAddResponseCid :: !(Maybe Text) -- ^ "cid"
  , utilContentAddResponseEstuaryId :: !(Maybe Int) -- ^ "estuaryId"
  , utilContentAddResponseProviders :: !(Maybe [Text]) -- ^ "providers"
  , utilContentAddResponseRetrievalUrl :: !(Maybe Text) -- ^ "retrieval_url"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON UtilContentAddResponse
instance A.FromJSON UtilContentAddResponse where
  parseJSON = A.withObject "UtilContentAddResponse" $ \o ->
    UtilContentAddResponse
      <$> (o .:? "cid")
      <*> (o .:? "estuaryId")
      <*> (o .:? "providers")
      <*> (o .:? "retrieval_url")

-- | ToJSON UtilContentAddResponse
instance A.ToJSON UtilContentAddResponse where
  toJSON UtilContentAddResponse {..} =
   _omitNulls
      [ "cid" .= utilContentAddResponseCid
      , "estuaryId" .= utilContentAddResponseEstuaryId
      , "providers" .= utilContentAddResponseProviders
      , "retrieval_url" .= utilContentAddResponseRetrievalUrl
      ]


-- | Construct a value of type 'UtilContentAddResponse' (by applying it's required fields, if any)
mkUtilContentAddResponse
  :: UtilContentAddResponse
mkUtilContentAddResponse =
  UtilContentAddResponse
  { utilContentAddResponseCid = Nothing
  , utilContentAddResponseEstuaryId = Nothing
  , utilContentAddResponseProviders = Nothing
  , utilContentAddResponseRetrievalUrl = Nothing
  }

-- ** UtilHttpError
-- | UtilHttpError
data UtilHttpError = UtilHttpError
  { utilHttpErrorCode :: !(Maybe Int) -- ^ "code"
  , utilHttpErrorDetails :: !(Maybe Text) -- ^ "details"
  , utilHttpErrorReason :: !(Maybe Text) -- ^ "reason"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON UtilHttpError
instance A.FromJSON UtilHttpError where
  parseJSON = A.withObject "UtilHttpError" $ \o ->
    UtilHttpError
      <$> (o .:? "code")
      <*> (o .:? "details")
      <*> (o .:? "reason")

-- | ToJSON UtilHttpError
instance A.ToJSON UtilHttpError where
  toJSON UtilHttpError {..} =
   _omitNulls
      [ "code" .= utilHttpErrorCode
      , "details" .= utilHttpErrorDetails
      , "reason" .= utilHttpErrorReason
      ]


-- | Construct a value of type 'UtilHttpError' (by applying it's required fields, if any)
mkUtilHttpError
  :: UtilHttpError
mkUtilHttpError =
  UtilHttpError
  { utilHttpErrorCode = Nothing
  , utilHttpErrorDetails = Nothing
  , utilHttpErrorReason = Nothing
  }




-- * Auth Methods

-- ** AuthApiKeyBearerAuth
data AuthApiKeyBearerAuth =
  AuthApiKeyBearerAuth Text -- ^ secret
  deriving (P.Eq, P.Show, P.Typeable)

instance AuthMethod AuthApiKeyBearerAuth where
  applyAuthMethod _ a@(AuthApiKeyBearerAuth secret) req =
    P.pure $
    if (P.typeOf a `P.elem` rAuthTypes req)
      then req `setHeader` toHeader ("Authorization", secret)
           & L.over rAuthTypesL (P.filter (/= P.typeOf a))
      else req

