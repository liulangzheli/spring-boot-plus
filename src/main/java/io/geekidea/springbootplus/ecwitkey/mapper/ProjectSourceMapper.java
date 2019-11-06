package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.ProjectSource;
import io.geekidea.springbootplus.ecwitkey.param.ProjectSourceQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectSourceQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 项目资料 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface ProjectSourceMapper extends BaseMapper<ProjectSource> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    ProjectSourceQueryVo getProjectSourceById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param projectSourceQueryParam
     * @return
     */
    IPage<ProjectSourceQueryVo> getProjectSourcePageList(@Param("page") Page page, @Param("param") ProjectSourceQueryParam projectSourceQueryParam);

}
