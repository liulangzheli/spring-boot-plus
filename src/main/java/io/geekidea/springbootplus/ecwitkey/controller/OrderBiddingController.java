package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.OrderBidding;
import io.geekidea.springbootplus.ecwitkey.service.OrderBiddingService;
import io.geekidea.springbootplus.ecwitkey.param.OrderBiddingQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderBiddingQueryVo;
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
 * 订单竞标信息 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/orderBidding")
@Api("订单竞标信息 API")
public class OrderBiddingController extends BaseController {

    @Autowired
    private OrderBiddingService orderBiddingService;

    /**
     * 添加订单竞标信息
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加OrderBidding对象", notes = "添加订单竞标信息", response = ApiResult.class)
    public ApiResult<Boolean> addOrderBidding(@Valid @RequestBody OrderBidding orderBidding) throws Exception {
        boolean flag = orderBiddingService.saveOrderBidding(orderBidding);
        return ApiResult.result(flag);
    }

    /**
     * 修改订单竞标信息
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改OrderBidding对象", notes = "修改订单竞标信息", response = ApiResult.class)
    public ApiResult<Boolean> updateOrderBidding(@Valid @RequestBody OrderBidding orderBidding) throws Exception {
        boolean flag = orderBiddingService.updateOrderBidding(orderBidding);
        return ApiResult.result(flag);
    }

    /**
     * 删除订单竞标信息
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除OrderBidding对象", notes = "删除订单竞标信息", response = ApiResult.class)
    public ApiResult<Boolean> deleteOrderBidding(@PathVariable("id") Long id) throws Exception {
        boolean flag = orderBiddingService.deleteOrderBidding(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取订单竞标信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取OrderBidding对象详情", notes = "查看订单竞标信息", response = OrderBiddingQueryVo.class)
    public ApiResult<OrderBiddingQueryVo> getOrderBidding(@PathVariable("id") Long id) throws Exception {
        OrderBiddingQueryVo orderBiddingQueryVo = orderBiddingService.getOrderBiddingById(id);
        return ApiResult.ok(orderBiddingQueryVo);
    }

    /**
     * 订单竞标信息分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取OrderBidding分页列表", notes = "订单竞标信息分页列表", response = OrderBiddingQueryVo.class)
    public ApiResult<Paging<OrderBiddingQueryVo>> getOrderBiddingPageList(@Valid @RequestBody OrderBiddingQueryParam orderBiddingQueryParam) throws Exception {
        Paging<OrderBiddingQueryVo> paging = orderBiddingService.getOrderBiddingPageList(orderBiddingQueryParam);
        return ApiResult.ok(paging);
    }

}

