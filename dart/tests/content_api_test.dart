import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for ContentApi
void main() {
  var instance = new ContentApi();

  group('tests for ContentApi', () {
    // Add Car object
    //
    // This endpoint is used to add a car object to the network. The object can be a file or a directory.
    //
    //Future contentAddCarPost(String body, { String filename, String commp, String size }) async
    test('test contentAddCarPost', () async {
      // TODO
    });

    // Add IPFS object
    //
    // This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
    //
    //Future contentAddIpfsPost(UtilContentAddIpfsBody body) async
    test('test contentAddIpfsPost', () async {
      // TODO
    });

    // Add new content
    //
    // This endpoint is used to upload new content.
    //
    //Future<UtilContentAddResponse> contentAddPost(String file, String coluuid, String dir) async
    test('test contentAddPost', () async {
      // TODO
    });

    // Get aggregated content stats
    //
    // This endpoint returns aggregated content stats
    //
    //Future<String> contentAggregatedContentGet(String content) async
    test('test contentAggregatedContentGet', () async {
      // TODO
    });

    // Get all deals for a user
    //
    // This endpoint is used to get all deals for a user
    //
    //Future contentAllDealsGet(String begin, String duration, String all) async
    test('test contentAllDealsGet', () async {
      // TODO
    });

    // Get content bandwidth
    //
    // This endpoint returns content bandwidth
    //
    //Future contentBwUsageContentGet(String content) async
    test('test contentBwUsageContentGet', () async {
      // TODO
    });

    // Add a new content
    //
    // This endpoint adds a new content
    //
    //Future contentCreatePost(String body) async
    test('test contentCreatePost', () async {
      // TODO
    });

    // Content with deals
    //
    // This endpoint lists all content with deals
    //
    //Future contentDealsGet({ int limit, int offset }) async
    test('test contentDealsGet', () async {
      // TODO
    });

    // Ensure Replication
    //
    // This endpoint ensures that the content is replicated to the specified number of providers
    //
    //Future contentEnsureReplicationDatacidGet(String datacid) async
    test('test contentEnsureReplicationDatacidGet', () async {
      // TODO
    });

    // List all failures for a content
    //
    // This endpoint returns all failures for a content
    //
    //Future<String> contentFailuresContentGet(String content) async
    test('test contentFailuresContentGet', () async {
      // TODO
    });

    // Import a deal
    //
    // This endpoint imports a deal into the shuttle.
    //
    //Future contentImportdealPost(MainImportDealBody body) async
    test('test contentImportdealPost', () async {
      // TODO
    });

    // List all pinned content
    //
    // This endpoint lists all content
    //
    //Future<List<String>> contentListGet() async
    test('test contentListGet', () async {
      // TODO
    });

    // Read content
    //
    // This endpoint reads content from the blockstore
    //
    //Future contentReadContGet(String cont) async
    test('test contentReadContGet', () async {
      // TODO
    });

    // Get staging zone for user
    //
    // This endpoint is used to get staging zone for user.
    //
    //Future contentStagingZonesGet() async
    test('test contentStagingZonesGet', () async {
      // TODO
    });

    // Get content statistics
    //
    // This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
    //
    //Future contentStatsGet(String limit) async
    test('test contentStatsGet', () async {
      // TODO
    });

    // Content Status
    //
    // This endpoint returns the status of a content
    //
    //Future contentStatusIdGet(int id) async
    test('test contentStatusIdGet', () async {
      // TODO
    });

  });
}
