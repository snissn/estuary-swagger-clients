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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MainEstimateDealBody {
  
  @SerializedName("durationBlks")
  private Integer durationBlks = null;
  @SerializedName("replication")
  private Integer replication = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("verified")
  private Boolean verified = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDurationBlks() {
    return durationBlks;
  }
  public void setDurationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getReplication() {
    return replication;
  }
  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainEstimateDealBody mainEstimateDealBody = (MainEstimateDealBody) o;
    return (this.durationBlks == null ? mainEstimateDealBody.durationBlks == null : this.durationBlks.equals(mainEstimateDealBody.durationBlks)) &&
        (this.replication == null ? mainEstimateDealBody.replication == null : this.replication.equals(mainEstimateDealBody.replication)) &&
        (this.size == null ? mainEstimateDealBody.size == null : this.size.equals(mainEstimateDealBody.size)) &&
        (this.verified == null ? mainEstimateDealBody.verified == null : this.verified.equals(mainEstimateDealBody.verified));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.durationBlks == null ? 0: this.durationBlks.hashCode());
    result = 31 * result + (this.replication == null ? 0: this.replication.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.verified == null ? 0: this.verified.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainEstimateDealBody {\n");
    
    sb.append("  durationBlks: ").append(durationBlks).append("\n");
    sb.append("  replication: ").append(replication).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  verified: ").append(verified).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
