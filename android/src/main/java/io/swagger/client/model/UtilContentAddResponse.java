/**
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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UtilContentAddResponse {
  
  @SerializedName("cid")
  private String cid = null;
  @SerializedName("estuaryId")
  private Integer estuaryId = null;
  @SerializedName("providers")
  private List<String> providers = null;
  @SerializedName("retrieval_url")
  private String retrievalUrl = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEstuaryId() {
    return estuaryId;
  }
  public void setEstuaryId(Integer estuaryId) {
    this.estuaryId = estuaryId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getProviders() {
    return providers;
  }
  public void setProviders(List<String> providers) {
    this.providers = providers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRetrievalUrl() {
    return retrievalUrl;
  }
  public void setRetrievalUrl(String retrievalUrl) {
    this.retrievalUrl = retrievalUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilContentAddResponse utilContentAddResponse = (UtilContentAddResponse) o;
    return (this.cid == null ? utilContentAddResponse.cid == null : this.cid.equals(utilContentAddResponse.cid)) &&
        (this.estuaryId == null ? utilContentAddResponse.estuaryId == null : this.estuaryId.equals(utilContentAddResponse.estuaryId)) &&
        (this.providers == null ? utilContentAddResponse.providers == null : this.providers.equals(utilContentAddResponse.providers)) &&
        (this.retrievalUrl == null ? utilContentAddResponse.retrievalUrl == null : this.retrievalUrl.equals(utilContentAddResponse.retrievalUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cid == null ? 0: this.cid.hashCode());
    result = 31 * result + (this.estuaryId == null ? 0: this.estuaryId.hashCode());
    result = 31 * result + (this.providers == null ? 0: this.providers.hashCode());
    result = 31 * result + (this.retrievalUrl == null ? 0: this.retrievalUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContentAddResponse {\n");
    
    sb.append("  cid: ").append(cid).append("\n");
    sb.append("  estuaryId: ").append(estuaryId).append("\n");
    sb.append("  providers: ").append(providers).append("\n");
    sb.append("  retrievalUrl: ").append(retrievalUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}