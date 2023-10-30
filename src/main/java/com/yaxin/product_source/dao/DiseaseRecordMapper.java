package com.yaxin.product_source.dao;

import com.yaxin.product_source.pojo.DiseaseRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRecordMapper {
    int insert(DiseaseRecord record);
    DiseaseRecord selectByPrimaryKey(Integer drId);
    int updateByPrimaryKey(DiseaseRecord record);
}