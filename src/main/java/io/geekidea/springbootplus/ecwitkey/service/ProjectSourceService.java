package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectSource;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectSourceQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectSourceQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 项目资料 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface ProjectSourceService extends BaseService<ProjectSource> {

    /**
     * 保存
     *
     * @param projectSource
     * @return
     * @throws Exception
     */
    boolean saveProjectSource(ProjectSource projectSource) throws Exception;

    /**
     * 修改
     *
     * @param projectSource
     * @return
     * @throws Exception
     */
    boolean updateProjectSource(ProjectSource projectSource) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteProjectSource(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    ProjectSourceQueryVo getProjectSourceById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param projectSourceQueryParam
     * @return
     * @throws Exception
     */
    Paging<ProjectSourceQueryVo> getProjectSourcePageList(ProjectSourceQueryParam projectSourceQueryParam) throws Exception;

}
