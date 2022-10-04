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
    ///  Class for testing CollectionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CollectionsApiTests
    {
        private CollectionsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CollectionsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CollectionsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CollectionsApi
            //Assert.IsInstanceOfType(typeof(CollectionsApi), instance, "instance is a CollectionsApi");
        }

        
        /// <summary>
        /// Test CollectionsColuuidCommitPost
        /// </summary>
        [Test]
        public void CollectionsColuuidCommitPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string coluuid = null;
            //var response = instance.CollectionsColuuidCommitPost(coluuid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test CollectionsColuuidContentsDelete
        /// </summary>
        [Test]
        public void CollectionsColuuidContentsDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string coluuid = null;
            //string contentid = null;
            //MainDeleteContentFromCollectionBody body = null;
            //var response = instance.CollectionsColuuidContentsDelete(coluuid, contentid, body);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test CollectionsColuuidDelete
        /// </summary>
        [Test]
        public void CollectionsColuuidDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string coluuid = null;
            //instance.CollectionsColuuidDelete(coluuid);
            
        }
        
        /// <summary>
        /// Test CollectionsColuuidGet
        /// </summary>
        [Test]
        public void CollectionsColuuidGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string coluuid = null;
            //string dir = null;
            //var response = instance.CollectionsColuuidGet(coluuid, dir);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test CollectionsColuuidPost
        /// </summary>
        [Test]
        public void CollectionsColuuidPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<int?> body = null;
            //var response = instance.CollectionsColuuidPost(body);
            //Assert.IsInstanceOf<Dictionary<string, string>> (response, "response is Dictionary<string, string>");
        }
        
        /// <summary>
        /// Test CollectionsFsAddPost
        /// </summary>
        [Test]
        public void CollectionsFsAddPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string coluuid = null;
            //string content = null;
            //string path = null;
            //instance.CollectionsFsAddPost(coluuid, content, path);
            
        }
        
        /// <summary>
        /// Test CollectionsGet
        /// </summary>
        [Test]
        public void CollectionsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CollectionsGet();
            //Assert.IsInstanceOf<List<CollectionsCollection>> (response, "response is List<CollectionsCollection>");
        }
        
        /// <summary>
        /// Test CollectionsPost
        /// </summary>
        [Test]
        public void CollectionsPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //MainCreateCollectionBody body = null;
            //var response = instance.CollectionsPost(body);
            //Assert.IsInstanceOf<CollectionsCollection> (response, "response is CollectionsCollection");
        }
        
    }

}
