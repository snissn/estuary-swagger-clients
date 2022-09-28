=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::DealsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'DealsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::DealsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of DealsApi' do
    it 'should create an instance of DealsApi' do
      expect(@instance).to be_instance_of(SwaggerClient::DealsApi)
    end
  end

  # unit tests for deal_estimate_post
  # Estimate the cost of a deal
  # This endpoint estimates the cost of a deal
  # @param body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_estimate_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deal_info_dealid_get
  # Get Deal Info
  # This endpoint returns the deal info for a deal
  # @param dealid Deal ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_info_dealid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deal_proposal_propcid_get
  # Get Proposal
  # This endpoint returns the proposal for a deal
  # @param propcid Proposal CID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_proposal_propcid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deal_query_miner_get
  # Query Ask
  # This endpoint returns the ask for a given CID
  # @param miner CID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_query_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deal_status_by_proposal_propcid_get
  # Get Deal Status by PropCid
  # Get Deal Status by PropCid
  # @param propcid PropCid
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_status_by_proposal_propcid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deal_status_miner_propcid_get
  # Deal Status
  # This endpoint returns the status of a deal
  # @param miner Miner
  # @param propcid Proposal CID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_status_miner_propcid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deal_transfer_in_progress_get
  # Transfer In Progress
  # This endpoint returns the in-progress transfers
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_transfer_in_progress_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deal_transfer_status_post
  # Transfer Status
  # This endpoint returns the status of a transfer
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deal_transfer_status_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deals_failures_get
  # Get storage failures for user
  # This endpoint returns a list of storage failures for user
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deals_failures_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deals_make_miner_post
  # Make Deal
  # This endpoint makes a deal for a given content and miner
  # @param body Deal Request
  # @param miner Miner
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deals_make_miner_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deals_status_deal_get
  # Get Deal Status
  # This endpoint returns the status of a deal
  # @param deal Deal ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'deals_status_deal_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_deals_failures_get
  # Get storage failures
  # This endpoint returns a list of storage failures
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_deals_failures_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_storage_query_miner_get
  # Query Ask
  # This endpoint returns the ask for a given CID
  # @param miner CID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'public_miners_storage_query_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
