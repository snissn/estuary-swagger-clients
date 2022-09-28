/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.35
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
    instance = new EstuaryApi.AutoretrieveApi();
  });

  describe('(package)', function() {
    describe('AutoretrieveApi', function() {
      describe('adminAutoretrieveInitPost', function() {
        it('should call adminAutoretrieveInitPost successfully', function(done) {
          // TODO: uncomment, update parameter values for adminAutoretrieveInitPost call
          /*

          instance.adminAutoretrieveInitPost(body, function(error, data, response) {
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
      describe('adminAutoretrieveListGet', function() {
        it('should call adminAutoretrieveListGet successfully', function(done) {
          // TODO: uncomment adminAutoretrieveListGet call
          /*

          instance.adminAutoretrieveListGet(function(error, data, response) {
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
      describe('autoretrieveHeartbeatPost', function() {
        it('should call autoretrieveHeartbeatPost successfully', function(done) {
          // TODO: uncomment, update parameter values for autoretrieveHeartbeatPost call
          /*

          instance.autoretrieveHeartbeatPost(token, function(error, data, response) {
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
