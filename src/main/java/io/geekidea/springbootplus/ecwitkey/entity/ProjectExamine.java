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
 * 项目审核
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ProjectExamine对象", description = "项目审核")
public class ProjectExamine extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "订单ID")
    private Long orderId;

    @ApiModelProperty(value = "审核状态，0：待审核 1：审核通过 2:  驳回 3：审核超时")
    private Integer state;

    @ApiModelProperty(value = "审核人")
    private Long roleId;

    @ApiModelProperty(value = "审核时间")
    private Date examineTime;

    @ApiModelProperty(value = "备注")
    private String remark;

}
