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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing ContentApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ContentApiTests
    {
        private ContentApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ContentApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ContentApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ContentApi
            //Assert.IsInstanceOfType(typeof(ContentApi), instance, "instance is a ContentApi");
        }

        
        /// <summary>
        /// Test ContentAddCarPost
        /// </summary>
        [Test]
        public void ContentAddCarPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string body = null;
            //string filename = null;
            //string commp = null;
            //string size = null;
            //instance.ContentAddCarPost(body, filename, commp, size);
            
        }
        
        /// <summary>
        /// Test ContentAddIpfsPost
        /// </summary>
        [Test]
        public void ContentAddIpfsPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //UtilContentAddIpfsBody body = null;
            //instance.ContentAddIpfsPost(body);
            
        }
        
        /// <summary>
        /// Test ContentAddPost
        /// </summary>
        [Test]
        public void ContentAddPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream data = null;
            //string coluuid = null;
            //string dir = null;
            //var response = instance.ContentAddPost(data, coluuid, dir);
            //Assert.IsInstanceOf<UtilContentAddResponse> (response, "response is UtilContentAddResponse");
        }
        
        /// <summary>
        /// Test ContentAggregatedContentGet
        /// </summary>
        [Test]
        public void ContentAggregatedContentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string content = null;
            //var response = instance.ContentAggregatedContentGet(content);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test ContentAllDealsGet
        /// </summary>
        [Test]
        public void ContentAllDealsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string begin = null;
            //string duration = null;
            //string all = null;
            //instance.ContentAllDealsGet(begin, duration, all);
            
        }
        
        /// <summary>
        /// Test ContentBwUsageContentGet
        /// </summary>
        [Test]
        public void ContentBwUsageContentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string content = null;
            //instance.ContentBwUsageContentGet(content);
            
        }
        
        /// <summary>
        /// Test ContentCreatePost
        /// </summary>
        [Test]
        public void ContentCreatePostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string body = null;
            //instance.ContentCreatePost(body);
            
        }
        
        /// <summary>
        /// Test ContentDealsGet
        /// </summary>
        [Test]
        public void ContentDealsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? limit = null;
            //int? offset = null;
            //instance.ContentDealsGet(limit, offset);
            
        }
        
        /// <summary>
        /// Test ContentEnsureReplicationDatacidGet
        /// </summary>
        [Test]
        public void ContentEnsureReplicationDatacidGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string datacid = null;
            //instance.ContentEnsureReplicationDatacidGet(datacid);
            
        }
        
        /// <summary>
        /// Test ContentFailuresContentGet
        /// </summary>
        [Test]
        public void ContentFailuresContentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string content = null;
            //var response = instance.ContentFailuresContentGet(content);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test ContentImportdealPost
        /// </summary>
        [Test]
        public void ContentImportdealPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //MainImportDealBody body = null;
            //instance.ContentImportdealPost(body);
            
        }
        
        /// <summary>
        /// Test ContentListGet
        /// </summary>
        [Test]
        public void ContentListGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.ContentListGet();
            //Assert.IsInstanceOf<List<string>> (response, "response is List<string>");
        }
        
        /// <summary>
        /// Test ContentReadContGet
        /// </summary>
        [Test]
        public void ContentReadContGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string cont = null;
            //instance.ContentReadContGet(cont);
            
        }
        
        /// <summary>
        /// Test ContentStagingZonesGet
        /// </summary>
        [Test]
        public void ContentStagingZonesGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.ContentStagingZonesGet();
            
        }
        
        /// <summary>
        /// Test ContentStatsGet
        /// </summary>
        [Test]
        public void ContentStatsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string limit = null;
            //instance.ContentStatsGet(limit);
            
        }
        
        /// <summary>
        /// Test ContentStatusIdGet
        /// </summary>
        [Test]
        public void ContentStatusIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? id = null;
            //instance.ContentStatusIdGet(id);
            
        }
        
    }

}