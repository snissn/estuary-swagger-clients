import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for CollectionsApi
void main() {
  var instance = new CollectionsApi();

  group('tests for CollectionsApi', () {
    // Produce a CID of the collection contents
    //
    // This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
    //
    //Future<String> collectionsColuuidCommitPost(String coluuid) async
    test('test collectionsColuuidCommitPost', () async {
      // TODO
    });

    // Deletes a collection
    //
    // This endpoint is used to delete an existing collection.
    //
    //Future collectionsColuuidDelete(String coluuid) async
    test('test collectionsColuuidDelete', () async {
      // TODO
    });

    // Get contents in a collection
    //
    // This endpoint is used to get contents in a collection. If no colpath query param is passed
    //
    //Future<String> collectionsColuuidGet(String coluuid, { String dir }) async
    test('test collectionsColuuidGet', () async {
      // TODO
    });

    // Add contents to a collection
    //
    // This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
    //
    //Future<Map<String, String>> collectionsColuuidPost(List<int> body) async
    test('test collectionsColuuidPost', () async {
      // TODO
    });

    // Add a file to a collection
    //
    // This endpoint adds a file to a collection
    //
    //Future collectionsFsAddPost(String coluuid, String content, String path) async
    test('test collectionsFsAddPost', () async {
      // TODO
    });

    // List all collections
    //
    // This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
    //
    //Future<List<MainCollection>> collectionsGet(int id) async
    test('test collectionsGet', () async {
      // TODO
    });

    // Create a new collection
    //
    // This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
    //
    //Future<MainCollection> collectionsPost(MainCreateCollectionBody body) async
    test('test collectionsPost', () async {
      // TODO
    });

  });
}
