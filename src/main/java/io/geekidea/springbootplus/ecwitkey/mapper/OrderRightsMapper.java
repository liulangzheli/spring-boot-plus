package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.OrderRights;
import io.geekidea.springbootplus.ecwitkey.param.OrderRightsQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderRightsQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 订单维权 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface OrderRightsMapper extends BaseMapper<OrderRights> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    OrderRightsQueryVo getOrderRightsById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param orderRightsQueryParam
     * @return
     */
    IPage<OrderRightsQueryVo> getOrderRightsPageList(@Param("page") Page page, @Param("param") OrderRightsQueryParam orderRightsQueryParam);

}
