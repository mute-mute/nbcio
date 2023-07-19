package com.nbcio.modules.erp.sale.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
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

/**
 * @Description: 销售出库单
 * @Author: nbacheng
 * @Date:   2023-01-10
 * @Version: V1.0
 */
@ApiModel(value="erp_sale_out对象", description="销售出库单")
@Data
@TableName("erp_sale_out")
public class ErpSaleOut implements Serializable {
    private static final long serialVersionUID = 1L;

	/**ID*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "ID")
    private java.lang.String id;
	/**单号*/
	@Excel(name = "单号", width = 15)
    @ApiModelProperty(value = "单号")
    private java.lang.String code;
	/**仓库ID*/
	@Excel(name = "仓库ID", width = 15)
    @ApiModelProperty(value = "仓库ID")
    private java.lang.String scId;
	/**客户ID*/
	@Excel(name = "客户ID", width = 15)
    @ApiModelProperty(value = "客户ID")
    private java.lang.String customerId;
	/**销售员ID*/
	@Excel(name = "销售员ID", width = 15)
    @ApiModelProperty(value = "销售员ID")
    private java.lang.String salerId;
	/**付款日期*/
	@Excel(name = "付款日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "付款日期")
    private java.util.Date paymentDate;
	/**销售单ID*/
	@Excel(name = "销售单ID", width = 15)
    @ApiModelProperty(value = "销售单ID")
    private java.lang.String saleOrderId;
	/**商品数量*/
	@Excel(name = "商品数量", width = 15)
    @ApiModelProperty(value = "商品数量")
    private java.lang.Integer totalNum;
	/**赠品数量*/
	@Excel(name = "赠品数量", width = 15)
    @ApiModelProperty(value = "赠品数量")
    private java.lang.Integer totalGiftNum;
	/**出库金额*/
	@Excel(name = "出库金额", width = 15)
    @ApiModelProperty(value = "出库金额")
    private java.math.BigDecimal totalAmount;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
    private java.lang.String description;
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
	/**审核人*/
	@Excel(name = "审核人", width = 15)
    @ApiModelProperty(value = "审核人")
    private java.lang.String approveBy;
	/**审核时间*/
	@Excel(name = "审核时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "审核时间")
    private java.util.Date approveTime;
	/**状态*/
	@Excel(name = "状态", width = 15, dicCode = "erp_status")
    @Dict(dicCode = "erp_status")
    @ApiModelProperty(value = "状态")
    private java.lang.Integer status;
	/**拒绝原因*/
	@Excel(name = "拒绝原因", width = 15)
    @ApiModelProperty(value = "拒绝原因")
    private java.lang.String refuseReason;
	/**结算状态*/
	@Excel(name = "结算状态", width = 15, dicCode = "erp_settle_status")
    @Dict(dicCode = "erp_settle_status")
    @ApiModelProperty(value = "结算状态")
    private java.lang.Integer settleStatus;
}
