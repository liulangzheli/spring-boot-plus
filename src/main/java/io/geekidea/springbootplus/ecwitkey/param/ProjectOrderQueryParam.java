package io.geekidea.springbootplus.ecwitkey.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import io.geekidea.springbootplus.common.param.OrderQueryParam;

/**
 * <pre>
 * 项目订单 查询参数对象
 * </pre>
 *
 * @author geekidea
 * @date 2019-11-06
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ProjectOrderQueryParam对象", description = "项目订单查询参数")
public class ProjectOrderQueryParam extends OrderQueryParam {
    private static final long serialVersionUID = 1L;
}
