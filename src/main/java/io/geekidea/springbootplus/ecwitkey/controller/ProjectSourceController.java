package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectSource;
import io.geekidea.springbootplus.ecwitkey.service.ProjectSourceService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectSourceQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectSourceQueryVo;
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
 * 项目资料 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/projectSource")
@Api("项目资料 API")
public class ProjectSourceController extends BaseController {

    @Autowired
    private ProjectSourceService projectSourceService;

    /**
     * 添加项目资料
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加ProjectSource对象", notes = "添加项目资料", response = ApiResult.class)
    public ApiResult<Boolean> addProjectSource(@Valid @RequestBody ProjectSource projectSource) throws Exception {
        boolean flag = projectSourceService.saveProjectSource(projectSource);
        return ApiResult.result(flag);
    }

    /**
     * 修改项目资料
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改ProjectSource对象", notes = "修改项目资料", response = ApiResult.class)
    public ApiResult<Boolean> updateProjectSource(@Valid @RequestBody ProjectSource projectSource) throws Exception {
        boolean flag = projectSourceService.updateProjectSource(projectSource);
        return ApiResult.result(flag);
    }

    /**
     * 删除项目资料
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除ProjectSource对象", notes = "删除项目资料", response = ApiResult.class)
    public ApiResult<Boolean> deleteProjectSource(@PathVariable("id") Long id) throws Exception {
        boolean flag = projectSourceService.deleteProjectSource(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取项目资料
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取ProjectSource对象详情", notes = "查看项目资料", response = ProjectSourceQueryVo.class)
    public ApiResult<ProjectSourceQueryVo> getProjectSource(@PathVariable("id") Long id) throws Exception {
        ProjectSourceQueryVo projectSourceQueryVo = projectSourceService.getProjectSourceById(id);
        return ApiResult.ok(projectSourceQueryVo);
    }

    /**
     * 项目资料分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取ProjectSource分页列表", notes = "项目资料分页列表", response = ProjectSourceQueryVo.class)
    public ApiResult<Paging<ProjectSourceQueryVo>> getProjectSourcePageList(@Valid @RequestBody ProjectSourceQueryParam projectSourceQueryParam) throws Exception {
        Paging<ProjectSourceQueryVo> paging = projectSourceService.getProjectSourcePageList(projectSourceQueryParam);
        return ApiResult.ok(paging);
    }

}

