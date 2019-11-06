package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectRequirement;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectRequirementQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectRequirementQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 项目类型要求 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface ProjectRequirementService extends BaseService<ProjectRequirement> {

    /**
     * 保存
     *
     * @param projectRequirement
     * @return
     * @throws Exception
     */
    boolean saveProjectRequirement(ProjectRequirement projectRequirement) throws Exception;

    /**
     * 修改
     *
     * @param projectRequirement
     * @return
     * @throws Exception
     */
    boolean updateProjectRequirement(ProjectRequirement projectRequirement) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteProjectRequirement(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    ProjectRequirementQueryVo getProjectRequirementById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param projectRequirementQueryParam
     * @return
     * @throws Exception
     */
    Paging<ProjectRequirementQueryVo> getProjectRequirementPageList(ProjectRequirementQueryParam projectRequirementQueryParam) throws Exception;

}
