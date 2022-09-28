/**
* Estuary API
* This is the API for the Estuary application.
*
* OpenAPI spec version: 0.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.locations.put
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.route

import io.swagger.server.Paths
import io.swagger.server.infrastructure.ApiPrincipal



@KtorExperimentalLocationsAPI
fun Route.NetApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    get<Paths.netAddrsGet> {  _: Paths.netAddrsGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """[ "", "" ]"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    get<Paths.publicMinersFailuresMinerGet> {  _: Paths.publicMinersFailuresMinerGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    get<Paths.publicMinersGet> {  _: Paths.publicMinersGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    get<Paths.publicNetAddrsGet> {  _: Paths.publicNetAddrsGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """[ "", "" ]"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    get<Paths.publicNetPeersGet> {  _: Paths.publicNetPeersGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """[ "", "" ]"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
}
