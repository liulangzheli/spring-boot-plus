package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.Article;
import io.geekidea.springbootplus.ecwitkey.param.ArticleQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ArticleQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 文章 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface ArticleMapper extends BaseMapper<Article> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    ArticleQueryVo getArticleById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param articleQueryParam
     * @return
     */
    IPage<ArticleQueryVo> getArticlePageList(@Param("page") Page page, @Param("param") ArticleQueryParam articleQueryParam);

}
