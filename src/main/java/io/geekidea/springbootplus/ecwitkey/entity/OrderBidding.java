package io.geekidea.springbootplus.ecwitkey.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import io.geekidea.springbootplus.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <pre>
 * 订单竞标信息
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "OrderBidding对象", description = "订单竞标信息")
public class OrderBidding extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "订单ID")
    private Long orderId;

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    @ApiModelProperty(value = "投标时间")
    private Date createTime;

    @ApiModelProperty(value = "中标状态，0：等待选标 1：超时 2：选中 3、未中标")
    private Integer state;

    @ApiModelProperty(value = "留言")
    private String message;

    @ApiModelProperty(value = "备注")
    private String remark;

}
