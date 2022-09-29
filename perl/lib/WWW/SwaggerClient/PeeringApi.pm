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
package WWW::SwaggerClient::PeeringApi;

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
# admin_peering_peers_delete
#
# Remove peers on Peering Service
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'admin_peering_peers_delete' } = { 
    	summary => 'Remove peers on Peering Service',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub admin_peering_peers_delete {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/admin/peering/peers';

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
# admin_peering_peers_get
#
# List all Peering peers
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'admin_peering_peers_get' } = { 
    	summary => 'List all Peering peers',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub admin_peering_peers_get {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/admin/peering/peers';

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
# admin_peering_peers_post
#
# Add peers on Peering Service
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'admin_peering_peers_post' } = { 
    	summary => 'Add peers on Peering Service',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub admin_peering_peers_post {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/admin/peering/peers';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
# admin_peering_start_post
#
# Start Peering
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'admin_peering_start_post' } = { 
    	summary => 'Start Peering',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub admin_peering_start_post {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/admin/peering/start';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
# admin_peering_status_get
#
# Check Peering Status
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'admin_peering_status_get' } = { 
    	summary => 'Check Peering Status',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub admin_peering_status_get {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/admin/peering/status';

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
# admin_peering_stop_post
#
# Stop Peering
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'admin_peering_stop_post' } = { 
    	summary => 'Stop Peering',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub admin_peering_stop_post {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/admin/peering/stop';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
