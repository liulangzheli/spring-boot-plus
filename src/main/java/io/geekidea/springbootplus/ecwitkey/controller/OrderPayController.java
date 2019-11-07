package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.OrderPay;
import io.geekidea.springbootplus.ecwitkey.service.OrderPayService;
import io.geekidea.springbootplus.ecwitkey.param.OrderPayQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderPayQueryVo;
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
 * 订单付款信息 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/orderPay")
@Api("订单付款信息 API")
public class OrderPayController extends BaseController {

    @Autowired
    private OrderPayService orderPayService;

    /**
     * 添加订单付款信息
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加OrderPay对象", notes = "添加订单付款信息", response = ApiResult.class)
    public ApiResult<Boolean> addOrderPay(@Valid @RequestBody OrderPay orderPay) throws Exception {
        boolean flag = orderPayService.saveOrderPay(orderPay);
        return ApiResult.result(flag);
    }

    /**
     * 修改订单付款信息
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改OrderPay对象", notes = "修改订单付款信息", response = ApiResult.class)
    public ApiResult<Boolean> updateOrderPay(@Valid @RequestBody OrderPay orderPay) throws Exception {
        boolean flag = orderPayService.updateOrderPay(orderPay);
        return ApiResult.result(flag);
    }

    /**
     * 删除订单付款信息
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除OrderPay对象", notes = "删除订单付款信息", response = ApiResult.class)
    public ApiResult<Boolean> deleteOrderPay(@PathVariable("id") Long id) throws Exception {
        boolean flag = orderPayService.deleteOrderPay(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取订单付款信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取OrderPay对象详情", notes = "查看订单付款信息", response = OrderPayQueryVo.class)
    public ApiResult<OrderPayQueryVo> getOrderPay(@PathVariable("id") Long id) throws Exception {
        OrderPayQueryVo orderPayQueryVo = orderPayService.getOrderPayById(id);
        return ApiResult.ok(orderPayQueryVo);
    }

    /**
     * 订单付款信息分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取OrderPay分页列表", notes = "订单付款信息分页列表", response = OrderPayQueryVo.class)
    public ApiResult<Paging<OrderPayQueryVo>> getOrderPayPageList(@Valid @RequestBody OrderPayQueryParam orderPayQueryParam) throws Exception {
        Paging<OrderPayQueryVo> paging = orderPayService.getOrderPayPageList(orderPayQueryParam);
        return ApiResult.ok(paging);
    }

}

