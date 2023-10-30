package com.yaxin.product_source.pojo.ext;

import com.yaxin.product_source.pojo.ManagerFenceHouse;
import com.yaxin.product_source.pojo.ManagerHurdles;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ManagerHurdlesExt extends ManagerHurdles {
    @JsonProperty("managerFenceHouse")
    private ManagerFenceHouse managerFenceHouse;
}
