/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

import (
	"fmt"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"//",
		Index,
	},

	Route{
		"AdminPeeringPeersDelete",
		strings.ToUpper("Delete"),
		"//admin/peering/peers",
		AdminPeeringPeersDelete,
	},

	Route{
		"AdminPeeringPeersGet",
		strings.ToUpper("Get"),
		"//admin/peering/peers",
		AdminPeeringPeersGet,
	},

	Route{
		"AdminPeeringPeersPost",
		strings.ToUpper("Post"),
		"//admin/peering/peers",
		AdminPeeringPeersPost,
	},

	Route{
		"AdminPeeringStartPost",
		strings.ToUpper("Post"),
		"//admin/peering/start",
		AdminPeeringStartPost,
	},

	Route{
		"AdminPeeringStatusGet",
		strings.ToUpper("Get"),
		"//admin/peering/status",
		AdminPeeringStatusGet,
	},

	Route{
		"AdminPeeringStopPost",
		strings.ToUpper("Post"),
		"//admin/peering/stop",
		AdminPeeringStopPost,
	},

	Route{
		"AdminSystemConfigGet",
		strings.ToUpper("Get"),
		"//admin/system/config",
		AdminSystemConfigGet,
	},

	Route{
		"AdminUsersGet",
		strings.ToUpper("Get"),
		"//admin/users",
		AdminUsersGet,
	},

	Route{
		"AdminAutoretrieveInitPost",
		strings.ToUpper("Post"),
		"//admin/autoretrieve/init",
		AdminAutoretrieveInitPost,
	},

	Route{
		"AdminAutoretrieveListGet",
		strings.ToUpper("Get"),
		"//admin/autoretrieve/list",
		AdminAutoretrieveListGet,
	},

	Route{
		"AutoretrieveHeartbeatPost",
		strings.ToUpper("Post"),
		"//autoretrieve/heartbeat",
		AutoretrieveHeartbeatPost,
	},

	Route{
		"CollectionsColuuidCommitPost",
		strings.ToUpper("Post"),
		"//collections/{coluuid}/commit",
		CollectionsColuuidCommitPost,
	},

	Route{
		"CollectionsColuuidDelete",
		strings.ToUpper("Delete"),
		"//collections/{coluuid}",
		CollectionsColuuidDelete,
	},

	Route{
		"CollectionsColuuidGet",
		strings.ToUpper("Get"),
		"//collections/{coluuid}",
		CollectionsColuuidGet,
	},

	Route{
		"CollectionsColuuidPost",
		strings.ToUpper("Post"),
		"//collections/{coluuid}",
		CollectionsColuuidPost,
	},

	Route{
		"CollectionsFsAddPost",
		strings.ToUpper("Post"),
		"//collections/fs/add",
		CollectionsFsAddPost,
	},

	Route{
		"CollectionsGet",
		strings.ToUpper("Get"),
		"//collections/",
		CollectionsGet,
	},

	Route{
		"CollectionsPost",
		strings.ToUpper("Post"),
		"//collections/",
		CollectionsPost,
	},

	Route{
		"ContentAddCarPost",
		strings.ToUpper("Post"),
		"//content/add-car",
		ContentAddCarPost,
	},

	Route{
		"ContentAddIpfsPost",
		strings.ToUpper("Post"),
		"//content/add-ipfs",
		ContentAddIpfsPost,
	},

	Route{
		"ContentAddPost",
		strings.ToUpper("Post"),
		"//content/add",
		ContentAddPost,
	},

	Route{
		"ContentAggregatedContentGet",
		strings.ToUpper("Get"),
		"//content/aggregated/{content}",
		ContentAggregatedContentGet,
	},

	Route{
		"ContentAllDealsGet",
		strings.ToUpper("Get"),
		"//content/all-deals",
		ContentAllDealsGet,
	},

	Route{
		"ContentBwUsageContentGet",
		strings.ToUpper("Get"),
		"//content/bw-usage/{content}",
		ContentBwUsageContentGet,
	},

	Route{
		"ContentCreatePost",
		strings.ToUpper("Post"),
		"//content/create",
		ContentCreatePost,
	},

	Route{
		"ContentDealsGet",
		strings.ToUpper("Get"),
		"//content/deals",
		ContentDealsGet,
	},

	Route{
		"ContentEnsureReplicationDatacidGet",
		strings.ToUpper("Get"),
		"//content/ensure-replication/{datacid}",
		ContentEnsureReplicationDatacidGet,
	},

	Route{
		"ContentFailuresContentGet",
		strings.ToUpper("Get"),
		"//content/failures/{content}",
		ContentFailuresContentGet,
	},

	Route{
		"ContentImportdealPost",
		strings.ToUpper("Post"),
		"//content/importdeal",
		ContentImportdealPost,
	},

	Route{
		"ContentListGet",
		strings.ToUpper("Get"),
		"//content/list",
		ContentListGet,
	},

	Route{
		"ContentReadContGet",
		strings.ToUpper("Get"),
		"//content/read/{cont}",
		ContentReadContGet,
	},

	Route{
		"ContentStagingZonesGet",
		strings.ToUpper("Get"),
		"//content/staging-zones",
		ContentStagingZonesGet,
	},

	Route{
		"ContentStatsGet",
		strings.ToUpper("Get"),
		"//content/stats",
		ContentStatsGet,
	},

	Route{
		"ContentStatusIdGet",
		strings.ToUpper("Get"),
		"//content/status/{id}",
		ContentStatusIdGet,
	},

	Route{
		"DealEstimatePost",
		strings.ToUpper("Post"),
		"//deal/estimate",
		DealEstimatePost,
	},

	Route{
		"DealInfoDealidGet",
		strings.ToUpper("Get"),
		"//deal/info/{dealid}",
		DealInfoDealidGet,
	},

	Route{
		"DealProposalPropcidGet",
		strings.ToUpper("Get"),
		"//deal/proposal/{propcid}",
		DealProposalPropcidGet,
	},

	Route{
		"DealQueryMinerGet",
		strings.ToUpper("Get"),
		"//deal/query/{miner}",
		DealQueryMinerGet,
	},

	Route{
		"DealStatusByProposalPropcidGet",
		strings.ToUpper("Get"),
		"//deal/status-by-proposal/{propcid}",
		DealStatusByProposalPropcidGet,
	},

	Route{
		"DealStatusMinerPropcidGet",
		strings.ToUpper("Get"),
		"//deal/status/{miner}/{propcid}",
		DealStatusMinerPropcidGet,
	},

	Route{
		"DealTransferInProgressGet",
		strings.ToUpper("Get"),
		"//deal/transfer/in-progress",
		DealTransferInProgressGet,
	},

	Route{
		"DealTransferStatusPost",
		strings.ToUpper("Post"),
		"//deal/transfer/status",
		DealTransferStatusPost,
	},

	Route{
		"DealsFailuresGet",
		strings.ToUpper("Get"),
		"//deals/failures",
		DealsFailuresGet,
	},

	Route{
		"DealsMakeMinerPost",
		strings.ToUpper("Post"),
		"//deals/make/{miner}",
		DealsMakeMinerPost,
	},

	Route{
		"DealsStatusDealGet",
		strings.ToUpper("Get"),
		"//deals/status/{deal}",
		DealsStatusDealGet,
	},

	Route{
		"PublicDealsFailuresGet",
		strings.ToUpper("Get"),
		"//public/deals/failures",
		PublicDealsFailuresGet,
	},

	Route{
		"PublicMinersStorageQueryMinerGet",
		strings.ToUpper("Get"),
		"//public/miners/storage/query/{miner}",
		PublicMinersStorageQueryMinerGet,
	},

	Route{
		"PublicMetricsDealsOnChainGet",
		strings.ToUpper("Get"),
		"//public/metrics/deals-on-chain",
		PublicMetricsDealsOnChainGet,
	},

	Route{
		"PublicMinersDealsMinerGet",
		strings.ToUpper("Get"),
		"//public/miners/deals/{miner}",
		PublicMinersDealsMinerGet,
	},

	Route{
		"PublicMinersStatsMinerGet",
		strings.ToUpper("Get"),
		"//public/miners/stats/{miner}",
		PublicMinersStatsMinerGet,
	},

	Route{
		"NetAddrsGet",
		strings.ToUpper("Get"),
		"//net/addrs",
		NetAddrsGet,
	},

	Route{
		"PublicMinersFailuresMinerGet",
		strings.ToUpper("Get"),
		"//public/miners/failures/{miner}",
		PublicMinersFailuresMinerGet,
	},

	Route{
		"PublicMinersGet",
		strings.ToUpper("Get"),
		"//public/miners",
		PublicMinersGet,
	},

	Route{
		"PublicNetAddrsGet",
		strings.ToUpper("Get"),
		"//public/net/addrs",
		PublicNetAddrsGet,
	},

	Route{
		"PublicNetPeersGet",
		strings.ToUpper("Get"),
		"//public/net/peers",
		PublicNetPeersGet,
	},

	Route{
		"AdminPeeringPeersDelete",
		strings.ToUpper("Delete"),
		"//admin/peering/peers",
		AdminPeeringPeersDelete,
	},

	Route{
		"AdminPeeringPeersGet",
		strings.ToUpper("Get"),
		"//admin/peering/peers",
		AdminPeeringPeersGet,
	},

	Route{
		"AdminPeeringPeersPost",
		strings.ToUpper("Post"),
		"//admin/peering/peers",
		AdminPeeringPeersPost,
	},

	Route{
		"AdminPeeringStartPost",
		strings.ToUpper("Post"),
		"//admin/peering/start",
		AdminPeeringStartPost,
	},

	Route{
		"AdminPeeringStatusGet",
		strings.ToUpper("Get"),
		"//admin/peering/status",
		AdminPeeringStatusGet,
	},

	Route{
		"AdminPeeringStopPost",
		strings.ToUpper("Post"),
		"//admin/peering/stop",
		AdminPeeringStopPost,
	},

	Route{
		"AdminPeeringPeersDelete",
		strings.ToUpper("Delete"),
		"//admin/peering/peers",
		AdminPeeringPeersDelete,
	},

	Route{
		"AdminPeeringPeersGet",
		strings.ToUpper("Get"),
		"//admin/peering/peers",
		AdminPeeringPeersGet,
	},

	Route{
		"AdminPeeringPeersPost",
		strings.ToUpper("Post"),
		"//admin/peering/peers",
		AdminPeeringPeersPost,
	},

	Route{
		"AdminPeeringStartPost",
		strings.ToUpper("Post"),
		"//admin/peering/start",
		AdminPeeringStartPost,
	},

	Route{
		"AdminPeeringStatusGet",
		strings.ToUpper("Get"),
		"//admin/peering/status",
		AdminPeeringStatusGet,
	},

	Route{
		"AdminPeeringStopPost",
		strings.ToUpper("Post"),
		"//admin/peering/stop",
		AdminPeeringStopPost,
	},

	Route{
		"PinningPinsGet",
		strings.ToUpper("Get"),
		"//pinning/pins",
		PinningPinsGet,
	},

	Route{
		"PinningPinsPinidDelete",
		strings.ToUpper("Delete"),
		"//pinning/pins/{pinid}",
		PinningPinsPinidDelete,
	},

	Route{
		"PinningPinsPinidGet",
		strings.ToUpper("Get"),
		"//pinning/pins/{pinid}",
		PinningPinsPinidGet,
	},

	Route{
		"PinningPinsPinidPost",
		strings.ToUpper("Post"),
		"//pinning/pins/{pinid}",
		PinningPinsPinidPost,
	},

	Route{
		"PinningPinsPost",
		strings.ToUpper("Post"),
		"//pinning/pins",
		PinningPinsPost,
	},

	Route{
		"PublicByCidCidGet",
		strings.ToUpper("Get"),
		"//public/by-cid/{cid}",
		PublicByCidCidGet,
	},

	Route{
		"PublicInfoGet",
		strings.ToUpper("Get"),
		"//public/info",
		PublicInfoGet,
	},

	Route{
		"PublicMetricsDealsOnChainGet",
		strings.ToUpper("Get"),
		"//public/metrics/deals-on-chain",
		PublicMetricsDealsOnChainGet,
	},

	Route{
		"PublicMinersDealsMinerGet",
		strings.ToUpper("Get"),
		"//public/miners/deals/{miner}",
		PublicMinersDealsMinerGet,
	},

	Route{
		"PublicMinersFailuresMinerGet",
		strings.ToUpper("Get"),
		"//public/miners/failures/{miner}",
		PublicMinersFailuresMinerGet,
	},

	Route{
		"PublicMinersGet",
		strings.ToUpper("Get"),
		"//public/miners",
		PublicMinersGet,
	},

	Route{
		"PublicMinersStatsMinerGet",
		strings.ToUpper("Get"),
		"//public/miners/stats/{miner}",
		PublicMinersStatsMinerGet,
	},

	Route{
		"PublicNetAddrsGet",
		strings.ToUpper("Get"),
		"//public/net/addrs",
		PublicNetAddrsGet,
	},

	Route{
		"PublicNetPeersGet",
		strings.ToUpper("Get"),
		"//public/net/peers",
		PublicNetPeersGet,
	},

	Route{
		"PublicStatsGet",
		strings.ToUpper("Get"),
		"//public/stats",
		PublicStatsGet,
	},

	Route{
		"UserApiKeysGet",
		strings.ToUpper("Get"),
		"//user/api-keys",
		UserApiKeysGet,
	},

	Route{
		"UserApiKeysKeyDelete",
		strings.ToUpper("Delete"),
		"//user/api-keys/{key}",
		UserApiKeysKeyDelete,
	},

	Route{
		"UserApiKeysPost",
		strings.ToUpper("Post"),
		"//user/api-keys",
		UserApiKeysPost,
	},

	Route{
		"UserExportGet",
		strings.ToUpper("Get"),
		"//user/export",
		UserExportGet,
	},

	Route{
		"UserStatsGet",
		strings.ToUpper("Get"),
		"//user/stats",
		UserStatsGet,
	},
}