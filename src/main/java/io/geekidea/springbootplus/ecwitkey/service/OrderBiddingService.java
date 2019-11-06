package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.OrderBidding;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.OrderBiddingQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderBiddingQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 订单竞标信息 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface OrderBiddingService extends BaseService<OrderBidding> {

    /**
     * 保存
     *
     * @param orderBidding
     * @return
     * @throws Exception
     */
    boolean saveOrderBidding(OrderBidding orderBidding) throws Exception;

    /**
     * 修改
     *
     * @param orderBidding
     * @return
     * @throws Exception
     */
    boolean updateOrderBidding(OrderBidding orderBidding) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteOrderBidding(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    OrderBiddingQueryVo getOrderBiddingById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param orderBiddingQueryParam
     * @return
     * @throws Exception
     */
    Paging<OrderBiddingQueryVo> getOrderBiddingPageList(OrderBiddingQueryParam orderBiddingQueryParam) throws Exception;

}
