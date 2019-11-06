package io.geekidea.springbootplus.ecwitkey.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.ecwitkey.entity.SysSetting;
import io.geekidea.springbootplus.ecwitkey.param.SysSettingQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.SysSettingQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 系统设置 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Repository
public interface SysSettingMapper extends BaseMapper<SysSetting> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    SysSettingQueryVo getSysSettingById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param sysSettingQueryParam
     * @return
     */
    IPage<SysSettingQueryVo> getSysSettingPageList(@Param("page") Page page, @Param("param") SysSettingQueryParam sysSettingQueryParam);

}
