package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.OrderRights;
import io.geekidea.springbootplus.ecwitkey.service.OrderRightsService;
import io.geekidea.springbootplus.ecwitkey.param.OrderRightsQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderRightsQueryVo;
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
 * 订单维权 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/orderRights")
@Api("订单维权 API")
public class OrderRightsController extends BaseController {

    @Autowired
    private OrderRightsService orderRightsService;

    /**
     * 添加订单维权
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加OrderRights对象", notes = "添加订单维权", response = ApiResult.class)
    public ApiResult<Boolean> addOrderRights(@Valid @RequestBody OrderRights orderRights) throws Exception {
        boolean flag = orderRightsService.saveOrderRights(orderRights);
        return ApiResult.result(flag);
    }

    /**
     * 修改订单维权
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改OrderRights对象", notes = "修改订单维权", response = ApiResult.class)
    public ApiResult<Boolean> updateOrderRights(@Valid @RequestBody OrderRights orderRights) throws Exception {
        boolean flag = orderRightsService.updateOrderRights(orderRights);
        return ApiResult.result(flag);
    }

    /**
     * 删除订单维权
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除OrderRights对象", notes = "删除订单维权", response = ApiResult.class)
    public ApiResult<Boolean> deleteOrderRights(@PathVariable("id") Long id) throws Exception {
        boolean flag = orderRightsService.deleteOrderRights(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取订单维权
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取OrderRights对象详情", notes = "查看订单维权", response = OrderRightsQueryVo.class)
    public ApiResult<OrderRightsQueryVo> getOrderRights(@PathVariable("id") Long id) throws Exception {
        OrderRightsQueryVo orderRightsQueryVo = orderRightsService.getOrderRightsById(id);
        return ApiResult.ok(orderRightsQueryVo);
    }

    /**
     * 订单维权分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取OrderRights分页列表", notes = "订单维权分页列表", response = OrderRightsQueryVo.class)
    public ApiResult<Paging<OrderRightsQueryVo>> getOrderRightsPageList(@Valid @RequestBody OrderRightsQueryParam orderRightsQueryParam) throws Exception {
        Paging<OrderRightsQueryVo> paging = orderRightsService.getOrderRightsPageList(orderRightsQueryParam);
        return ApiResult.ok(paging);
    }

}

