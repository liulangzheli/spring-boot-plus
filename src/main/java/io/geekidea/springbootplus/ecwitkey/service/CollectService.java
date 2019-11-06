package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.Collect;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.CollectQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.CollectQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 收藏的服务商 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface CollectService extends BaseService<Collect> {

    /**
     * 保存
     *
     * @param collect
     * @return
     * @throws Exception
     */
    boolean saveCollect(Collect collect) throws Exception;

    /**
     * 修改
     *
     * @param collect
     * @return
     * @throws Exception
     */
    boolean updateCollect(Collect collect) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteCollect(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    CollectQueryVo getCollectById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param collectQueryParam
     * @return
     * @throws Exception
     */
    Paging<CollectQueryVo> getCollectPageList(CollectQueryParam collectQueryParam) throws Exception;

}
