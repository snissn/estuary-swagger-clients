# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MainCreateCollectionBody Class
#'
#' @field description 
#' @field name 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MainCreateCollectionBody <- R6::R6Class(
  'MainCreateCollectionBody',
  public = list(
    `description` = NULL,
    `name` = NULL,
    initialize = function(`description`, `name`){
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
    },
    toJSON = function() {
      MainCreateCollectionBodyObject <- list()
      if (!is.null(self$`description`)) {
        MainCreateCollectionBodyObject[['description']] <- self$`description`
      }
      if (!is.null(self$`name`)) {
        MainCreateCollectionBodyObject[['name']] <- self$`name`
      }

      MainCreateCollectionBodyObject
    },
    fromJSON = function(MainCreateCollectionBodyJson) {
      MainCreateCollectionBodyObject <- jsonlite::fromJSON(MainCreateCollectionBodyJson)
      if (!is.null(MainCreateCollectionBodyObject$`description`)) {
        self$`description` <- MainCreateCollectionBodyObject$`description`
      }
      if (!is.null(MainCreateCollectionBodyObject$`name`)) {
        self$`name` <- MainCreateCollectionBodyObject$`name`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "description": %s,
           "name": %s
        }',
        self$`description`,
        self$`name`
      )
    },
    fromJSONString = function(MainCreateCollectionBodyJson) {
      MainCreateCollectionBodyObject <- jsonlite::fromJSON(MainCreateCollectionBodyJson)
      self$`description` <- MainCreateCollectionBodyObject$`description`
      self$`name` <- MainCreateCollectionBodyObject$`name`
    }
  )
)
