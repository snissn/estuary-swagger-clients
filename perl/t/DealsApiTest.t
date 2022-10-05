=begin comment

Estuary API

This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by Swagger Codegen
# Please update the test cases below to test the API endpoints.
# Ref: https://github.com/swagger-api/swagger-codegen
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::SwaggerClient::DealsApi');

my $api = WWW::SwaggerClient::DealsApi->new();
isa_ok($api, 'WWW::SwaggerClient::DealsApi');

#
# deal_estimate_post test
#
{
    my $body = undef; # replace NULL with a proper value
    my $result = $api->deal_estimate_post(body => $body);
}

#
# deal_info_dealid_get test
#
{
    my $dealid = undef; # replace NULL with a proper value
    my $result = $api->deal_info_dealid_get(dealid => $dealid);
}

#
# deal_proposal_propcid_get test
#
{
    my $propcid = undef; # replace NULL with a proper value
    my $result = $api->deal_proposal_propcid_get(propcid => $propcid);
}

#
# deal_query_miner_get test
#
{
    my $miner = undef; # replace NULL with a proper value
    my $result = $api->deal_query_miner_get(miner => $miner);
}

#
# deal_status_by_proposal_propcid_get test
#
{
    my $propcid = undef; # replace NULL with a proper value
    my $result = $api->deal_status_by_proposal_propcid_get(propcid => $propcid);
}

#
# deal_status_miner_propcid_get test
#
{
    my $miner = undef; # replace NULL with a proper value
    my $propcid = undef; # replace NULL with a proper value
    my $result = $api->deal_status_miner_propcid_get(miner => $miner, propcid => $propcid);
}

#
# deal_transfer_in_progress_get test
#
{
    my $result = $api->deal_transfer_in_progress_get();
}

#
# deal_transfer_status_post test
#
{
    my $result = $api->deal_transfer_status_post();
}

#
# deals_failures_get test
#
{
    my $result = $api->deals_failures_get();
}

#
# deals_make_miner_post test
#
{
    my $miner = undef; # replace NULL with a proper value
    my $deal_request = undef; # replace NULL with a proper value
    my $result = $api->deals_make_miner_post(miner => $miner, deal_request => $deal_request);
}

#
# deals_status_deal_get test
#
{
    my $deal = undef; # replace NULL with a proper value
    my $result = $api->deals_status_deal_get(deal => $deal);
}

#
# public_deals_failures_get test
#
{
    my $result = $api->public_deals_failures_get();
}

#
# public_miners_storage_query_miner_get test
#
{
    my $miner = undef; # replace NULL with a proper value
    my $result = $api->public_miners_storage_query_miner_get(miner => $miner);
}


1;