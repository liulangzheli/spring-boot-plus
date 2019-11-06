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
 * 订单验收信息
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "OrderCheck对象", description = "订单验收信息")
public class OrderCheck extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "订单ID")
    private Long orderId;

    @ApiModelProperty(value = "创建时间")
    private Date creatTime;

    @ApiModelProperty(value = "成果文件名")
    private String fileNsame;

    @ApiModelProperty(value = "成果文件格式")
    private String format;

    @ApiModelProperty(value = "成果文件大小")
    private Integer size;

    @ApiModelProperty(value = "成果描述")
    private String intro;

    @ApiModelProperty(value = "验收时间")
    private Date checkTime;

    @ApiModelProperty(value = "验收状态 0：待审核 1：审核通过 2：驳回")
    private Integer state;

    @ApiModelProperty(value = "验收意见")
    private String suggest;

    @ApiModelProperty(value = "备注")
    private String remark;

}
