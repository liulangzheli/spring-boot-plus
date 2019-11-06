package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.Article;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.ArticleQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ArticleQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 文章 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface ArticleService extends BaseService<Article> {

    /**
     * 保存
     *
     * @param article
     * @return
     * @throws Exception
     */
    boolean saveArticle(Article article) throws Exception;

    /**
     * 修改
     *
     * @param article
     * @return
     * @throws Exception
     */
    boolean updateArticle(Article article) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteArticle(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    ArticleQueryVo getArticleById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param articleQueryParam
     * @return
     * @throws Exception
     */
    Paging<ArticleQueryVo> getArticlePageList(ArticleQueryParam articleQueryParam) throws Exception;

}
