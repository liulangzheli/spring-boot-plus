package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectExamine;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectExamineQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectExamineQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 项目审核 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface ProjectExamineService extends BaseService<ProjectExamine> {

    /**
     * 保存
     *
     * @param projectExamine
     * @return
     * @throws Exception
     */
    boolean saveProjectExamine(ProjectExamine projectExamine) throws Exception;

    /**
     * 修改
     *
     * @param projectExamine
     * @return
     * @throws Exception
     */
    boolean updateProjectExamine(ProjectExamine projectExamine) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteProjectExamine(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    ProjectExamineQueryVo getProjectExamineById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param projectExamineQueryParam
     * @return
     * @throws Exception
     */
    Paging<ProjectExamineQueryVo> getProjectExaminePageList(ProjectExamineQueryParam projectExamineQueryParam) throws Exception;

}
