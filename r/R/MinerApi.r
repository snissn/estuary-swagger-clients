# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git
#' @title Miner operations
#' @description swagger.Miner
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#' @field userAgent Set the user agent of the request.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' public_miners_deals_miner_get Get all miners deals
#'
#'
#' public_miners_stats_miner_get Get miner stats
#'
#' }
#'
#' @export
MinerApi <- R6::R6Class(
  'MinerApi',
  public = list(
    userAgent = "Swagger-Codegen/1.0.0/r",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    public_miners_deals_miner_get = function(miner, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/public/miners/deals/{miner}"
      if (!missing(`miner`)) {
        urlPath <- gsub(paste0("\\{", "miner", "\\}"), `miner`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
    public_miners_stats_miner_get = function(miner, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/public/miners/stats/{miner}"
      if (!missing(`miner`)) {
        urlPath <- gsub(paste0("\\{", "miner", "\\}"), `miner`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
  )
)
