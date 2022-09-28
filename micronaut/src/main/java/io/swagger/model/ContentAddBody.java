package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContentAddBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-09-27T20:40:53.180766-10:00[Pacific/Honolulu]")
public class ContentAddBody   {
  @JsonProperty("file")
  private File file = null;

  public ContentAddBody file(File file) {
    this.file = file;
    return this;
  }

  /**
   * File to upload
   * @return file
  **/
  @Schema(required = true, description = "File to upload")
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
    return Objects.equals(this.file, contentAddBody.file);
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
