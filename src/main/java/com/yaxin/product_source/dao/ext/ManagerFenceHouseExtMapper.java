package com.yaxin.product_source.dao.ext;

import com.yaxin.product_source.pojo.ext.ManagerFenceHouseExt;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerFenceHouseExtMapper {
    ManagerFenceHouseExt selectHouseAndHurdlesById(String fhId);
}