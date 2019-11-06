package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.OrderCheck;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.OrderCheckQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderCheckQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 订单验收信息 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface OrderCheckService extends BaseService<OrderCheck> {

    /**
     * 保存
     *
     * @param orderCheck
     * @return
     * @throws Exception
     */
    boolean saveOrderCheck(OrderCheck orderCheck) throws Exception;

    /**
     * 修改
     *
     * @param orderCheck
     * @return
     * @throws Exception
     */
    boolean updateOrderCheck(OrderCheck orderCheck) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteOrderCheck(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    OrderCheckQueryVo getOrderCheckById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param orderCheckQueryParam
     * @return
     * @throws Exception
     */
    Paging<OrderCheckQueryVo> getOrderCheckPageList(OrderCheckQueryParam orderCheckQueryParam) throws Exception;

}
