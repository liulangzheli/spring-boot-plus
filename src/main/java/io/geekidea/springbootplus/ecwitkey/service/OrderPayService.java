package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.OrderPay;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.OrderPayQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderPayQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 订单付款信息 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface OrderPayService extends BaseService<OrderPay> {

    /**
     * 保存
     *
     * @param orderPay
     * @return
     * @throws Exception
     */
    boolean saveOrderPay(OrderPay orderPay) throws Exception;

    /**
     * 修改
     *
     * @param orderPay
     * @return
     * @throws Exception
     */
    boolean updateOrderPay(OrderPay orderPay) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteOrderPay(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    OrderPayQueryVo getOrderPayById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param orderPayQueryParam
     * @return
     * @throws Exception
     */
    Paging<OrderPayQueryVo> getOrderPayPageList(OrderPayQueryParam orderPayQueryParam) throws Exception;

}
