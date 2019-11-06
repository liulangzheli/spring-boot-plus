package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.OrderProgress;
import io.geekidea.springbootplus.ecwitkey.mapper.OrderProgressMapper;
import io.geekidea.springbootplus.ecwitkey.service.OrderProgressService;
import io.geekidea.springbootplus.ecwitkey.param.OrderProgressQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderProgressQueryVo;
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
 * 订单项目进度信息 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class OrderProgressServiceImpl extends BaseServiceImpl<OrderProgressMapper, OrderProgress> implements OrderProgressService {

    @Autowired
    private OrderProgressMapper orderProgressMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrderProgress(OrderProgress orderProgress) throws Exception {
        return super.save(orderProgress);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateOrderProgress(OrderProgress orderProgress) throws Exception {
        return super.updateById(orderProgress);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteOrderProgress(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public OrderProgressQueryVo getOrderProgressById(Serializable id) throws Exception {
        return orderProgressMapper.getOrderProgressById(id);
    }

    @Override
    public Paging<OrderProgressQueryVo> getOrderProgressPageList(OrderProgressQueryParam orderProgressQueryParam) throws Exception {
        Page page = setPageParam(orderProgressQueryParam, OrderItem.desc("create_time"));
        IPage<OrderProgressQueryVo> iPage = orderProgressMapper.getOrderProgressPageList(page, orderProgressQueryParam);
        return new Paging(iPage);
    }

}
