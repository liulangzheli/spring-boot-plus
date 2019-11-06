package io.geekidea.springbootplus.system.entity;

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
 * 系统用户
 * </pre>
 *
 * @author geekidea
 * @since 2019-11-06
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "SysUser对象", description = "系统用户")
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "用户名")
    @NotBlank(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "密码")
    @NotBlank(message = "密码不能为空")
    private String password;

    @ApiModelProperty(value = "盐值")
    private String salt;

    @ApiModelProperty(value = "手机号码")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @ApiModelProperty(value = "性别，0：女，1：男，默认1")
    private Integer gender;

    @ApiModelProperty(value = "头像")
    private String head;

    @ApiModelProperty(value = "remark")
    private String remark;

    @ApiModelProperty(value = "状态，0：禁用，1：启用，2：锁定")
    private Integer state;

    @ApiModelProperty(value = "部门id")
    @NotNull(message = "部门id不能为空")
    private Long departmentId;

    @ApiModelProperty(value = "角色id")
    @NotNull(message = "角色id不能为空")
    private Long roleId;

    @ApiModelProperty(value = "逻辑删除，0：未删除，1：已删除")
    private Integer deleted;

    @ApiModelProperty(value = "版本")
    private Integer version;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "用户类型，0：个人/团队，1：企业")
    @NotNull(message = "用户类型，0：个人/团队，1：企业不能为空")
    private Integer userType;

    @ApiModelProperty(value = "是否为服务商，0：否,1：是")
    @NotNull(message = "是否为服务商，0：否,1：是不能为空")
    private Integer isService;

    @ApiModelProperty(value = "省")
    @NotNull(message = "省不能为空")
    private Integer province;

    @ApiModelProperty(value = "市")
    @NotNull(message = "市不能为空")
    private Integer city;

    @ApiModelProperty(value = "区/县")
    @NotNull(message = "区/县不能为空")
    private Integer zone;

    @ApiModelProperty(value = "联系地址")
    private String address;

    @ApiModelProperty(value = "邮箱")
    @NotBlank(message = "邮箱不能为空")
    private String email;

    @ApiModelProperty(value = "传真")
    private Integer tax;

    @ApiModelProperty(value = "传真")
    private String scale;

    @ApiModelProperty(value = "介绍")
    private String intro;

    @ApiModelProperty(value = "微信号")
    private String wechat;

    @ApiModelProperty(value = "承接项目类型")
    private Integer proType;

    @ApiModelProperty(value = "身份证号")
    private String idNum;

    @ApiModelProperty(value = "身份证正面")
    private String idFront;

    @ApiModelProperty(value = "身份证背面")
    private String idBack;

    @ApiModelProperty(value = "身份证有效期")
    private String idValidity;

    @ApiModelProperty(value = "出生日期")
    private String birthday;

    @ApiModelProperty(value = "星座")
    private String constellation;

    @ApiModelProperty(value = "专业")
    private Integer major;

    @ApiModelProperty(value = "团队名称")
    private String teamName;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "企业组织机构代码")
    private String licenseId;

    @ApiModelProperty(value = "网址")
    private String website;

    @ApiModelProperty(value = "公司类型")
    private String companyType;

    @ApiModelProperty(value = "业务类型")
    private String serviceType;

}
