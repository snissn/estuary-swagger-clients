package io.swagger.model;

import java.io.File;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class ContentAddBody   {
  
  @Schema(required = true, description = "File to upload")
 /**
   * File to upload  
  **/
  private File file = null;
 /**
   * File to upload
   * @return file
  **/
  @JsonProperty("file")
  @NotNull
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public ContentAddBody file(File file) {
    this.file = file;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
