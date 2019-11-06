package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.Article;
import io.geekidea.springbootplus.ecwitkey.mapper.ArticleMapper;
import io.geekidea.springbootplus.ecwitkey.service.ArticleService;
import io.geekidea.springbootplus.ecwitkey.param.ArticleQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ArticleQueryVo;
import io.geekidea.springbootplus.common.service.impl.BaseServiceImpl;
import io.geekidea.springbootplus.common.vo.Paging;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;


/**
 * <pre>
 * 文章 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class ArticleServiceImpl extends BaseServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveArticle(Article article) throws Exception {
        return super.save(article);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateArticle(Article article) throws Exception {
        return super.updateById(article);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteArticle(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public ArticleQueryVo getArticleById(Serializable id) throws Exception {
        return articleMapper.getArticleById(id);
    }

    @Override
    public Paging<ArticleQueryVo> getArticlePageList(ArticleQueryParam articleQueryParam) throws Exception {
        Page page = setPageParam(articleQueryParam, OrderItem.desc("create_time"));
        IPage<ArticleQueryVo> iPage = articleMapper.getArticlePageList(page, articleQueryParam);
        return new Paging(iPage);
    }

}
