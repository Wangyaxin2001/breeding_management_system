package com.yaxin.product_source.controller;

import com.yaxin.product_source.pojo.QuarantineRegistration;
import com.yaxin.product_source.result.Result;
import com.yaxin.product_source.service.QuarantineRegistrationService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "检疫登记模块")
@RestController
@RequestMapping("/quarantineRegistration")
public class QuarantineController {

    @Autowired
    private QuarantineRegistrationService quarantineRegistrationService;

    @ApiOperation("分页多条件查询检疫记录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum",value = "当前页码"),
            @ApiImplicitParam(name = "pageSize",value = "每页大小"),
            @ApiImplicitParam(name = "grMechanism",value = "检疫机构"),
            @ApiImplicitParam(name = "bQualified",value = "检疫结果")
    })
    @GetMapping
    public Result queryByConditionsAndPage(Integer pageNum, Integer pageSize, String grMechanism, String bQualified) {
        PageInfo<QuarantineRegistration> result = quarantineRegistrationService.findByPage(pageNum, pageSize, grMechanism, bQualified);
        return Result.success(result);
    }

    @ApiOperation("新增或更新检疫记录接口")
    @PostMapping("/saveOrUpdate")
    public Result reviseRegistration(@RequestBody QuarantineRegistration qr) {
        quarantineRegistrationService.saveOrUpdate(qr);
        return Result.success();
    }
}
