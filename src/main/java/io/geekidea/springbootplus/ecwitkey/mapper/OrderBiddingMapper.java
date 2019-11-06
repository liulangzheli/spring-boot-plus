package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.OrderBidding;
import io.geekidea.springbootplus.ecwitkey.param.OrderBiddingQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderBiddingQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 订单竞标信息 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface OrderBiddingMapper extends BaseMapper<OrderBidding> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    OrderBiddingQueryVo getOrderBiddingById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param orderBiddingQueryParam
     * @return
     */
    IPage<OrderBiddingQueryVo> getOrderBiddingPageList(@Param("page") Page page, @Param("param") OrderBiddingQueryParam orderBiddingQueryParam);

}
