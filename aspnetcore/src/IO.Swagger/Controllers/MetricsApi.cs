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
    public class MetricsApiController : ControllerBase
    { 
        /// <summary>
        /// Get deal metrics
        /// </summary>
        /// <remarks>This endpoint is used to get deal metrics</remarks>
        [HttpGet]
        [Route("//api.estuary.tech//public/metrics/deals-on-chain")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PublicMetricsDealsOnChainGet")]
        public virtual IActionResult PublicMetricsDealsOnChainGet()
        { 
            throw new NotImplementedException();
        }
    }
}
