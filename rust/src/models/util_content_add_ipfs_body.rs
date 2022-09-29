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
pub struct UtilContentAddIpfsBody {
  #[serde(rename = "coluuid")]
  coluuid: Option<String>,
  #[serde(rename = "dir")]
  dir: Option<String>,
  #[serde(rename = "filename")]
  filename: Option<String>,
  #[serde(rename = "peers")]
  peers: Option<Vec<String>>,
  #[serde(rename = "root")]
  root: Option<String>
}

impl UtilContentAddIpfsBody {
  pub fn new() -> UtilContentAddIpfsBody {
    UtilContentAddIpfsBody {
      coluuid: None,
      dir: None,
      filename: None,
      peers: None,
      root: None
    }
  }

  pub fn set_coluuid(&mut self, coluuid: String) {
    self.coluuid = Some(coluuid);
  }

  pub fn with_coluuid(mut self, coluuid: String) -> UtilContentAddIpfsBody {
    self.coluuid = Some(coluuid);
    self
  }

  pub fn coluuid(&self) -> Option<&String> {
    self.coluuid.as_ref()
  }

  pub fn reset_coluuid(&mut self) {
    self.coluuid = None;
  }

  pub fn set_dir(&mut self, dir: String) {
    self.dir = Some(dir);
  }

  pub fn with_dir(mut self, dir: String) -> UtilContentAddIpfsBody {
    self.dir = Some(dir);
    self
  }

  pub fn dir(&self) -> Option<&String> {
    self.dir.as_ref()
  }

  pub fn reset_dir(&mut self) {
    self.dir = None;
  }

  pub fn set_filename(&mut self, filename: String) {
    self.filename = Some(filename);
  }

  pub fn with_filename(mut self, filename: String) -> UtilContentAddIpfsBody {
    self.filename = Some(filename);
    self
  }

  pub fn filename(&self) -> Option<&String> {
    self.filename.as_ref()
  }

  pub fn reset_filename(&mut self) {
    self.filename = None;
  }

  pub fn set_peers(&mut self, peers: Vec<String>) {
    self.peers = Some(peers);
  }

  pub fn with_peers(mut self, peers: Vec<String>) -> UtilContentAddIpfsBody {
    self.peers = Some(peers);
    self
  }

  pub fn peers(&self) -> Option<&Vec<String>> {
    self.peers.as_ref()
  }

  pub fn reset_peers(&mut self) {
    self.peers = None;
  }

  pub fn set_root(&mut self, root: String) {
    self.root = Some(root);
  }

  pub fn with_root(mut self, root: String) -> UtilContentAddIpfsBody {
    self.root = Some(root);
    self
  }

  pub fn root(&self) -> Option<&String> {
    self.root.as_ref()
  }

  pub fn reset_root(&mut self) {
    self.root = None;
  }

}


