package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-09-27T20:40:41.950348-10:00[Pacific/Honolulu]")public class MainGetApiKeysResp   {
  private String expiry = null;  private String token = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("expiry")
  public String getExpiry() {
    return expiry;
  }
  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainGetApiKeysResp mainGetApiKeysResp = (MainGetApiKeysResp) o;
    return Objects.equals(expiry, mainGetApiKeysResp.expiry) &&
        Objects.equals(token, mainGetApiKeysResp.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainGetApiKeysResp {\n");
    
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
