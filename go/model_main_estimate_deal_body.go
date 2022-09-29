/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type MainEstimateDealBody struct {
	DurationBlks int32 `json:"durationBlks,omitempty"`
	Replication int32 `json:"replication,omitempty"`
	Size int32 `json:"size,omitempty"`
	Verified bool `json:"verified,omitempty"`
}
