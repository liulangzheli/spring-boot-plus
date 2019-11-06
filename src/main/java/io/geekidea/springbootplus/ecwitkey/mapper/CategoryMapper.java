package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.Category;
import io.geekidea.springbootplus.ecwitkey.param.CategoryQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.CategoryQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 类别管理 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    CategoryQueryVo getCategoryById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param categoryQueryParam
     * @return
     */
    IPage<CategoryQueryVo> getCategoryPageList(@Param("page") Page page, @Param("param") CategoryQueryParam categoryQueryParam);

}
