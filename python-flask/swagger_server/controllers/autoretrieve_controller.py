import connexion
import six

from swagger_server import util


def admin_autoretrieve_init_post(body):  # noqa: E501
    """Register autoretrieve server

    This endpoint registers a new autoretrieve server # noqa: E501

    :param body: Autoretrieve&#x27;s public key
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = str.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def admin_autoretrieve_list_get():  # noqa: E501
    """List autoretrieve servers

    This endpoint lists all registered autoretrieve servers # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def autoretrieve_heartbeat_post(token):  # noqa: E501
    """Marks autoretrieve server as up

    This endpoint updates the lastConnection field for autoretrieve # noqa: E501

    :param token: Autoretrieve&#x27;s auth token
    :type token: str

    :rtype: None
    """
    return 'do some magic!'
