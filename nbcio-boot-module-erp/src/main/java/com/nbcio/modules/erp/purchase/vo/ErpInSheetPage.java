package com.nbcio.modules.erp.purchase.vo;

import java.util.List;
import com.nbcio.modules.erp.purchase.entity.ErpInSheet;
import com.nbcio.modules.erp.purchase.entity.ErpInSheetDetail;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelEntity;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: erp_in_sheet
 * @Author: nbacheng
 * @Date:   2022-09-01
 * @Version: V1.0
 */
@Data
@ApiModel(value="erp_in_sheetPage对象", description="erp_in_sheet")
public class ErpInSheetPage {

	/**ID*/
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
	/**供应商ID*/
	@Excel(name = "供应商ID", width = 15)
	@ApiModelProperty(value = "供应商ID")
    private java.lang.String supplierId;
	/**采购员ID*/
	@Excel(name = "采购员ID", width = 15)
	@ApiModelProperty(value = "采购员ID")
    private java.lang.String purchaserId;
	/**付款日期*/
	@Excel(name = "付款日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
	@ApiModelProperty(value = "付款日期")
    private java.util.Date paymentDate;
	/**入库日期*/
	@Excel(name = "入库日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
	@ApiModelProperty(value = "入库日期")
    private java.util.Date inDate;
	/**采购单ID*/
	@Excel(name = "采购单ID", width = 15)
	@ApiModelProperty(value = "采购单ID")
    private java.lang.String purchaseOrderId;
	/**商品数量*/
	@Excel(name = "商品数量", width = 15)
	@ApiModelProperty(value = "商品数量")
    private java.lang.Integer totalNum;
	/**赠品数量*/
	@Excel(name = "赠品数量", width = 15)
	@ApiModelProperty(value = "赠品数量")
    private java.lang.Integer totalGiftNum;
	/**入库金额*/
	@Excel(name = "入库金额", width = 15)
	@ApiModelProperty(value = "入库金额")
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

	@ExcelCollection(name="erp_in_sheet_detail")
	@ApiModelProperty(value = "erp_in_sheet_detail")
	private List<ErpInSheetDetail> erpInSheetDetailList;

}
