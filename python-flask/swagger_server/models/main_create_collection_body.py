# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class MainCreateCollectionBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, description: str=None, name: str=None):  # noqa: E501
        """MainCreateCollectionBody - a model defined in Swagger

        :param description: The description of this MainCreateCollectionBody.  # noqa: E501
        :type description: str
        :param name: The name of this MainCreateCollectionBody.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'description': str,
            'name': str
        }

        self.attribute_map = {
            'description': 'description',
            'name': 'name'
        }

        self._description = description
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'MainCreateCollectionBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The main.createCollectionBody of this MainCreateCollectionBody.  # noqa: E501
        :rtype: MainCreateCollectionBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this MainCreateCollectionBody.


        :return: The description of this MainCreateCollectionBody.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this MainCreateCollectionBody.


        :param description: The description of this MainCreateCollectionBody.
        :type description: str
        """

        self._description = description

    @property
    def name(self) -> str:
        """Gets the name of this MainCreateCollectionBody.


        :return: The name of this MainCreateCollectionBody.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this MainCreateCollectionBody.


        :param name: The name of this MainCreateCollectionBody.
        :type name: str
        """

        self._name = name
