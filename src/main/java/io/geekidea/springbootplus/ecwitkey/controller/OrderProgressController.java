package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.OrderProgress;
import io.geekidea.springbootplus.ecwitkey.service.OrderProgressService;
import io.geekidea.springbootplus.ecwitkey.param.OrderProgressQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderProgressQueryVo;
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
 * 订单项目进度信息 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/orderProgress")
@Api("订单项目进度信息 API")
public class OrderProgressController extends BaseController {

    @Autowired
    private OrderProgressService orderProgressService;

    /**
     * 添加订单项目进度信息
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加OrderProgress对象", notes = "添加订单项目进度信息", response = ApiResult.class)
    public ApiResult<Boolean> addOrderProgress(@Valid @RequestBody OrderProgress orderProgress) throws Exception {
        boolean flag = orderProgressService.saveOrderProgress(orderProgress);
        return ApiResult.result(flag);
    }

    /**
     * 修改订单项目进度信息
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改OrderProgress对象", notes = "修改订单项目进度信息", response = ApiResult.class)
    public ApiResult<Boolean> updateOrderProgress(@Valid @RequestBody OrderProgress orderProgress) throws Exception {
        boolean flag = orderProgressService.updateOrderProgress(orderProgress);
        return ApiResult.result(flag);
    }

    /**
     * 删除订单项目进度信息
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除OrderProgress对象", notes = "删除订单项目进度信息", response = ApiResult.class)
    public ApiResult<Boolean> deleteOrderProgress(@PathVariable("id") Long id) throws Exception {
        boolean flag = orderProgressService.deleteOrderProgress(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取订单项目进度信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取OrderProgress对象详情", notes = "查看订单项目进度信息", response = OrderProgressQueryVo.class)
    public ApiResult<OrderProgressQueryVo> getOrderProgress(@PathVariable("id") Long id) throws Exception {
        OrderProgressQueryVo orderProgressQueryVo = orderProgressService.getOrderProgressById(id);
        return ApiResult.ok(orderProgressQueryVo);
    }

    /**
     * 订单项目进度信息分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取OrderProgress分页列表", notes = "订单项目进度信息分页列表", response = OrderProgressQueryVo.class)
    public ApiResult<Paging<OrderProgressQueryVo>> getOrderProgressPageList(@Valid @RequestBody OrderProgressQueryParam orderProgressQueryParam) throws Exception {
        Paging<OrderProgressQueryVo> paging = orderProgressService.getOrderProgressPageList(orderProgressQueryParam);
        return ApiResult.ok(paging);
    }

}

