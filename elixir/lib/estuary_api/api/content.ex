# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule EstuaryAPI.Api.Content do
  @moduledoc """
  API calls for all endpoints tagged `Content`.
  """

  alias EstuaryAPI.Connection
  import EstuaryAPI.RequestBuilder


  @doc """
  Add Car object
  This endpoint is used to add a car object to the network. The object can be a file or a directory.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - body (String.t): Car
  - opts (KeywordList): [optional] Optional parameters
    - :filename (String.t): Filename
    - :commp (String.t): Commp
    - :size (String.t): Size

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_add_car_post(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_add_car_post(connection, body, opts \\ []) do
    optional_params = %{
      :"filename" => :query,
      :"commp" => :query,
      :"size" => :query
    }
    %{}
    |> method(:post)
    |> url("/content/add-car")
    |> add_param(:body, :"body", body)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Add IPFS object
  This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - body (UtilContentAddIpfsBody): IPFS Body
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_add_ipfs_post(Tesla.Env.client, EstuaryAPI.Model.UtilContentAddIpfsBody.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_add_ipfs_post(connection, body, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/content/add-ipfs")
    |> add_param(:body, :"body", body)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Add new content
  This endpoint is used to upload new content.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - data (String.t): File to upload
  - coluuid (String.t): Collection UUID
  - dir (String.t): Directory
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %EstuaryAPI.Model.UtilContentAddResponse{}} on success
  {:error, info} on failure
  """
  @spec content_add_post(Tesla.Env.client, String.t, String.t, String.t, keyword()) :: {:ok, EstuaryAPI.Model.UtilContentAddResponse.t} | {:error, Tesla.Env.t}
  def content_add_post(connection, data, coluuid, dir, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/content/add")
    |> add_param(:file, :"data", data)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%EstuaryAPI.Model.UtilContentAddResponse{})
  end

  @doc """
  Get aggregated content stats
  This endpoint returns aggregated content stats

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - content (String.t): Content ID
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %EstuaryAPI.Model.String.t{}} on success
  {:error, info} on failure
  """
  @spec content_aggregated_content_get(Tesla.Env.client, String.t, keyword()) :: {:ok, String.t} | {:error, Tesla.Env.t}
  def content_aggregated_content_get(connection, content, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/aggregated/#{content}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get all deals for a user
  This endpoint is used to get all deals for a user

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - begin (String.t): Begin
  - duration (String.t): Duration
  - all (String.t): All
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_all_deals_get(Tesla.Env.client, String.t, String.t, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_all_deals_get(connection, begin, duration, all, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/all-deals")
    |> add_param(:query, :"begin", begin)
    |> add_param(:query, :"duration", duration)
    |> add_param(:query, :"all", all)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get content bandwidth
  This endpoint returns content bandwidth

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - content (String.t): Content ID
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_bw_usage_content_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_bw_usage_content_get(connection, content, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/bw-usage/#{content}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Add a new content
  This endpoint adds a new content

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - body (String.t): Content
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_create_post(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_create_post(connection, body, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/content/create")
    |> add_param(:body, :"body", body)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Content with deals
  This endpoint lists all content with deals

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :limit (integer()): Limit
    - :offset (integer()): Offset

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_deals_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_deals_get(connection, opts \\ []) do
    optional_params = %{
      :"limit" => :query,
      :"offset" => :query
    }
    %{}
    |> method(:get)
    |> url("/content/deals")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Ensure Replication
  This endpoint ensures that the content is replicated to the specified number of providers

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - datacid (String.t): Data CID
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_ensure_replication_datacid_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_ensure_replication_datacid_get(connection, datacid, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/ensure-replication/#{datacid}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  List all failures for a content
  This endpoint returns all failures for a content

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - content (String.t): Content ID
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %EstuaryAPI.Model.String.t{}} on success
  {:error, info} on failure
  """
  @spec content_failures_content_get(Tesla.Env.client, String.t, keyword()) :: {:ok, String.t} | {:error, Tesla.Env.t}
  def content_failures_content_get(connection, content, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/failures/#{content}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Import a deal
  This endpoint imports a deal into the shuttle.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - body (MainImportDealBody): Import a deal
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_importdeal_post(Tesla.Env.client, EstuaryAPI.Model.MainImportDealBody.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_importdeal_post(connection, body, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/content/importdeal")
    |> add_param(:body, :"body", body)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  List all pinned content
  This endpoint lists all content

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, [%String{}, ...]} on success
  {:error, info} on failure
  """
  @spec content_list_get(Tesla.Env.client, keyword()) :: {:ok, list(String.t)} | {:error, Tesla.Env.t}
  def content_list_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/list")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode([%EstuaryAPI.Model.String{}])
  end

  @doc """
  Read content
  This endpoint reads content from the blockstore

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - cont (String.t): CID
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_read_cont_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_read_cont_get(connection, cont, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/read/#{cont}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get staging zone for user
  This endpoint is used to get staging zone for user.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_staging_zones_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_staging_zones_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/staging-zones")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get content statistics
  This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - limit (String.t): limit
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_stats_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_stats_get(connection, limit, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/stats")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Content Status
  This endpoint returns the status of a content

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - id (integer()): Content ID
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec content_status_id_get(Tesla.Env.client, integer(), keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def content_status_id_get(connection, id, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/content/status/#{id}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end
end
