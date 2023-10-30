package com.yaxin.product_source.pojo.ext;

import com.yaxin.product_source.pojo.ManagerFenceHouse;
import com.yaxin.product_source.pojo.ManagerHurdles;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
public class ManagerFenceHouseExt extends ManagerFenceHouse {
    @JsonProperty("mhs")
    private List<ManagerHurdles> mhs;
}
