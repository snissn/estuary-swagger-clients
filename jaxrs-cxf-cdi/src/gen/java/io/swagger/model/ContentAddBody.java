package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.File;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ContentAddBody   {
  private File file = null;

  /**
   * File to upload
   **/
  public ContentAddBody file(File file) {
    this.file = file;
    return this;
  }

  
  
  @Schema(required = true, description = "File to upload")
  @JsonProperty("file")
  @NotNull
  @Valid
  public File getFile() {
    return file;
  }
  public void setFile(File file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentAddBody contentAddBody = (ContentAddBody) o;
    return Objects.equals(file, contentAddBody.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentAddBody {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
