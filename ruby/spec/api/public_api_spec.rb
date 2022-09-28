=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::PublicApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PublicApi' do
  before do
    # run before each test
    @instance = SwaggerClient::PublicApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PublicApi' do
    it 'should create an instance of PublicApi' do
      expect(@instance).to be_instance_of(SwaggerClient::PublicApi)
    end
  end

  # unit tests for public_by_cid_cid_get
  # Get Content by Cid
  # This endpoint returns the content associated with a CID
  # @param cid Cid
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_by_cid_cid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_info_get
  # Get public node info
  # This endpoint returns information about the node
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_info_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_metrics_deals_on_chain_get
  # Get deal metrics
  # This endpoint is used to get deal metrics
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_metrics_deals_on_chain_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_deals_miner_get
  # Get all miners deals
  # This endpoint returns all miners deals
  # @param miner Filter by miner
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_miners_deals_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_failures_miner_get
  # Get all miners
  # This endpoint returns all miners
  # @param miner Filter by miner
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_miners_failures_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_get
  # Get all miners
  # This endpoint returns all miners
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_miners_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_stats_miner_get
  # Get miner stats
  # This endpoint returns miner stats
  # @param miner Filter by miner
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_miners_stats_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_net_addrs_get
  # Net Addrs
  # This endpoint is used to get net addrs
  # @param [Hash] opts the optional parameters
  # @return [Array<String>]
  describe 'public_net_addrs_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_net_peers_get
  # Net Peers
  # This endpoint is used to get net peers
  # @param [Hash] opts the optional parameters
  # @return [Array<String>]
  describe 'public_net_peers_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_stats_get
  # Public stats
  # This endpoint is used to get public stats.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_stats_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
