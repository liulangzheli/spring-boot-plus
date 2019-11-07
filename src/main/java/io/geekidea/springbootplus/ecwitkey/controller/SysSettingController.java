package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.SysSetting;
import io.geekidea.springbootplus.ecwitkey.service.SysSettingService;
import io.geekidea.springbootplus.ecwitkey.param.SysSettingQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.SysSettingQueryVo;
import io.geekidea.springbootplus.common.api.ApiResult;
import io.geekidea.springbootplus.common.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

import io.geekidea.springbootplus.common.vo.Paging;
import io.geekidea.springbootplus.common.param.IdParam;

/**
 * <pre>
 * 系统设置 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/sysSetting")
@Api("系统设置 API")
public class SysSettingController extends BaseController {

    @Autowired
    private SysSettingService sysSettingService;

    /**
     * 添加系统设置
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加SysSetting对象", notes = "添加系统设置", response = ApiResult.class)
    public ApiResult<Boolean> addSysSetting(@Valid @RequestBody SysSetting sysSetting) throws Exception {
        boolean flag = sysSettingService.saveSysSetting(sysSetting);
        return ApiResult.result(flag);
    }

    /**
     * 修改系统设置
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改SysSetting对象", notes = "修改系统设置", response = ApiResult.class)
    public ApiResult<Boolean> updateSysSetting(@Valid @RequestBody SysSetting sysSetting) throws Exception {
        boolean flag = sysSettingService.updateSysSetting(sysSetting);
        return ApiResult.result(flag);
    }

    /**
     * 删除系统设置
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除SysSetting对象", notes = "删除系统设置", response = ApiResult.class)
    public ApiResult<Boolean> deleteSysSetting(@PathVariable("id") Long id) throws Exception {
        boolean flag = sysSettingService.deleteSysSetting(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取系统设置
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取SysSetting对象详情", notes = "查看系统设置", response = SysSettingQueryVo.class)
    public ApiResult<SysSettingQueryVo> getSysSetting(@PathVariable("id") Long id) throws Exception {
        SysSettingQueryVo sysSettingQueryVo = sysSettingService.getSysSettingById(id);
        return ApiResult.ok(sysSettingQueryVo);
    }

    /**
     * 系统设置分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取SysSetting分页列表", notes = "系统设置分页列表", response = SysSettingQueryVo.class)
    public ApiResult<Paging<SysSettingQueryVo>> getSysSettingPageList(@Valid @RequestBody SysSettingQueryParam sysSettingQueryParam) throws Exception {
        Paging<SysSettingQueryVo> paging = sysSettingService.getSysSettingPageList(sysSettingQueryParam);
        return ApiResult.ok(paging);
    }

}

