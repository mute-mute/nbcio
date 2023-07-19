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
 * @Description: flow_my_online
 * @Author: nbacheng
 * @Date:   2022-11-02
 * @Version: V1.0
 */
@Data
@TableName("flow_my_online")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="flow_my_online对象", description="flow_my_online")
public class FlowMyOnline implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键ID*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键ID")
    private java.lang.String id;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private java.lang.String createBy;
	/**创建时间*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间")
    private java.util.Date createTime;
	/**修改人*/
    @ApiModelProperty(value = "修改人")
    private java.lang.String updateBy;
	/**修改时间*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "修改时间")
    private java.util.Date updateTime;
	/**流程定义key 一个key会有多个版本的id*/
	@Excel(name = "流程定义key 一个key会有多个版本的id", width = 15)
    @ApiModelProperty(value = "流程定义key 一个key会有多个版本的id")
    private java.lang.String processDefinitionKey;
	/**流程定义id 一个流程定义唯一*/
	@Excel(name = "流程定义id 一个流程定义唯一", width = 15)
    @ApiModelProperty(value = "流程定义id 一个流程定义唯一")
    private java.lang.String processDefinitionId;
	/**流程业务实例id 一个流程业务唯一，本表中也唯一*/
	@Excel(name = "流程业务实例id 一个流程业务唯一，本表中也唯一", width = 15)
    @ApiModelProperty(value = "流程业务实例id 一个流程业务唯一，本表中也唯一")
    private java.lang.String processInstanceId;
	/**online流程业务简要描述*/
	@Excel(name = "online流程业务简要描述", width = 15)
    @ApiModelProperty(value = "online流程业务简要描述")
    private java.lang.String title;
	/**online_id，理论唯一*/
	@Excel(name = "online_id，理论唯一", width = 15)
    @ApiModelProperty(value = "online_id，理论唯一")
    private java.lang.String onlineId;
	/**online数据表id，理论唯一*/
	@Excel(name = "online数据表id，理论唯一", width = 15)
    @ApiModelProperty(value = "online数据表id，理论唯一")
    private java.lang.String dataId;
	/**申请人*/
	@Excel(name = "申请人", width = 15)
    @ApiModelProperty(value = "申请人")
    private java.lang.String proposer;
	/**流程状态说明，有：启动  撤回  驳回  审批中  审批通过  审批异常*/
	@Excel(name = "流程状态说明，有：启动  撤回  驳回  审批中  审批通过  审批异常", width = 15)
    @ApiModelProperty(value = "流程状态说明，有：启动  撤回  驳回  审批中  审批通过  审批异常")
    private java.lang.String actStatus;
	/**当前的节点定义上的Id,*/
	@Excel(name = "当前的节点定义上的Id,", width = 15)
    @ApiModelProperty(value = "当前的节点定义上的Id,")
    private java.lang.String taskId;
	/**当前的节点*/
	@Excel(name = "当前的节点", width = 15)
    @ApiModelProperty(value = "当前的节点")
    private java.lang.String taskName;
	/**当前的节点实例上的Id*/
	@Excel(name = "当前的节点实例上的Id", width = 15)
    @ApiModelProperty(value = "当前的节点实例上的Id")
    private java.lang.String taskNameId;
	/**当前的节点可以处理的用户名*/
	@Excel(name = "当前的节点可以处理的用户名", width = 15)
    @ApiModelProperty(value = "当前的节点可以处理的用户名")
    private java.lang.String todoUsers;
	/**处理过的人*/
	@Excel(name = "处理过的人", width = 15)
    @ApiModelProperty(value = "处理过的人")
    private java.lang.String doneUsers;
	/**当前任务节点的优先级 流程定义的时候所填*/
	@Excel(name = "当前任务节点的优先级 流程定义的时候所填", width = 15)
    @ApiModelProperty(value = "当前任务节点的优先级 流程定义的时候所填")
    private java.lang.String priority;
}
