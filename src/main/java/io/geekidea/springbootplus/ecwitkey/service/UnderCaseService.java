package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.UnderCase;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.UnderCaseQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.UnderCaseQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 线下案例 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface UnderCaseService extends BaseService<UnderCase> {

    /**
     * 保存
     *
     * @param underCase
     * @return
     * @throws Exception
     */
    boolean saveUnderCase(UnderCase underCase) throws Exception;

    /**
     * 修改
     *
     * @param underCase
     * @return
     * @throws Exception
     */
    boolean updateUnderCase(UnderCase underCase) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteUnderCase(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    UnderCaseQueryVo getUnderCaseById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param underCaseQueryParam
     * @return
     * @throws Exception
     */
    Paging<UnderCaseQueryVo> getUnderCasePageList(UnderCaseQueryParam underCaseQueryParam) throws Exception;

}
