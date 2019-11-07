package io.geekidea.springbootplus.ecwitkey.controller;

import io.geekidea.springbootplus.ecwitkey.entity.Article;
import io.geekidea.springbootplus.ecwitkey.service.ArticleService;
import io.geekidea.springbootplus.ecwitkey.param.ArticleQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ArticleQueryVo;
import io.geekidea.springbootplus.common.api.ApiResult;
import io.geekidea.springbootplus.common.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

import io.geekidea.springbootplus.common.vo.Paging;
import io.geekidea.springbootplus.common.param.IdParam;

/**
 * <pre>
 * 文章 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@RestController
@RequestMapping("/article")
@Api("文章 API")
public class ArticleController extends BaseController {

    @Autowired
    private ArticleService articleService;

    /**
     * 添加文章
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加Article对象", notes = "添加文章", response = ApiResult.class)
    public ApiResult<Boolean> addArticle(@Valid @RequestBody Article article) throws Exception {
        boolean flag = articleService.saveArticle(article);
        return ApiResult.result(flag);
    }

    /**
     * 修改文章
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改Article对象", notes = "修改文章", response = ApiResult.class)
    public ApiResult<Boolean> updateArticle(@Valid @RequestBody Article article) throws Exception {
        boolean flag = articleService.updateArticle(article);
        return ApiResult.result(flag);
    }

    /**
     * 删除文章
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除Article对象", notes = "删除文章", response = ApiResult.class)
    public ApiResult<Boolean> deleteArticle(@PathVariable("id") Long id) throws Exception {
        boolean flag = articleService.deleteArticle(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取文章
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取Article对象详情", notes = "查看文章", response = ArticleQueryVo.class)
    public ApiResult<ArticleQueryVo> getArticle(@PathVariable("id") Long id) throws Exception {
        ArticleQueryVo articleQueryVo = articleService.getArticleById(id);
        return ApiResult.ok(articleQueryVo);
    }

    /**
     * 文章分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取Article分页列表", notes = "文章分页列表", response = ArticleQueryVo.class)
    public ApiResult<Paging<ArticleQueryVo>> getArticlePageList(@Valid @RequestBody ArticleQueryParam articleQueryParam) throws Exception {
        Paging<ArticleQueryVo> paging = articleService.getArticlePageList(articleQueryParam);
        return ApiResult.ok(paging);
    }

}

