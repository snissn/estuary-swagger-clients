package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class UtilContentAddResponse {

    String cid = null

    Integer estuaryId = null

    List<String> providers = new ArrayList<String>()

    String retrievalUrl = null
  

}

