package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.OrderBidding;
import io.geekidea.springbootplus.ecwitkey.mapper.OrderBiddingMapper;
import io.geekidea.springbootplus.ecwitkey.service.OrderBiddingService;
import io.geekidea.springbootplus.ecwitkey.param.OrderBiddingQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderBiddingQueryVo;
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
 * 订单竞标信息 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class OrderBiddingServiceImpl extends BaseServiceImpl<OrderBiddingMapper, OrderBidding> implements OrderBiddingService {

    @Autowired
    private OrderBiddingMapper orderBiddingMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrderBidding(OrderBidding orderBidding) throws Exception {
        return super.save(orderBidding);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateOrderBidding(OrderBidding orderBidding) throws Exception {
        return super.updateById(orderBidding);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteOrderBidding(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public OrderBiddingQueryVo getOrderBiddingById(Serializable id) throws Exception {
        return orderBiddingMapper.getOrderBiddingById(id);
    }

    @Override
    public Paging<OrderBiddingQueryVo> getOrderBiddingPageList(OrderBiddingQueryParam orderBiddingQueryParam) throws Exception {
        Page page = setPageParam(orderBiddingQueryParam, OrderItem.desc("create_time"));
        IPage<OrderBiddingQueryVo> iPage = orderBiddingMapper.getOrderBiddingPageList(page, orderBiddingQueryParam);
        return new Paging(iPage);
    }

}
