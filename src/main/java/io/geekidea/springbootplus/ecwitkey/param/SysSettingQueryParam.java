package io.geekidea.springbootplus.ecwitkey.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import io.geekidea.springbootplus.common.param.OrderQueryParam;

/**
 * <pre>
 * 系统设置 查询参数对象
 * </pre>
 *
 * @author geekidea
 * @date 2019-11-06
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "SysSettingQueryParam对象", description = "系统设置查询参数")
public class SysSettingQueryParam extends OrderQueryParam {
    private static final long serialVersionUID = 1L;
}
