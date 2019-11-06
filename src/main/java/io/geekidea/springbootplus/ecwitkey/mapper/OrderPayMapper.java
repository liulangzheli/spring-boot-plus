package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.OrderPay;
import io.geekidea.springbootplus.ecwitkey.param.OrderPayQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderPayQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 订单付款信息 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface OrderPayMapper extends BaseMapper<OrderPay> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    OrderPayQueryVo getOrderPayById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param orderPayQueryParam
     * @return
     */
    IPage<OrderPayQueryVo> getOrderPayPageList(@Param("page") Page page, @Param("param") OrderPayQueryParam orderPayQueryParam);

}
