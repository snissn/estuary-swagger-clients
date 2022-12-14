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
public class MainGetApiKeysResp {
  
  @SerializedName("expiry")
  private String expiry = null;
  @SerializedName("token")
  private String token = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExpiry() {
    return expiry;
  }
  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainGetApiKeysResp mainGetApiKeysResp = (MainGetApiKeysResp) o;
    return (this.expiry == null ? mainGetApiKeysResp.expiry == null : this.expiry.equals(mainGetApiKeysResp.expiry)) &&
        (this.token == null ? mainGetApiKeysResp.token == null : this.token.equals(mainGetApiKeysResp.token));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.expiry == null ? 0: this.expiry.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainGetApiKeysResp {\n");
    
    sb.append("  expiry: ").append(expiry).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
