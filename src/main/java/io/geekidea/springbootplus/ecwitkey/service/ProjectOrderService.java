package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectOrder;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectOrderQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectOrderQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 项目订单 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface ProjectOrderService extends BaseService<ProjectOrder> {

    /**
     * 保存
     *
     * @param projectOrder
     * @return
     * @throws Exception
     */
    boolean saveProjectOrder(ProjectOrder projectOrder) throws Exception;

    /**
     * 修改
     *
     * @param projectOrder
     * @return
     * @throws Exception
     */
    boolean updateProjectOrder(ProjectOrder projectOrder) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteProjectOrder(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    ProjectOrderQueryVo getProjectOrderById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param projectOrderQueryParam
     * @return
     * @throws Exception
     */
    Paging<ProjectOrderQueryVo> getProjectOrderPageList(ProjectOrderQueryParam projectOrderQueryParam) throws Exception;

}
