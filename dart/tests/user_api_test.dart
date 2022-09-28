import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for UserApi
void main() {
  var instance = new UserApi();

  group('tests for UserApi', () {
    // Get API keys for a user
    //
    // This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
    //
    //Future<List<MainGetApiKeysResp>> userApiKeysGet() async
    test('test userApiKeysGet', () async {
      // TODO
    });

    // Revoke a User API Key.
    //
    // This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
    //
    //Future userApiKeysKeyDelete(String key) async
    test('test userApiKeysKeyDelete', () async {
      // TODO
    });

    // Create API keys for a user
    //
    // This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
    //
    //Future<MainGetApiKeysResp> userApiKeysPost() async
    test('test userApiKeysPost', () async {
      // TODO
    });

    // Export user data
    //
    // This endpoint is used to get API keys for a user.
    //
    //Future<String> userExportGet() async
    test('test userExportGet', () async {
      // TODO
    });

    // Create API keys for a user
    //
    // This endpoint is used to create API keys for a user.
    //
    //Future<MainUserStatsResponse> userStatsGet() async
    test('test userStatsGet', () async {
      // TODO
    });

  });
}
