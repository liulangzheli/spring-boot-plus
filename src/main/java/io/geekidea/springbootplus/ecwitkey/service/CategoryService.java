package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.Category;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.CategoryQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.CategoryQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 类别管理 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface CategoryService extends BaseService<Category> {

    /**
     * 保存
     *
     * @param category
     * @return
     * @throws Exception
     */
    boolean saveCategory(Category category) throws Exception;

    /**
     * 修改
     *
     * @param category
     * @return
     * @throws Exception
     */
    boolean updateCategory(Category category) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteCategory(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    CategoryQueryVo getCategoryById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param categoryQueryParam
     * @return
     * @throws Exception
     */
    Paging<CategoryQueryVo> getCategoryPageList(CategoryQueryParam categoryQueryParam) throws Exception;

}
