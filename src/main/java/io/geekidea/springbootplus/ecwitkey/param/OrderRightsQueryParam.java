package io.geekidea.springbootplus.ecwitkey.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import io.geekidea.springbootplus.common.param.OrderQueryParam;

/**
 * <pre>
 * 订单维权 查询参数对象
 * </pre>
 *
 * @author geekidea
 * @date 2019-11-06
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "OrderRightsQueryParam对象", description = "订单维权查询参数")
public class OrderRightsQueryParam extends OrderQueryParam {
    private static final long serialVersionUID = 1L;
}
