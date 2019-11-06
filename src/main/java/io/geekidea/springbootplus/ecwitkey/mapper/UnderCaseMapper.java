package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.UnderCase;
import io.geekidea.springbootplus.ecwitkey.param.UnderCaseQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.UnderCaseQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 线下案例 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface UnderCaseMapper extends BaseMapper<UnderCase> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    UnderCaseQueryVo getUnderCaseById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param underCaseQueryParam
     * @return
     */
    IPage<UnderCaseQueryVo> getUnderCasePageList(@Param("page") Page page, @Param("param") UnderCaseQueryParam underCaseQueryParam);

}
