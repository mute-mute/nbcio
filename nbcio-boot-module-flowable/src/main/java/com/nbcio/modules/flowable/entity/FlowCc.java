package com.nbcio.modules.flowable.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 流程抄送表
 * @Author: nbacheng
 * @Date:   2022-10-18
 * @Version: V1.0
 */
@Data
@TableName("flow_cc")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="flow_cc对象", description="流程抄送表")
public class FlowCc implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键")
    private java.lang.String id;
	/**抄送标题*/
	@Excel(name = "抄送标题", width = 15)
    @ApiModelProperty(value = "抄送标题")
    private java.lang.String title;
	/**流程ID*/
	@Excel(name = "流程ID", width = 15)
    @ApiModelProperty(value = "流程ID")
    private java.lang.String flowId;
	/**流程名称*/
	@Excel(name = "流程名称", width = 15)
    @ApiModelProperty(value = "流程名称")
    private java.lang.String flowName;
	/**流程分类*/
	@Excel(name = "流程分类", width = 15)
    @ApiModelProperty(value = "流程分类")
    private java.lang.String category;
	/**发布ID*/
	@Excel(name = "发布ID", width = 15)
    @ApiModelProperty(value = "发布ID")
    private java.lang.String deploymentId;
	/**流程实例ID*/
	@Excel(name = "流程实例ID", width = 15)
    @ApiModelProperty(value = "流程实例ID")
    private java.lang.String instanceId;
	/**任务ID*/
	@Excel(name = "任务ID", width = 15)
    @ApiModelProperty(value = "任务ID")
    private java.lang.String taskId;
	/**业务主键*/
	@Excel(name = "业务主键", width = 15)
    @ApiModelProperty(value = "业务主键")
    private java.lang.String businessKey;
	/**用户*/
	@Excel(name = "用户", width = 15)
    @ApiModelProperty(value = "用户")
    private java.lang.String username;
    /**接收人姓名*/
    @Excel(name = "接收人姓名", width = 15)
    @ApiModelProperty(value = "接收人姓名")
    private java.lang.String receiveRealname;
    /**查看状态*/
    @Excel(name = "查看状态", width = 15)
    @ApiModelProperty(value = "查看状态")
    private String state;

	/**发起人账号*/
	@Excel(name = "发起人账号", width = 15)
    @ApiModelProperty(value = "发起人账号")
    private java.lang.String initiatorUsername;
	/**发起人姓名*/
	@Excel(name = "发起人姓名", width = 15)
    @ApiModelProperty(value = "发起人姓名")
    private java.lang.String initiatorRealname;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private java.lang.String createBy;
	/**创建日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建日期")
    private java.util.Date createTime;
	/**更新人*/
    @ApiModelProperty(value = "更新人")
    private java.lang.String updateBy;
	/**更新日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新日期")
    private java.util.Date updateTime;
	/**所属部门*/
    @ApiModelProperty(value = "所属部门")
    private java.lang.String sysOrgCode;
}
