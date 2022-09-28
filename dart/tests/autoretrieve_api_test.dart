import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for AutoretrieveApi
void main() {
  var instance = new AutoretrieveApi();

  group('tests for AutoretrieveApi', () {
    // Register autoretrieve server
    //
    // This endpoint registers a new autoretrieve server
    //
    //Future adminAutoretrieveInitPost(String body) async
    test('test adminAutoretrieveInitPost', () async {
      // TODO
    });

    // List autoretrieve servers
    //
    // This endpoint lists all registered autoretrieve servers
    //
    //Future adminAutoretrieveListGet() async
    test('test adminAutoretrieveListGet', () async {
      // TODO
    });

    // Marks autoretrieve server as up
    //
    // This endpoint updates the lastConnection field for autoretrieve
    //
    //Future autoretrieveHeartbeatPost(String token) async
    test('test autoretrieveHeartbeatPost', () async {
      // TODO
    });

  });
}
