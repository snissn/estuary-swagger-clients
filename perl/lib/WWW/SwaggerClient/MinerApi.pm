=begin comment

Estuary API

This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
package WWW::SwaggerClient::MinerApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::SwaggerClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::SwaggerClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# public_miners_deals_miner_get
#
# Get all miners deals
# 
# @param string $miner Filter by miner (required)
{
    my $params = {
    'miner' => {
        data_type => 'string',
        description => 'Filter by miner',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'public_miners_deals_miner_get' } = { 
    	summary => 'Get all miners deals',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub public_miners_deals_miner_get {
    my ($self, %args) = @_;

    # verify the required parameter 'miner' is set
    unless (exists $args{'miner'}) {
      croak("Missing the required parameter 'miner' when calling public_miners_deals_miner_get");
    }

    # parse inputs
    my $_resource_path = '/public/miners/deals/{miner}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # path params
    if ( exists $args{'miner'}) {
        my $_base_variable = "{" . "miner" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'miner'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(bearerAuth )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# public_miners_stats_miner_get
#
# Get miner stats
# 
# @param string $miner Filter by miner (required)
{
    my $params = {
    'miner' => {
        data_type => 'string',
        description => 'Filter by miner',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'public_miners_stats_miner_get' } = { 
    	summary => 'Get miner stats',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub public_miners_stats_miner_get {
    my ($self, %args) = @_;

    # verify the required parameter 'miner' is set
    unless (exists $args{'miner'}) {
      croak("Missing the required parameter 'miner' when calling public_miners_stats_miner_get");
    }

    # parse inputs
    my $_resource_path = '/public/miners/stats/{miner}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # path params
    if ( exists $args{'miner'}) {
        my $_base_variable = "{" . "miner" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'miner'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(bearerAuth )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

1;