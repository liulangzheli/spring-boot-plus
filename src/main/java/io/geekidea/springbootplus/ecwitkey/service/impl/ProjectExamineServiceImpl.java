package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectExamine;
import io.geekidea.springbootplus.ecwitkey.mapper.ProjectExamineMapper;
import io.geekidea.springbootplus.ecwitkey.service.ProjectExamineService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectExamineQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectExamineQueryVo;
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
 * 项目审核 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class ProjectExamineServiceImpl extends BaseServiceImpl<ProjectExamineMapper, ProjectExamine> implements ProjectExamineService {

    @Autowired
    private ProjectExamineMapper projectExamineMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveProjectExamine(ProjectExamine projectExamine) throws Exception {
        return super.save(projectExamine);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateProjectExamine(ProjectExamine projectExamine) throws Exception {
        return super.updateById(projectExamine);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteProjectExamine(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public ProjectExamineQueryVo getProjectExamineById(Serializable id) throws Exception {
        return projectExamineMapper.getProjectExamineById(id);
    }

    @Override
    public Paging<ProjectExamineQueryVo> getProjectExaminePageList(ProjectExamineQueryParam projectExamineQueryParam) throws Exception {
        Page page = setPageParam(projectExamineQueryParam, OrderItem.desc("create_time"));
        IPage<ProjectExamineQueryVo> iPage = projectExamineMapper.getProjectExaminePageList(page, projectExamineQueryParam);
        return new Paging(iPage);
    }

}
