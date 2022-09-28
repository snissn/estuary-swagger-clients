package io.swagger.server.model


/**
 * @param expiry 
 * @param token 
 */
case class Main.getApiKeysResp (
  expiry: Option[String],
  token: Option[String]
)

