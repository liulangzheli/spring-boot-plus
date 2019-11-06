package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.OrderPay;
import io.geekidea.springbootplus.ecwitkey.mapper.OrderPayMapper;
import io.geekidea.springbootplus.ecwitkey.service.OrderPayService;
import io.geekidea.springbootplus.ecwitkey.param.OrderPayQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderPayQueryVo;
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
 * 订单付款信息 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class OrderPayServiceImpl extends BaseServiceImpl<OrderPayMapper, OrderPay> implements OrderPayService {

    @Autowired
    private OrderPayMapper orderPayMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrderPay(OrderPay orderPay) throws Exception {
        return super.save(orderPay);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateOrderPay(OrderPay orderPay) throws Exception {
        return super.updateById(orderPay);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteOrderPay(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public OrderPayQueryVo getOrderPayById(Serializable id) throws Exception {
        return orderPayMapper.getOrderPayById(id);
    }

    @Override
    public Paging<OrderPayQueryVo> getOrderPayPageList(OrderPayQueryParam orderPayQueryParam) throws Exception {
        Page page = setPageParam(orderPayQueryParam, OrderItem.desc("create_time"));
        IPage<OrderPayQueryVo> iPage = orderPayMapper.getOrderPayPageList(page, orderPayQueryParam);
        return new Paging(iPage);
    }

}
