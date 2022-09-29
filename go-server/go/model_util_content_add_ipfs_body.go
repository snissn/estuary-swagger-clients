/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type UtilContentAddIpfsBody struct {

	Coluuid string `json:"coluuid,omitempty"`

	Dir string `json:"dir,omitempty"`

	Filename string `json:"filename,omitempty"`

	Peers []string `json:"peers,omitempty"`

	Root string `json:"root,omitempty"`
}
