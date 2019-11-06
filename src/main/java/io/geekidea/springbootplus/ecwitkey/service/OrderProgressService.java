package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.OrderProgress;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.OrderProgressQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderProgressQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 订单项目进度信息 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface OrderProgressService extends BaseService<OrderProgress> {

    /**
     * 保存
     *
     * @param orderProgress
     * @return
     * @throws Exception
     */
    boolean saveOrderProgress(OrderProgress orderProgress) throws Exception;

    /**
     * 修改
     *
     * @param orderProgress
     * @return
     * @throws Exception
     */
    boolean updateOrderProgress(OrderProgress orderProgress) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteOrderProgress(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    OrderProgressQueryVo getOrderProgressById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param orderProgressQueryParam
     * @return
     * @throws Exception
     */
    Paging<OrderProgressQueryVo> getOrderProgressPageList(OrderProgressQueryParam orderProgressQueryParam) throws Exception;

}
