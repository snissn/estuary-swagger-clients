# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class MainEstimateDealBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, duration_blks: int=None, replication: int=None, size: int=None, verified: bool=None):  # noqa: E501
        """MainEstimateDealBody - a model defined in Swagger

        :param duration_blks: The duration_blks of this MainEstimateDealBody.  # noqa: E501
        :type duration_blks: int
        :param replication: The replication of this MainEstimateDealBody.  # noqa: E501
        :type replication: int
        :param size: The size of this MainEstimateDealBody.  # noqa: E501
        :type size: int
        :param verified: The verified of this MainEstimateDealBody.  # noqa: E501
        :type verified: bool
        """
        self.swagger_types = {
            'duration_blks': int,
            'replication': int,
            'size': int,
            'verified': bool
        }

        self.attribute_map = {
            'duration_blks': 'durationBlks',
            'replication': 'replication',
            'size': 'size',
            'verified': 'verified'
        }
        self._duration_blks = duration_blks
        self._replication = replication
        self._size = size
        self._verified = verified

    @classmethod
    def from_dict(cls, dikt) -> 'MainEstimateDealBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The main.estimateDealBody of this MainEstimateDealBody.  # noqa: E501
        :rtype: MainEstimateDealBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duration_blks(self) -> int:
        """Gets the duration_blks of this MainEstimateDealBody.


        :return: The duration_blks of this MainEstimateDealBody.
        :rtype: int
        """
        return self._duration_blks

    @duration_blks.setter
    def duration_blks(self, duration_blks: int):
        """Sets the duration_blks of this MainEstimateDealBody.


        :param duration_blks: The duration_blks of this MainEstimateDealBody.
        :type duration_blks: int
        """

        self._duration_blks = duration_blks

    @property
    def replication(self) -> int:
        """Gets the replication of this MainEstimateDealBody.


        :return: The replication of this MainEstimateDealBody.
        :rtype: int
        """
        return self._replication

    @replication.setter
    def replication(self, replication: int):
        """Sets the replication of this MainEstimateDealBody.


        :param replication: The replication of this MainEstimateDealBody.
        :type replication: int
        """

        self._replication = replication

    @property
    def size(self) -> int:
        """Gets the size of this MainEstimateDealBody.


        :return: The size of this MainEstimateDealBody.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this MainEstimateDealBody.


        :param size: The size of this MainEstimateDealBody.
        :type size: int
        """

        self._size = size

    @property
    def verified(self) -> bool:
        """Gets the verified of this MainEstimateDealBody.


        :return: The verified of this MainEstimateDealBody.
        :rtype: bool
        """
        return self._verified

    @verified.setter
    def verified(self, verified: bool):
        """Sets the verified of this MainEstimateDealBody.


        :param verified: The verified of this MainEstimateDealBody.
        :type verified: bool
        """

        self._verified = verified
