/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type UtilContentAddResponse struct {

	Cid string `json:"cid,omitempty"`

	EstuaryId int32 `json:"estuaryId,omitempty"`

	Providers []string `json:"providers,omitempty"`

	RetrievalUrl string `json:"retrieval_url,omitempty"`
}
