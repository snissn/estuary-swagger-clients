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
pub struct UtilHttpError {
  #[serde(rename = "code")]
  code: Option<i32>,
  #[serde(rename = "details")]
  details: Option<String>,
  #[serde(rename = "reason")]
  reason: Option<String>
}

impl UtilHttpError {
  pub fn new() -> UtilHttpError {
    UtilHttpError {
      code: None,
      details: None,
      reason: None
    }
  }

  pub fn set_code(&mut self, code: i32) {
    self.code = Some(code);
  }

  pub fn with_code(mut self, code: i32) -> UtilHttpError {
    self.code = Some(code);
    self
  }

  pub fn code(&self) -> Option<&i32> {
    self.code.as_ref()
  }

  pub fn reset_code(&mut self) {
    self.code = None;
  }

  pub fn set_details(&mut self, details: String) {
    self.details = Some(details);
  }

  pub fn with_details(mut self, details: String) -> UtilHttpError {
    self.details = Some(details);
    self
  }

  pub fn details(&self) -> Option<&String> {
    self.details.as_ref()
  }

  pub fn reset_details(&mut self) {
    self.details = None;
  }

  pub fn set_reason(&mut self, reason: String) {
    self.reason = Some(reason);
  }

  pub fn with_reason(mut self, reason: String) -> UtilHttpError {
    self.reason = Some(reason);
    self
  }

  pub fn reason(&self) -> Option<&String> {
    self.reason.as_ref()
  }

  pub fn reset_reason(&mut self) {
    self.reason = None;
  }

}



