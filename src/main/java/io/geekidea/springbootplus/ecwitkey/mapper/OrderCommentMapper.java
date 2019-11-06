package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.OrderComment;
import io.geekidea.springbootplus.ecwitkey.param.OrderCommentQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.OrderCommentQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 订单评价 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface OrderCommentMapper extends BaseMapper<OrderComment> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    OrderCommentQueryVo getOrderCommentById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param orderCommentQueryParam
     * @return
     */
    IPage<OrderCommentQueryVo> getOrderCommentPageList(@Param("page") Page page, @Param("param") OrderCommentQueryParam orderCommentQueryParam);

}
