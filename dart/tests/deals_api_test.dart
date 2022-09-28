import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for DealsApi
void main() {
  var instance = new DealsApi();

  group('tests for DealsApi', () {
    // Estimate the cost of a deal
    //
    // This endpoint estimates the cost of a deal
    //
    //Future dealEstimatePost(MainEstimateDealBody body) async
    test('test dealEstimatePost', () async {
      // TODO
    });

    // Get Deal Info
    //
    // This endpoint returns the deal info for a deal
    //
    //Future dealInfoDealidGet(int dealid) async
    test('test dealInfoDealidGet', () async {
      // TODO
    });

    // Get Proposal
    //
    // This endpoint returns the proposal for a deal
    //
    //Future dealProposalPropcidGet(String propcid) async
    test('test dealProposalPropcidGet', () async {
      // TODO
    });

    // Query Ask
    //
    // This endpoint returns the ask for a given CID
    //
    //Future dealQueryMinerGet(String miner) async
    test('test dealQueryMinerGet', () async {
      // TODO
    });

    // Get Deal Status by PropCid
    //
    // Get Deal Status by PropCid
    //
    //Future dealStatusByProposalPropcidGet(String propcid) async
    test('test dealStatusByProposalPropcidGet', () async {
      // TODO
    });

    // Deal Status
    //
    // This endpoint returns the status of a deal
    //
    //Future dealStatusMinerPropcidGet(String miner, String propcid) async
    test('test dealStatusMinerPropcidGet', () async {
      // TODO
    });

    // Transfer In Progress
    //
    // This endpoint returns the in-progress transfers
    //
    //Future dealTransferInProgressGet() async
    test('test dealTransferInProgressGet', () async {
      // TODO
    });

    // Transfer Status
    //
    // This endpoint returns the status of a transfer
    //
    //Future dealTransferStatusPost() async
    test('test dealTransferStatusPost', () async {
      // TODO
    });

    // Get storage failures for user
    //
    // This endpoint returns a list of storage failures for user
    //
    //Future dealsFailuresGet() async
    test('test dealsFailuresGet', () async {
      // TODO
    });

    // Make Deal
    //
    // This endpoint makes a deal for a given content and miner
    //
    //Future dealsMakeMinerPost(String body, String miner) async
    test('test dealsMakeMinerPost', () async {
      // TODO
    });

    // Get Deal Status
    //
    // This endpoint returns the status of a deal
    //
    //Future dealsStatusDealGet(int deal) async
    test('test dealsStatusDealGet', () async {
      // TODO
    });

    // Get storage failures
    //
    // This endpoint returns a list of storage failures
    //
    //Future publicDealsFailuresGet() async
    test('test publicDealsFailuresGet', () async {
      // TODO
    });

    // Query Ask
    //
    // This endpoint returns the ask for a given CID
    //
    //Future publicMinersStorageQueryMinerGet(String miner) async
    test('test publicMinersStorageQueryMinerGet', () async {
      // TODO
    });

  });
}
