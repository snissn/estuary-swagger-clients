#ifndef _AdminManager_H_
#define _AdminManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Admin Admin
 * \ingroup Operations
 *  @{
 */
class AdminManager {
public:
	AdminManager();
	virtual ~AdminManager();

/*! \brief Remove peers on Peering Service. *Synchronous*
 *
 * This endpoint can be used to remove a Peer from the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringPeersDeleteSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Remove peers on Peering Service. *Asynchronous*
 *
 * This endpoint can be used to remove a Peer from the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringPeersDeleteAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief List all Peering peers. *Synchronous*
 *
 * This endpoint can be used to list all peers on Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringPeersGetSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief List all Peering peers. *Asynchronous*
 *
 * This endpoint can be used to list all peers on Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringPeersGetAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add peers on Peering Service. *Synchronous*
 *
 * This endpoint can be used to add a Peer from the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringPeersPostSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add peers on Peering Service. *Asynchronous*
 *
 * This endpoint can be used to add a Peer from the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringPeersPostAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Start Peering. *Synchronous*
 *
 * This endpoint can be used to start the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringStartPostSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Start Peering. *Asynchronous*
 *
 * This endpoint can be used to start the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringStartPostAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Check Peering Status. *Synchronous*
 *
 * This endpoint can be used to check the Peering status
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringStatusGetSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Check Peering Status. *Asynchronous*
 *
 * This endpoint can be used to check the Peering status
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringStatusGetAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Stop Peering. *Synchronous*
 *
 * This endpoint can be used to stop the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringStopPostSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Stop Peering. *Asynchronous*
 *
 * This endpoint can be used to stop the Peering Service
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminPeeringStopPostAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get systems(estuary/shuttle) config. *Synchronous*
 *
 * This endpoint is used to get system configs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminSystemConfigGetSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Get systems(estuary/shuttle) config. *Asynchronous*
 *
 * This endpoint is used to get system configs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminSystemConfigGetAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get all users. *Synchronous*
 *
 * This endpoint is used to get all users.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminUsersGetSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Get all users. *Asynchronous*
 *
 * This endpoint is used to get all users.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminUsersGetAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.estuary.tech";
	}
};
/** @}*/

}
}
#endif /* AdminManager_H_ */
