/* 
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct UtilContentAddResponse {
  #[serde(rename = "cid")]
  cid: Option<String>,
  #[serde(rename = "estuaryId")]
  estuary_id: Option<i32>,
  #[serde(rename = "providers")]
  providers: Option<Vec<String>>,
  #[serde(rename = "retrieval_url")]
  retrieval_url: Option<String>
}

impl UtilContentAddResponse {
  pub fn new() -> UtilContentAddResponse {
    UtilContentAddResponse {
      cid: None,
      estuary_id: None,
      providers: None,
      retrieval_url: None
    }
  }

  pub fn set_cid(&mut self, cid: String) {
    self.cid = Some(cid);
  }

  pub fn with_cid(mut self, cid: String) -> UtilContentAddResponse {
    self.cid = Some(cid);
    self
  }

  pub fn cid(&self) -> Option<&String> {
    self.cid.as_ref()
  }

  pub fn reset_cid(&mut self) {
    self.cid = None;
  }

  pub fn set_estuary_id(&mut self, estuary_id: i32) {
    self.estuary_id = Some(estuary_id);
  }

  pub fn with_estuary_id(mut self, estuary_id: i32) -> UtilContentAddResponse {
    self.estuary_id = Some(estuary_id);
    self
  }

  pub fn estuary_id(&self) -> Option<&i32> {
    self.estuary_id.as_ref()
  }

  pub fn reset_estuary_id(&mut self) {
    self.estuary_id = None;
  }

  pub fn set_providers(&mut self, providers: Vec<String>) {
    self.providers = Some(providers);
  }

  pub fn with_providers(mut self, providers: Vec<String>) -> UtilContentAddResponse {
    self.providers = Some(providers);
    self
  }

  pub fn providers(&self) -> Option<&Vec<String>> {
    self.providers.as_ref()
  }

  pub fn reset_providers(&mut self) {
    self.providers = None;
  }

  pub fn set_retrieval_url(&mut self, retrieval_url: String) {
    self.retrieval_url = Some(retrieval_url);
  }

  pub fn with_retrieval_url(mut self, retrieval_url: String) -> UtilContentAddResponse {
    self.retrieval_url = Some(retrieval_url);
    self
  }

  pub fn retrieval_url(&self) -> Option<&String> {
    self.retrieval_url.as_ref()
  }

  pub fn reset_retrieval_url(&mut self) {
    self.retrieval_url = None;
  }

}



