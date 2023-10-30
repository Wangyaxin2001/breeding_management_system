package com.yaxin.product_source.controller;

import com.yaxin.product_source.pojo.DiseaseRecord;
import com.yaxin.product_source.pojo.ManagerDisease;
import com.yaxin.product_source.pojo.ext.DiseaseRecordExt;
import com.yaxin.product_source.result.Result;
import com.yaxin.product_source.service.DiseaseRecordService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "病症记录模块")
@RestController
@RequestMapping("/diseaseRecord")
public class DiseaseController {

    @Autowired
    private DiseaseRecordService diseaseRecordService;

    @ApiOperation("分页多条件查询病症记录")
    @GetMapping
    public Result getAnimalRelated(Integer pageNum, Integer pageSize, String drStatus, Integer drDId) {
        PageInfo<DiseaseRecordExt> result = diseaseRecordService.findByPage(pageNum, pageSize, drStatus, drDId);
        return Result.success(result);
    }

    @ApiOperation("查询所有病症类型信息")
    @GetMapping("/queryAllDisease")
    public Result getAnimalRelated() {
        List<ManagerDisease> result = diseaseRecordService.findAll();
        return Result.success(result);
    }

    @ApiOperation("新增或更新病症记录接口")
    @PostMapping("/saveOrUpdate")
    public Result reviseDiseaseRecord(@RequestBody DiseaseRecord record) {
        diseaseRecordService.saveOrUpdate(record);
        return Result.success();
    }
}
