package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.OrderComment;
import io.geekidea.springbootplus.ecwitkey.mapper.OrderCommentMapper;
import io.geekidea.springbootplus.ecwitkey.service.OrderCommentService;
import io.geekidea.springbootplus.ecwitkey.param.OrderCommentQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderCommentQueryVo;
import io.geekidea.springbootplus.common.service.impl.BaseServiceImpl;
import io.geekidea.springbootplus.common.vo.Paging;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;


/**
 * <pre>
 * 订单评价 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class OrderCommentServiceImpl extends BaseServiceImpl<OrderCommentMapper, OrderComment> implements OrderCommentService {

    @Autowired
    private OrderCommentMapper orderCommentMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrderComment(OrderComment orderComment) throws Exception {
        return super.save(orderComment);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateOrderComment(OrderComment orderComment) throws Exception {
        return super.updateById(orderComment);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteOrderComment(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public OrderCommentQueryVo getOrderCommentById(Serializable id) throws Exception {
        return orderCommentMapper.getOrderCommentById(id);
    }

    @Override
    public Paging<OrderCommentQueryVo> getOrderCommentPageList(OrderCommentQueryParam orderCommentQueryParam) throws Exception {
        Page page = setPageParam(orderCommentQueryParam, OrderItem.desc("create_time"));
        IPage<OrderCommentQueryVo> iPage = orderCommentMapper.getOrderCommentPageList(page, orderCommentQueryParam);
        return new Paging(iPage);
    }

}
