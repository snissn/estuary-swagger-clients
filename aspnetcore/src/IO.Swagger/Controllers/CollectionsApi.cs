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
    public class CollectionsApiController : ControllerBase
    { 
        /// <summary>
        /// Produce a CID of the collection contents
        /// </summary>
        /// <remarks>This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.</remarks>
        /// <param name="coluuid">coluuid</param>
        /// <response code="200">OK</response>
        [HttpPost]
        [Route("//collections/{coluuid}/commit")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsColuuidCommitPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        public virtual IActionResult CollectionsColuuidCommitPost([FromRoute][Required]string coluuid)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));

            string exampleJson = null;
            exampleJson = "{\n  \"bytes\": [],\n  \"empty\": true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Deletes a content from a collection
        /// </summary>
        /// <remarks>This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path</remarks>
        /// <param name="coluuid">Collection ID</param>
        /// <param name="contentid">Content ID</param>
        /// <param name="body">{by: Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;), value: Value of content_id or path to look for}</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        [HttpDelete]
        [Route("//collections/{coluuid}/contents")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsColuuidContentsDelete")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        public virtual IActionResult CollectionsColuuidContentsDelete([FromRoute][Required]string coluuid, [FromRoute][Required]string contentid, [FromBody]MainDeleteContentFromCollectionBody body)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            string exampleJson = null;
            exampleJson = "{\n  \"bytes\": [],\n  \"empty\": true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Deletes a collection
        /// </summary>
        /// <remarks>This endpoint is used to delete an existing collection.</remarks>
        /// <param name="coluuid">Collection ID</param>
        [HttpDelete]
        [Route("//collections/{coluuid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsColuuidDelete")]
        public virtual IActionResult CollectionsColuuidDelete([FromRoute][Required]string coluuid)
        { 

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get contents in a collection
        /// </summary>
        /// <remarks>This endpoint is used to get contents in a collection. If no colpath query param is passed</remarks>
        /// <param name="coluuid">Collection UUID</param>
        /// <param name="dir">Directory</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("//collections/{coluuid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsColuuidGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        public virtual IActionResult CollectionsColuuidGet([FromRoute][Required]string coluuid, [FromQuery]string dir)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));

            string exampleJson = null;
            exampleJson = "{\n  \"bytes\": [],\n  \"empty\": true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Add contents to a collection
        /// </summary>
        /// <remarks>This endpoint adds already-pinned contents (that have ContentIDs) to a collection.</remarks>
        /// <param name="body">Content IDs to add to collection</param>
        /// <response code="200">OK</response>
        [HttpPost]
        [Route("//collections/{coluuid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsColuuidPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(Dictionary<string, string>), description: "OK")]
        public virtual IActionResult CollectionsColuuidPost([FromBody]List<int?> body)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Dictionary<string, string>));

            string exampleJson = null;
            exampleJson = "{\"empty\": false}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Dictionary<string, string>>(exampleJson)
            : default(Dictionary<string, string>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Add a file to a collection
        /// </summary>
        /// <remarks>This endpoint adds a file to a collection</remarks>
        /// <param name="coluuid">Collection ID</param>
        /// <param name="content">Content</param>
        /// <param name="path">Path to file</param>
        [HttpPost]
        [Route("//collections/fs/add")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsFsAddPost")]
        public virtual IActionResult CollectionsFsAddPost([FromQuery][Required()]string coluuid, [FromQuery][Required()]string content, [FromQuery][Required()]string path)
        { 

            throw new NotImplementedException();
        }

        /// <summary>
        /// List all collections
        /// </summary>
        /// <remarks>This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.</remarks>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//collections/")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<CollectionsCollection>), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 404, type: typeof(UtilHttpError), description: "Not Found")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult CollectionsGet()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<CollectionsCollection>));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));

            string exampleJson = null;
            exampleJson = "{}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<CollectionsCollection>>(exampleJson)
            : default(List<CollectionsCollection>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Create a new collection
        /// </summary>
        /// <remarks>This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.</remarks>
        /// <param name="body">Collection name and description</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//collections/")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("CollectionsPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(CollectionsCollection), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 404, type: typeof(UtilHttpError), description: "Not Found")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult CollectionsPost([FromBody]MainCreateCollectionBody body)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CollectionsCollection));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));

            string exampleJson = null;
            exampleJson = "{\"empty\": false}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CollectionsCollection>(exampleJson)
            : default(CollectionsCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
