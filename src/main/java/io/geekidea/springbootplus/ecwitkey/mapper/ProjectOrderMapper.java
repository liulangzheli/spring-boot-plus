package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.ProjectOrder;
import io.geekidea.springbootplus.ecwitkey.param.ProjectOrderQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectOrderQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 项目订单 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface ProjectOrderMapper extends BaseMapper<ProjectOrder> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    ProjectOrderQueryVo getProjectOrderById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param projectOrderQueryParam
     * @return
     */
    IPage<ProjectOrderQueryVo> getProjectOrderPageList(@Param("page") Page page, @Param("param") ProjectOrderQueryParam projectOrderQueryParam);

}
