/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.28
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.EstuaryApi);
  }
}(this, function(expect, EstuaryApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new EstuaryApi.DealsApi();
  });

  describe('(package)', function() {
    describe('DealsApi', function() {
      describe('dealEstimatePost', function() {
        it('should call dealEstimatePost successfully', function(done) {
          // TODO: uncomment, update parameter values for dealEstimatePost call
          /*
          var body = new EstuaryApi.MainEstimateDealBody();
          body.durationBlks = 0;
          body.replication = 0;
          body.size = 0;
          body.verified = false;

          instance.dealEstimatePost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealInfoDealidGet', function() {
        it('should call dealInfoDealidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealInfoDealidGet call
          /*
          var dealid = 56;

          instance.dealInfoDealidGet(dealid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealProposalPropcidGet', function() {
        it('should call dealProposalPropcidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealProposalPropcidGet call
          /*
          var propcid = "propcid_example";

          instance.dealProposalPropcidGet(propcid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealQueryMinerGet', function() {
        it('should call dealQueryMinerGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealQueryMinerGet call
          /*
          var miner = "miner_example";

          instance.dealQueryMinerGet(miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealStatusByProposalPropcidGet', function() {
        it('should call dealStatusByProposalPropcidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealStatusByProposalPropcidGet call
          /*
          var propcid = "propcid_example";

          instance.dealStatusByProposalPropcidGet(propcid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealStatusMinerPropcidGet', function() {
        it('should call dealStatusMinerPropcidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealStatusMinerPropcidGet call
          /*
          var miner = "miner_example";
          var propcid = "propcid_example";

          instance.dealStatusMinerPropcidGet(miner, propcid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealTransferInProgressGet', function() {
        it('should call dealTransferInProgressGet successfully', function(done) {
          // TODO: uncomment dealTransferInProgressGet call
          /*

          instance.dealTransferInProgressGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealTransferStatusPost', function() {
        it('should call dealTransferStatusPost successfully', function(done) {
          // TODO: uncomment dealTransferStatusPost call
          /*

          instance.dealTransferStatusPost(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealsFailuresGet', function() {
        it('should call dealsFailuresGet successfully', function(done) {
          // TODO: uncomment dealsFailuresGet call
          /*

          instance.dealsFailuresGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealsMakeMinerPost', function() {
        it('should call dealsMakeMinerPost successfully', function(done) {
          // TODO: uncomment, update parameter values for dealsMakeMinerPost call
          /*
          var miner = "miner_example";
          var dealRequest = "dealRequest_example";

          instance.dealsMakeMinerPost(miner, dealRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealsStatusDealGet', function() {
        it('should call dealsStatusDealGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealsStatusDealGet call
          /*
          var deal = 56;

          instance.dealsStatusDealGet(deal, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('publicDealsFailuresGet', function() {
        it('should call publicDealsFailuresGet successfully', function(done) {
          // TODO: uncomment publicDealsFailuresGet call
          /*

          instance.publicDealsFailuresGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('publicMinersStorageQueryMinerGet', function() {
        it('should call publicMinersStorageQueryMinerGet successfully', function(done) {
          // TODO: uncomment, update parameter values for publicMinersStorageQueryMinerGet call
          /*
          var miner = "miner_example";

          instance.publicMinersStorageQueryMinerGet(miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
