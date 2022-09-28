=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

module SwaggerClient
  class PeeringApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Remove peers on Peering Service
    # This endpoint can be used to remove a Peer from the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def admin_peering_peers_delete(opts = {})
      admin_peering_peers_delete_with_http_info(opts)
      nil
    end

    # Remove peers on Peering Service
    # This endpoint can be used to remove a Peer from the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def admin_peering_peers_delete_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PeeringApi.admin_peering_peers_delete ...'
      end
      # resource path
      local_var_path = '/admin/peering/peers'

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
        @api_client.config.logger.debug "API called: PeeringApi#admin_peering_peers_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all Peering peers
    # This endpoint can be used to list all peers on Peering Service
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def admin_peering_peers_get(opts = {})
      admin_peering_peers_get_with_http_info(opts)
      nil
    end

    # List all Peering peers
    # This endpoint can be used to list all peers on Peering Service
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def admin_peering_peers_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PeeringApi.admin_peering_peers_get ...'
      end
      # resource path
      local_var_path = '/admin/peering/peers'

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
        @api_client.config.logger.debug "API called: PeeringApi#admin_peering_peers_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Add peers on Peering Service
    # This endpoint can be used to add a Peer from the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def admin_peering_peers_post(opts = {})
      admin_peering_peers_post_with_http_info(opts)
      nil
    end

    # Add peers on Peering Service
    # This endpoint can be used to add a Peer from the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def admin_peering_peers_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PeeringApi.admin_peering_peers_post ...'
      end
      # resource path
      local_var_path = '/admin/peering/peers'

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
        @api_client.config.logger.debug "API called: PeeringApi#admin_peering_peers_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Start Peering
    # This endpoint can be used to start the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def admin_peering_start_post(opts = {})
      admin_peering_start_post_with_http_info(opts)
      nil
    end

    # Start Peering
    # This endpoint can be used to start the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def admin_peering_start_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PeeringApi.admin_peering_start_post ...'
      end
      # resource path
      local_var_path = '/admin/peering/start'

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
        @api_client.config.logger.debug "API called: PeeringApi#admin_peering_start_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Check Peering Status
    # This endpoint can be used to check the Peering status
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def admin_peering_status_get(opts = {})
      admin_peering_status_get_with_http_info(opts)
      nil
    end

    # Check Peering Status
    # This endpoint can be used to check the Peering status
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def admin_peering_status_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PeeringApi.admin_peering_status_get ...'
      end
      # resource path
      local_var_path = '/admin/peering/status'

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
        @api_client.config.logger.debug "API called: PeeringApi#admin_peering_status_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Stop Peering
    # This endpoint can be used to stop the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def admin_peering_stop_post(opts = {})
      admin_peering_stop_post_with_http_info(opts)
      nil
    end

    # Stop Peering
    # This endpoint can be used to stop the Peering Service
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def admin_peering_stop_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PeeringApi.admin_peering_stop_post ...'
      end
      # resource path
      local_var_path = '/admin/peering/stop'

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
        @api_client.config.logger.debug "API called: PeeringApi#admin_peering_stop_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
