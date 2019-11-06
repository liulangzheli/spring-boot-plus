package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectOrder;
import io.geekidea.springbootplus.ecwitkey.mapper.ProjectOrderMapper;
import io.geekidea.springbootplus.ecwitkey.service.ProjectOrderService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectOrderQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectOrderQueryVo;
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
 * 项目订单 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class ProjectOrderServiceImpl extends BaseServiceImpl<ProjectOrderMapper, ProjectOrder> implements ProjectOrderService {

    @Autowired
    private ProjectOrderMapper projectOrderMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveProjectOrder(ProjectOrder projectOrder) throws Exception {
        return super.save(projectOrder);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateProjectOrder(ProjectOrder projectOrder) throws Exception {
        return super.updateById(projectOrder);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteProjectOrder(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public ProjectOrderQueryVo getProjectOrderById(Serializable id) throws Exception {
        return projectOrderMapper.getProjectOrderById(id);
    }

    @Override
    public Paging<ProjectOrderQueryVo> getProjectOrderPageList(ProjectOrderQueryParam projectOrderQueryParam) throws Exception {
        Page page = setPageParam(projectOrderQueryParam, OrderItem.desc("create_time"));
        IPage<ProjectOrderQueryVo> iPage = projectOrderMapper.getProjectOrderPageList(page, projectOrderQueryParam);
        return new Paging(iPage);
    }

}
