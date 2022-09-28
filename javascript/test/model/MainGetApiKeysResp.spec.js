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

  describe('(package)', function() {
    describe('MainGetApiKeysResp', function() {
      beforeEach(function() {
        instance = new EstuaryApi.MainGetApiKeysResp();
      });

      it('should create an instance of MainGetApiKeysResp', function() {
        // TODO: update the code to test MainGetApiKeysResp
        expect(instance).to.be.a(EstuaryApi.MainGetApiKeysResp);
      });

      it('should have the property expiry (base name: "expiry")', function() {
        // TODO: update the code to test the property expiry
        expect(instance).to.have.property('expiry');
        // expect(instance.expiry).to.be(expectedValueLiteral);
      });

      it('should have the property token (base name: "token")', function() {
        // TODO: update the code to test the property token
        expect(instance).to.have.property('token');
        // expect(instance.token).to.be(expectedValueLiteral);
      });

    });
  });

}));
