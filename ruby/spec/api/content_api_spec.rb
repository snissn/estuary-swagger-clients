=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.28

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ContentApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ContentApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ContentApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ContentApi' do
    it 'should create an instance of ContentApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ContentApi)
    end
  end

  # unit tests for content_add_car_post
  # Add Car object
  # This endpoint is used to add a car object to the network. The object can be a file or a directory.
  # @param body Car
  # @param [Hash] opts the optional parameters
  # @option opts [String] :filename Filename
  # @option opts [String] :commp Commp
  # @option opts [String] :size Size
  # @return [nil]
  describe 'content_add_car_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_add_ipfs_post
  # Add IPFS object
  # This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
  # @param body IPFS Body
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_add_ipfs_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_add_post
  # Add new content
  # This endpoint is used to upload new content.
  # @param data File to upload
  # @param coluuid Collection UUID
  # @param dir Directory
  # @param [Hash] opts the optional parameters
  # @return [UtilContentAddResponse]
  describe 'content_add_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_aggregated_content_get
  # Get aggregated content stats
  # This endpoint returns aggregated content stats
  # @param content Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_aggregated_content_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_all_deals_get
  # Get all deals for a user
  # This endpoint is used to get all deals for a user
  # @param _begin Begin
  # @param duration Duration
  # @param all All
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_all_deals_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_bw_usage_content_get
  # Get content bandwidth
  # This endpoint returns content bandwidth
  # @param content Content ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_bw_usage_content_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_create_post
  # Add a new content
  # This endpoint adds a new content
  # @param body Content
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_create_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_deals_get
  # Content with deals
  # This endpoint lists all content with deals
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit Limit
  # @option opts [Integer] :offset Offset
  # @return [nil]
  describe 'content_deals_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_ensure_replication_datacid_get
  # Ensure Replication
  # This endpoint ensures that the content is replicated to the specified number of providers
  # @param datacid Data CID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_ensure_replication_datacid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_failures_content_get
  # List all failures for a content
  # This endpoint returns all failures for a content
  # @param content Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_failures_content_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_importdeal_post
  # Import a deal
  # This endpoint imports a deal into the shuttle.
  # @param body Import a deal
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_importdeal_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_list_get
  # List all pinned content
  # This endpoint lists all content
  # @param [Hash] opts the optional parameters
  # @return [Array<String>]
  describe 'content_list_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_read_cont_get
  # Read content
  # This endpoint reads content from the blockstore
  # @param cont CID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_read_cont_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_staging_zones_get
  # Get staging zone for user
  # This endpoint is used to get staging zone for user.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_staging_zones_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_stats_get
  # Get content statistics
  # This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
  # @param limit limit
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_stats_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_status_id_get
  # Content Status
  # This endpoint returns the status of a content
  # @param id Content ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'content_status_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
