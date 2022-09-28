=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

module SwaggerClient
  class PinningApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # List all pin status objects
    # This endpoint lists all pin status objects
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def pinning_pins_get(opts = {})
      pinning_pins_get_with_http_info(opts)
      nil
    end

    # List all pin status objects
    # This endpoint lists all pin status objects
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def pinning_pins_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PinningApi.pinning_pins_get ...'
      end
      # resource path
      local_var_path = '/pinning/pins'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PinningApi#pinning_pins_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a pinned object
    # This endpoint deletes a pinned object.
    # @param pinid Pin ID
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def pinning_pins_pinid_delete(pinid, opts = {})
      pinning_pins_pinid_delete_with_http_info(pinid, opts)
      nil
    end

    # Delete a pinned object
    # This endpoint deletes a pinned object.
    # @param pinid Pin ID
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def pinning_pins_pinid_delete_with_http_info(pinid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PinningApi.pinning_pins_pinid_delete ...'
      end
      # verify the required parameter 'pinid' is set
      if @api_client.config.client_side_validation && pinid.nil?
        fail ArgumentError, "Missing the required parameter 'pinid' when calling PinningApi.pinning_pins_pinid_delete"
      end
      # resource path
      local_var_path = '/pinning/pins/{pinid}'.sub('{' + 'pinid' + '}', pinid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PinningApi#pinning_pins_pinid_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get a pin status object
    # This endpoint returns a pin status object.
    # @param pinid cid
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def pinning_pins_pinid_get(pinid, opts = {})
      pinning_pins_pinid_get_with_http_info(pinid, opts)
      nil
    end

    # Get a pin status object
    # This endpoint returns a pin status object.
    # @param pinid cid
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def pinning_pins_pinid_get_with_http_info(pinid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PinningApi.pinning_pins_pinid_get ...'
      end
      # verify the required parameter 'pinid' is set
      if @api_client.config.client_side_validation && pinid.nil?
        fail ArgumentError, "Missing the required parameter 'pinid' when calling PinningApi.pinning_pins_pinid_get"
      end
      # resource path
      local_var_path = '/pinning/pins/{pinid}'.sub('{' + 'pinid' + '}', pinid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PinningApi#pinning_pins_pinid_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Replace a pinned object
    # This endpoint replaces a pinned object.
    # @param pinid Pin ID
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def pinning_pins_pinid_post(pinid, opts = {})
      pinning_pins_pinid_post_with_http_info(pinid, opts)
      nil
    end

    # Replace a pinned object
    # This endpoint replaces a pinned object.
    # @param pinid Pin ID
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def pinning_pins_pinid_post_with_http_info(pinid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PinningApi.pinning_pins_pinid_post ...'
      end
      # verify the required parameter 'pinid' is set
      if @api_client.config.client_side_validation && pinid.nil?
        fail ArgumentError, "Missing the required parameter 'pinid' when calling PinningApi.pinning_pins_pinid_post"
      end
      # resource path
      local_var_path = '/pinning/pins/{pinid}'.sub('{' + 'pinid' + '}', pinid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PinningApi#pinning_pins_pinid_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Add and pin object
    # This endpoint adds a pin to the IPFS daemon.
    # @param cid cid
    # @param name name
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def pinning_pins_post(cid, name, opts = {})
      pinning_pins_post_with_http_info(cid, name, opts)
      nil
    end

    # Add and pin object
    # This endpoint adds a pin to the IPFS daemon.
    # @param cid cid
    # @param name name
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def pinning_pins_post_with_http_info(cid, name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PinningApi.pinning_pins_post ...'
      end
      # verify the required parameter 'cid' is set
      if @api_client.config.client_side_validation && cid.nil?
        fail ArgumentError, "Missing the required parameter 'cid' when calling PinningApi.pinning_pins_post"
      end
      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling PinningApi.pinning_pins_post"
      end
      # resource path
      local_var_path = '/pinning/pins'.sub('{' + 'cid' + '}', cid.to_s).sub('{' + 'name' + '}', name.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PinningApi#pinning_pins_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
