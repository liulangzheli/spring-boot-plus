package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.OrderCheck;
import io.geekidea.springbootplus.ecwitkey.param.OrderCheckQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderCheckQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 订单验收信息 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface OrderCheckMapper extends BaseMapper<OrderCheck> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    OrderCheckQueryVo getOrderCheckById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param orderCheckQueryParam
     * @return
     */
    IPage<OrderCheckQueryVo> getOrderCheckPageList(@Param("page") Page page, @Param("param") OrderCheckQueryParam orderCheckQueryParam);

}
