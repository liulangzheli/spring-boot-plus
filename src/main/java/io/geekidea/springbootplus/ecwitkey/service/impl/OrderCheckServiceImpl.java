package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.OrderCheck;
import io.geekidea.springbootplus.ecwitkey.mapper.OrderCheckMapper;
import io.geekidea.springbootplus.ecwitkey.service.OrderCheckService;
import io.geekidea.springbootplus.ecwitkey.param.OrderCheckQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderCheckQueryVo;
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
 * 订单验收信息 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class OrderCheckServiceImpl extends BaseServiceImpl<OrderCheckMapper, OrderCheck> implements OrderCheckService {

    @Autowired
    private OrderCheckMapper orderCheckMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrderCheck(OrderCheck orderCheck) throws Exception {
        return super.save(orderCheck);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateOrderCheck(OrderCheck orderCheck) throws Exception {
        return super.updateById(orderCheck);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteOrderCheck(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public OrderCheckQueryVo getOrderCheckById(Serializable id) throws Exception {
        return orderCheckMapper.getOrderCheckById(id);
    }

    @Override
    public Paging<OrderCheckQueryVo> getOrderCheckPageList(OrderCheckQueryParam orderCheckQueryParam) throws Exception {
        Page page = setPageParam(orderCheckQueryParam, OrderItem.desc("create_time"));
        IPage<OrderCheckQueryVo> iPage = orderCheckMapper.getOrderCheckPageList(page, orderCheckQueryParam);
        return new Paging(iPage);
    }

}
