package io.geekidea.springbootplus.ecwitkey.service;

import io.geekidea.springbootplus.ecwitkey.entity.SysSetting;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.ecwitkey.param.SysSettingQueryParam;
import io.geekidea.springbootplus.ecwitkey.vo.SysSettingQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;

/**
 * <pre>
 * 系统设置 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
public interface SysSettingService extends BaseService<SysSetting> {

    /**
     * 保存
     *
     * @param sysSetting
     * @return
     * @throws Exception
     */
    boolean saveSysSetting(SysSetting sysSetting) throws Exception;

    /**
     * 修改
     *
     * @param sysSetting
     * @return
     * @throws Exception
     */
    boolean updateSysSetting(SysSetting sysSetting) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteSysSetting(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    SysSettingQueryVo getSysSettingById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param sysSettingQueryParam
     * @return
     * @throws Exception
     */
    Paging<SysSettingQueryVo> getSysSettingPageList(SysSettingQueryParam sysSettingQueryParam) throws Exception;

}
