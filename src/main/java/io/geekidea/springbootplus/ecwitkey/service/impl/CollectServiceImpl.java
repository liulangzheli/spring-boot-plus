package io.geekidea.springbootplus.ecwitkey.service.impl;

import io.geekidea.springbootplus.ecwitkey.entity.Collect;
import io.geekidea.springbootplus.ecwitkey.mapper.CollectMapper;
import io.geekidea.springbootplus.ecwitkey.service.CollectService;
import io.geekidea.springbootplus.ecwitkey.param.CollectQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.CollectQueryVo;
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
 * 收藏的服务商 服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Slf4j
@Service
public class CollectServiceImpl extends BaseServiceImpl<CollectMapper, Collect> implements CollectService {

    @Autowired
    private CollectMapper collectMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveCollect(Collect collect) throws Exception {
        return super.save(collect);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateCollect(Collect collect) throws Exception {
        return super.updateById(collect);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteCollect(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public CollectQueryVo getCollectById(Serializable id) throws Exception {
        return collectMapper.getCollectById(id);
    }

    @Override
    public Paging<CollectQueryVo> getCollectPageList(CollectQueryParam collectQueryParam) throws Exception {
        Page page = setPageParam(collectQueryParam, OrderItem.desc("create_time"));
        IPage<CollectQueryVo> iPage = collectMapper.getCollectPageList(page, collectQueryParam);
        return new Paging(iPage);
    }

}
