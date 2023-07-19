package com.nbcio.modules.erp.base.entity;

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
 * @Description: erp_warehouse
 * @Author: nbacheng
 * @Date:   2022-08-26
 * @Version: V1.0
 */
@Data
@TableName("erp_warehouse")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="erp_warehouse对象", description="erp_warehouse")
public class ErpWarehouse implements Serializable {
    private static final long serialVersionUID = 1L;

	/**ID*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "ID")
    private java.lang.String id;
	/**编号*/
	@Excel(name = "编号", width = 15)
    @ApiModelProperty(value = "编号")
    private java.lang.String code;
	/**名称*/
	@Excel(name = "名称", width = 15)
    @ApiModelProperty(value = "名称")
    private java.lang.String name;
	/**联系人*/
	@Excel(name = "联系人", width = 15)
    @ApiModelProperty(value = "联系人")
    private java.lang.String contact;
	/**联系人手机号码*/
	@Excel(name = "联系人手机号码", width = 15)
    @ApiModelProperty(value = "联系人手机号码")
    private java.lang.String telephone;
	/**地区ID*/
	@Excel(name = "地区ID", width = 15)
    @ApiModelProperty(value = "地区ID")
    private java.lang.String cityId;
	/**地址*/
	@Excel(name = "地址", width = 15)
    @ApiModelProperty(value = "地址")
    private java.lang.String address;
	/**仓库人数*/
	@Excel(name = "仓库人数", width = 15)
    @ApiModelProperty(value = "仓库人数")
    private java.lang.Integer peopleNum;
	/**状态*/
	@Excel(name = "状态", width = 15, dicCode = "erp_status")
	@Dict(dicCode = "erp_status")
    @ApiModelProperty(value = "状态")
    private java.lang.Integer status;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
    private java.lang.String remark;
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
}
