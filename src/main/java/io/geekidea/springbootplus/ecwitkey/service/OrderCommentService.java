package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.OrderComment;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.OrderCommentQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderCommentQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 订单评价 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface OrderCommentService extends BaseService<OrderComment> {

    /**
     * 保存
     *
     * @param orderComment
     * @return
     * @throws Exception
     */
    boolean saveOrderComment(OrderComment orderComment) throws Exception;

    /**
     * 修改
     *
     * @param orderComment
     * @return
     * @throws Exception
     */
    boolean updateOrderComment(OrderComment orderComment) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteOrderComment(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    OrderCommentQueryVo getOrderCommentById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param orderCommentQueryParam
     * @return
     * @throws Exception
     */
    Paging<OrderCommentQueryVo> getOrderCommentPageList(OrderCommentQueryParam orderCommentQueryParam) throws Exception;

}
