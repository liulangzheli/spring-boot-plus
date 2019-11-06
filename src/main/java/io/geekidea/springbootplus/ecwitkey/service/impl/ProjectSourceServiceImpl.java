package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.ProjectSource;
import io.geekidea.springbootplus.ecwitkey.mapper.ProjectSourceMapper;
import io.geekidea.springbootplus.ecwitkey.service.ProjectSourceService;
import io.geekidea.springbootplus.ecwitkey.param.ProjectSourceQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.ProjectSourceQueryVo;
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
 * 项目资料 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class ProjectSourceServiceImpl extends BaseServiceImpl<ProjectSourceMapper, ProjectSource> implements ProjectSourceService {

    @Autowired
    private ProjectSourceMapper projectSourceMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveProjectSource(ProjectSource projectSource) throws Exception {
        return super.save(projectSource);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateProjectSource(ProjectSource projectSource) throws Exception {
        return super.updateById(projectSource);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteProjectSource(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public ProjectSourceQueryVo getProjectSourceById(Serializable id) throws Exception {
        return projectSourceMapper.getProjectSourceById(id);
    }

    @Override
    public Paging<ProjectSourceQueryVo> getProjectSourcePageList(ProjectSourceQueryParam projectSourceQueryParam) throws Exception {
        Page page = setPageParam(projectSourceQueryParam, OrderItem.desc("create_time"));
        IPage<ProjectSourceQueryVo> iPage = projectSourceMapper.getProjectSourcePageList(page, projectSourceQueryParam);
        return new Paging(iPage);
    }

}
