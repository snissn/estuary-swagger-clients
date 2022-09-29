note
 description:"[
		Estuary API
 		This is the API for the Estuary application.
  		OpenAPI spec version: 0.0.0
 	    

  	NOTE: This class is auto generated by the swagger code generator program.

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel swagger codegen", "src=https://github.com/swagger-api/swagger-codegen.git", "protocol=uri"

class
	PEERING_API

inherit

    API_I


feature -- API Access


	admin_peering_peers_delete 
			-- Remove peers on Peering Service
			-- This endpoint can be used to remove a Peer from the Peering Service
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/admin/peering/peers"


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<"bearerAuth">>)
			l_response := api_client.call_api (l_path, "Delete", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	admin_peering_peers_get 
			-- List all Peering peers
			-- This endpoint can be used to list all peers on Peering Service
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/admin/peering/peers"


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<"bearerAuth">>)
			l_response := api_client.call_api (l_path, "Get", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	admin_peering_peers_post 
			-- Add peers on Peering Service
			-- This endpoint can be used to add a Peer from the Peering Service
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/admin/peering/peers"


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<"bearerAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	admin_peering_start_post 
			-- Start Peering
			-- This endpoint can be used to start the Peering Service
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/admin/peering/start"


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<"bearerAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	admin_peering_status_get 
			-- Check Peering Status
			-- This endpoint can be used to check the Peering status
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/admin/peering/status"


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<"bearerAuth">>)
			l_response := api_client.call_api (l_path, "Get", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	admin_peering_stop_post 
			-- Stop Peering
			-- This endpoint can be used to stop the Peering Service
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/admin/peering/stop"


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<"bearerAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	


end
