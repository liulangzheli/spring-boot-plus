package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectRequirement;
import io.geekidea.springbootplus.ecwitkey.service.ProjectRequirementService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectRequirementQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectRequirementQueryVo;
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
 * 项目类型要求 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/projectRequirement")
@Api("项目类型要求 API")
public class ProjectRequirementController extends BaseController {

    @Autowired
    private ProjectRequirementService projectRequirementService;

    /**
     * 添加项目类型要求
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加ProjectRequirement对象", notes = "添加项目类型要求", response = ApiResult.class)
    public ApiResult<Boolean> addProjectRequirement(@Valid @RequestBody ProjectRequirement projectRequirement) throws Exception {
        boolean flag = projectRequirementService.saveProjectRequirement(projectRequirement);
        return ApiResult.result(flag);
    }

    /**
     * 修改项目类型要求
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改ProjectRequirement对象", notes = "修改项目类型要求", response = ApiResult.class)
    public ApiResult<Boolean> updateProjectRequirement(@Valid @RequestBody ProjectRequirement projectRequirement) throws Exception {
        boolean flag = projectRequirementService.updateProjectRequirement(projectRequirement);
        return ApiResult.result(flag);
    }

    /**
     * 删除项目类型要求
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除ProjectRequirement对象", notes = "删除项目类型要求", response = ApiResult.class)
    public ApiResult<Boolean> deleteProjectRequirement(@PathVariable("id") Long id) throws Exception {
        boolean flag = projectRequirementService.deleteProjectRequirement(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取项目类型要求
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取ProjectRequirement对象详情", notes = "查看项目类型要求", response = ProjectRequirementQueryVo.class)
    public ApiResult<ProjectRequirementQueryVo> getProjectRequirement(@PathVariable("id") Long id) throws Exception {
        ProjectRequirementQueryVo projectRequirementQueryVo = projectRequirementService.getProjectRequirementById(id);
        return ApiResult.ok(projectRequirementQueryVo);
    }

    /**
     * 项目类型要求分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取ProjectRequirement分页列表", notes = "项目类型要求分页列表", response = ProjectRequirementQueryVo.class)
    public ApiResult<Paging<ProjectRequirementQueryVo>> getProjectRequirementPageList(@Valid @RequestBody ProjectRequirementQueryParam projectRequirementQueryParam) throws Exception {
        Paging<ProjectRequirementQueryVo> paging = projectRequirementService.getProjectRequirementPageList(projectRequirementQueryParam);
        return ApiResult.ok(paging);
    }

}

