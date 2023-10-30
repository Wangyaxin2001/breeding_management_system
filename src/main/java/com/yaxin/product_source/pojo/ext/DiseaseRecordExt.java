package com.yaxin.product_source.pojo.ext;

import com.yaxin.product_source.pojo.DiseaseRecord;
import com.yaxin.product_source.pojo.ManagerDisease;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DiseaseRecordExt extends DiseaseRecord {
    @JsonProperty("disease")
    private ManagerDisease disease;
}
