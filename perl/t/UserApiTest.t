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

use_ok('WWW::SwaggerClient::UserApi');

my $api = WWW::SwaggerClient::UserApi->new();
isa_ok($api, 'WWW::SwaggerClient::UserApi');

#
# user_api_keys_get test
#
{
    my $result = $api->user_api_keys_get();
}

#
# user_api_keys_key_delete test
#
{
    my $key = undef; # replace NULL with a proper value
    my $result = $api->user_api_keys_key_delete(key => $key);
}

#
# user_api_keys_post test
#
{
    my $result = $api->user_api_keys_post();
}

#
# user_export_get test
#
{
    my $result = $api->user_export_get();
}

#
# user_stats_get test
#
{
    my $result = $api->user_stats_get();
}


1;