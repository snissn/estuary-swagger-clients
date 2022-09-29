/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using IO.Swagger.Attributes;
using IO.Swagger.Security;
using Microsoft.AspNetCore.Authorization;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class PinningApiController : ControllerBase
    { 
        /// <summary>
        /// List all pin status objects
        /// </summary>
        /// <remarks>This endpoint lists all pin status objects</remarks>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//pinning/pins")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsGet")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 404, type: typeof(UtilHttpError), description: "Not Found")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult PinningPinsGet()
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));


            throw new NotImplementedException();
        }

        /// <summary>
        /// Delete a pinned object
        /// </summary>
        /// <remarks>This endpoint deletes a pinned object.</remarks>
        /// <param name="pinid">Pin ID</param>
        [HttpDelete]
        [Route("//pinning/pins/{pinid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPinidDelete")]
        public virtual IActionResult PinningPinsPinidDelete([FromRoute][Required]string pinid)
        { 

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get a pin status object
        /// </summary>
        /// <remarks>This endpoint returns a pin status object.</remarks>
        /// <param name="pinid">cid</param>
        [HttpGet]
        [Route("//pinning/pins/{pinid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPinidGet")]
        public virtual IActionResult PinningPinsPinidGet([FromRoute][Required]string pinid)
        { 

            throw new NotImplementedException();
        }

        /// <summary>
        /// Replace a pinned object
        /// </summary>
        /// <remarks>This endpoint replaces a pinned object.</remarks>
        /// <param name="pinid">Pin ID</param>
        [HttpPost]
        [Route("//pinning/pins/{pinid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPinidPost")]
        public virtual IActionResult PinningPinsPinidPost([FromRoute][Required]string pinid)
        { 

            throw new NotImplementedException();
        }

        /// <summary>
        /// Add and pin object
        /// </summary>
        /// <remarks>This endpoint adds a pin to the IPFS daemon.</remarks>
        /// <param name="cid">cid</param>
        /// <param name="name">name</param>
        [HttpPost]
        [Route("//pinning/pins")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPost")]
        public virtual IActionResult PinningPinsPost([FromRoute][Required]string cid, [FromRoute][Required]string name)
        { 

            throw new NotImplementedException();
        }
    }
}
