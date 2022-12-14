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

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing MinerApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class MinerApiTests
    {
        private MinerApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new MinerApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of MinerApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' MinerApi
            //Assert.IsInstanceOfType(typeof(MinerApi), instance, "instance is a MinerApi");
        }

        
        /// <summary>
        /// Test PublicMinersDealsMinerGet
        /// </summary>
        [Test]
        public void PublicMinersDealsMinerGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string miner = null;
            //instance.PublicMinersDealsMinerGet(miner);
            
        }
        
        /// <summary>
        /// Test PublicMinersStatsMinerGet
        /// </summary>
        [Test]
        public void PublicMinersStatsMinerGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string miner = null;
            //instance.PublicMinersStatsMinerGet(miner);
            
        }
        
    }

}
