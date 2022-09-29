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
*/
package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.basicAuthentication
import io.ktor.auth.oauth
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.*
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

import kotlinx.coroutines.experimental.asCoroutineDispatcher

import io.swagger.server.ApplicationAuthProviders
import io.swagger.server.Paths
import io.swagger.server.ApplicationExecutors
import io.swagger.server.HTTP.client
import io.swagger.server.infrastructure.ApiPrincipal
import io.swagger.server.infrastructure.apiKeyAuth

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288
import io.swagger.server.delete


fun Route.PeersApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    delete<Paths.adminPeeringPeersDelete> {  it: Paths.adminPeeringPeersDelete ->
        val principal = call.authentication.principal<ApiPrincipal>()
        
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    .apply {
      // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
      //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

        try {
            authentication {
                // "Implement API key auth (bearerAuth) for parameter name 'Authorization'."
                apiKeyAuth("Authorization", "header") {
                    // TODO: "Verify key here , accessible as it.value"
                    if (it.value == "keyboardcat") {
                         ApiPrincipal(it)
                    } else {
                        null
                    }
                }
            }
        } catch(e: io.ktor.application.DuplicateApplicationFeatureException){
            application.environment.log.warn("authentication block for '/admin/peering/peers' is duplicated in code. " +
            "Generated endpoints may need to be merged under a 'route' entry.")
        }
    }

    get<Paths.adminPeeringPeersGet> {  it: Paths.adminPeeringPeersGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    .apply {
      // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
      //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

        try {
            authentication {
                // "Implement API key auth (bearerAuth) for parameter name 'Authorization'."
                apiKeyAuth("Authorization", "header") {
                    // TODO: "Verify key here , accessible as it.value"
                    if (it.value == "keyboardcat") {
                         ApiPrincipal(it)
                    } else {
                        null
                    }
                }
            }
        } catch(e: io.ktor.application.DuplicateApplicationFeatureException){
            application.environment.log.warn("authentication block for '/admin/peering/peers' is duplicated in code. " +
            "Generated endpoints may need to be merged under a 'route' entry.")
        }
    }

    route("/admin/peering/peers") {
        post {
            val principal = call.authentication.principal<ApiPrincipal>()
            
            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
            }
        }
    }
    .apply {
      // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
      //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

        try {
            authentication {
                // "Implement API key auth (bearerAuth) for parameter name 'Authorization'."
                apiKeyAuth("Authorization", "header") {
                    // TODO: "Verify key here , accessible as it.value"
                    if (it.value == "keyboardcat") {
                         ApiPrincipal(it)
                    } else {
                        null
                    }
                }
            }
        } catch(e: io.ktor.application.DuplicateApplicationFeatureException){
            application.environment.log.warn("authentication block for '/admin/peering/peers' is duplicated in code. " +
            "Generated endpoints may need to be merged under a 'route' entry.")
        }
    }

    route("/admin/peering/start") {
        post {
            val principal = call.authentication.principal<ApiPrincipal>()
            
            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
            }
        }
    }
    .apply {
      // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
      //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

        try {
            authentication {
                // "Implement API key auth (bearerAuth) for parameter name 'Authorization'."
                apiKeyAuth("Authorization", "header") {
                    // TODO: "Verify key here , accessible as it.value"
                    if (it.value == "keyboardcat") {
                         ApiPrincipal(it)
                    } else {
                        null
                    }
                }
            }
        } catch(e: io.ktor.application.DuplicateApplicationFeatureException){
            application.environment.log.warn("authentication block for '/admin/peering/start' is duplicated in code. " +
            "Generated endpoints may need to be merged under a 'route' entry.")
        }
    }

    get<Paths.adminPeeringStatusGet> {  it: Paths.adminPeeringStatusGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    .apply {
      // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
      //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

        try {
            authentication {
                // "Implement API key auth (bearerAuth) for parameter name 'Authorization'."
                apiKeyAuth("Authorization", "header") {
                    // TODO: "Verify key here , accessible as it.value"
                    if (it.value == "keyboardcat") {
                         ApiPrincipal(it)
                    } else {
                        null
                    }
                }
            }
        } catch(e: io.ktor.application.DuplicateApplicationFeatureException){
            application.environment.log.warn("authentication block for '/admin/peering/status' is duplicated in code. " +
            "Generated endpoints may need to be merged under a 'route' entry.")
        }
    }

    route("/admin/peering/stop") {
        post {
            val principal = call.authentication.principal<ApiPrincipal>()
            
            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
            }
        }
    }
    .apply {
      // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
      //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

        try {
            authentication {
                // "Implement API key auth (bearerAuth) for parameter name 'Authorization'."
                apiKeyAuth("Authorization", "header") {
                    // TODO: "Verify key here , accessible as it.value"
                    if (it.value == "keyboardcat") {
                         ApiPrincipal(it)
                    } else {
                        null
                    }
                }
            }
        } catch(e: io.ktor.application.DuplicateApplicationFeatureException){
            application.environment.log.warn("authentication block for '/admin/peering/stop' is duplicated in code. " +
            "Generated endpoints may need to be merged under a 'route' entry.")
        }
    }
}
