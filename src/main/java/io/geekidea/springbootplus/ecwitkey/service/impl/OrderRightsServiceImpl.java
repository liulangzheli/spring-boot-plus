package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.OrderRights;
import io.geekidea.springbootplus.ecwitkey.mapper.OrderRightsMapper;
import io.geekidea.springbootplus.ecwitkey.service.OrderRightsService;
import io.geekidea.springbootplus.ecwitkey.param.OrderRightsQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderRightsQueryVo;
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
 * 订单维权 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class OrderRightsServiceImpl extends BaseServiceImpl<OrderRightsMapper, OrderRights> implements OrderRightsService {

    @Autowired
    private OrderRightsMapper orderRightsMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrderRights(OrderRights orderRights) throws Exception {
        return super.save(orderRights);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateOrderRights(OrderRights orderRights) throws Exception {
        return super.updateById(orderRights);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteOrderRights(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public OrderRightsQueryVo getOrderRightsById(Serializable id) throws Exception {
        return orderRightsMapper.getOrderRightsById(id);
    }

    @Override
    public Paging<OrderRightsQueryVo> getOrderRightsPageList(OrderRightsQueryParam orderRightsQueryParam) throws Exception {
        Page page = setPageParam(orderRightsQueryParam, OrderItem.desc("create_time"));
        IPage<OrderRightsQueryVo> iPage = orderRightsMapper.getOrderRightsPageList(page, orderRightsQueryParam);
        return new Paging(iPage);
    }

}
