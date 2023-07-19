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
 * @Description: flow_deploy_online
 * @Author: nbacheng
 * @Date:   2022-10-21
 * @Version: V1.0
 */
@Data
@TableName("flow_deploy_online")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="flow_deploy_online对象", description="flow_deploy_online")
public class FlowDeployOnline implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键")
    private java.lang.String id;
	/**online表单主键*/
	@Excel(name = "online表单主键", width = 15)
    @ApiModelProperty(value = "online表单主键")
    private java.lang.String onlineId;
	@Excel(name = "online表名称", width = 15)
    @ApiModelProperty(value = "online表名称")
    private java.lang.String tableName;
	/**流程实例主键*/
	@Excel(name = "流程实例主键", width = 15)
    @ApiModelProperty(value = "流程实例主键")
    private java.lang.String deployId;
	/**节点key*/
	@Excel(name = "节点key", width = 15)
    @ApiModelProperty(value = "节点key")
    private java.lang.String nodeKey;
	/**节点名称*/
	@Excel(name = "节点名称", width = 15)
    @ApiModelProperty(value = "节点名称")
    private java.lang.String nodeName;
	/**formFlag*/
	@Excel(name = "formFlag", width = 15)
    @ApiModelProperty(value = "formFlag")
    private java.lang.String formFlag;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private java.lang.String createBy;
	/**创建时间*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间")
    private java.util.Date createTime;
	/**更新人*/
    @ApiModelProperty(value = "更新人")
    private java.lang.String updateBy;
	/**更新时间*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间")
    private java.util.Date updateTime;
	/**所属部门*/
    @ApiModelProperty(value = "所属部门")
    private java.lang.String sysOrgCode;
}
