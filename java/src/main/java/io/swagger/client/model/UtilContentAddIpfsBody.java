/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UtilContentAddIpfsBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:43:07.170Z")
public class UtilContentAddIpfsBody {
  @SerializedName("coluuid")
  private String coluuid = null;

  @SerializedName("dir")
  private String dir = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("peers")
  private List<String> peers = null;

  @SerializedName("root")
  private String root = null;

  public UtilContentAddIpfsBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

   /**
   * Get coluuid
   * @return coluuid
  **/
  @ApiModelProperty(value = "")
  public String getColuuid() {
    return coluuid;
  }

  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  public UtilContentAddIpfsBody dir(String dir) {
    this.dir = dir;
    return this;
  }

   /**
   * Get dir
   * @return dir
  **/
  @ApiModelProperty(value = "")
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public UtilContentAddIpfsBody filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public UtilContentAddIpfsBody peers(List<String> peers) {
    this.peers = peers;
    return this;
  }

  public UtilContentAddIpfsBody addPeersItem(String peersItem) {
    if (this.peers == null) {
      this.peers = new ArrayList<String>();
    }
    this.peers.add(peersItem);
    return this;
  }

   /**
   * Get peers
   * @return peers
  **/
  @ApiModelProperty(value = "")
  public List<String> getPeers() {
    return peers;
  }

  public void setPeers(List<String> peers) {
    this.peers = peers;
  }

  public UtilContentAddIpfsBody root(String root) {
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  @ApiModelProperty(value = "")
  public String getRoot() {
    return root;
  }

  public void setRoot(String root) {
    this.root = root;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilContentAddIpfsBody utilContentAddIpfsBody = (UtilContentAddIpfsBody) o;
    return Objects.equals(this.coluuid, utilContentAddIpfsBody.coluuid) &&
        Objects.equals(this.dir, utilContentAddIpfsBody.dir) &&
        Objects.equals(this.filename, utilContentAddIpfsBody.filename) &&
        Objects.equals(this.peers, utilContentAddIpfsBody.peers) &&
        Objects.equals(this.root, utilContentAddIpfsBody.root);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coluuid, dir, filename, peers, root);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContentAddIpfsBody {\n");
    
    sb.append("    coluuid: ").append(toIndentedString(coluuid)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

