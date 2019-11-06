package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectRequirement;
import io.geekidea.springbootplus.ecwitkey.mapper.ProjectRequirementMapper;
import io.geekidea.springbootplus.ecwitkey.service.ProjectRequirementService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectRequirementQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectRequirementQueryVo;
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
 * 项目类型要求 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class ProjectRequirementServiceImpl extends BaseServiceImpl<ProjectRequirementMapper, ProjectRequirement> implements ProjectRequirementService {

    @Autowired
    private ProjectRequirementMapper projectRequirementMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveProjectRequirement(ProjectRequirement projectRequirement) throws Exception {
        return super.save(projectRequirement);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateProjectRequirement(ProjectRequirement projectRequirement) throws Exception {
        return super.updateById(projectRequirement);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteProjectRequirement(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public ProjectRequirementQueryVo getProjectRequirementById(Serializable id) throws Exception {
        return projectRequirementMapper.getProjectRequirementById(id);
    }

    @Override
    public Paging<ProjectRequirementQueryVo> getProjectRequirementPageList(ProjectRequirementQueryParam projectRequirementQueryParam) throws Exception {
        Page page = setPageParam(projectRequirementQueryParam, OrderItem.desc("create_time"));
        IPage<ProjectRequirementQueryVo> iPage = projectRequirementMapper.getProjectRequirementPageList(page, projectRequirementQueryParam);
        return new Paging(iPage);
    }

}
