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
    public class NetApiController : ControllerBase
    { 
        /// <summary>
        /// Net Addrs
        /// </summary>
        /// <remarks>This endpoint is used to get net addrs</remarks>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("//net/addrs")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("NetAddrsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<string>), description: "OK")]
        public virtual IActionResult NetAddrsGet()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<string>));

            string exampleJson = null;
            exampleJson = "{}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<string>>(exampleJson)
            : default(List<string>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all miners
        /// </summary>
        /// <remarks>This endpoint returns all miners</remarks>
        /// <param name="miner">Filter by miner</param>
        [HttpGet]
        [Route("//public/miners/failures/{miner}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PublicMinersFailuresMinerGet")]
        public virtual IActionResult PublicMinersFailuresMinerGet([FromRoute][Required]string miner)
        { 

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get all miners
        /// </summary>
        /// <remarks>This endpoint returns all miners</remarks>
        [HttpGet]
        [Route("//public/miners")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PublicMinersGet")]
        public virtual IActionResult PublicMinersGet()
        { 

            throw new NotImplementedException();
        }

        /// <summary>
        /// Net Addrs
        /// </summary>
        /// <remarks>This endpoint is used to get net addrs</remarks>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("//public/net/addrs")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PublicNetAddrsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<string>), description: "OK")]
        public virtual IActionResult PublicNetAddrsGet()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<string>));

            string exampleJson = null;
            exampleJson = "{}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<string>>(exampleJson)
            : default(List<string>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Net Peers
        /// </summary>
        /// <remarks>This endpoint is used to get net peers</remarks>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("//public/net/peers")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PublicNetPeersGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<string>), description: "OK")]
        public virtual IActionResult PublicNetPeersGet()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<string>));

            string exampleJson = null;
            exampleJson = "{}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<string>>(exampleJson)
            : default(List<string>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
