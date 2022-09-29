# coding: utf-8

"""
    Estuary API

    This is the API for the Estuary application.  # noqa: E501

    OpenAPI spec version: 0.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.net_api import NetApi  # noqa: E501
from swagger_client.rest import ApiException


class TestNetApi(unittest.TestCase):
    """NetApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.net_api.NetApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_net_addrs_get(self):
        """Test case for net_addrs_get

        Net Addrs  # noqa: E501
        """
        pass

    def test_public_miners_failures_miner_get(self):
        """Test case for public_miners_failures_miner_get

        Get all miners  # noqa: E501
        """
        pass

    def test_public_miners_get(self):
        """Test case for public_miners_get

        Get all miners  # noqa: E501
        """
        pass

    def test_public_net_addrs_get(self):
        """Test case for public_net_addrs_get

        Net Addrs  # noqa: E501
        """
        pass

    def test_public_net_peers_get(self):
        """Test case for public_net_peers_get

        Net Peers  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
