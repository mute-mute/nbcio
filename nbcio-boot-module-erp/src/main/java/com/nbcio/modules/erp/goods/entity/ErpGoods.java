package com.nbcio.modules.erp.goods.entity;

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
 * @Description: 商品基础信息
 * @Author: nbacheng
 * @Date:   2023-03-08
 * @Version: V1.0
 */
@ApiModel(value="erp_goods对象", description="商品基础信息")
@Data
@TableName("erp_goods")
public class ErpGoods implements Serializable {
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
	/**SPU编号*/
	@Excel(name = "SPU编号", width = 15)
    @ApiModelProperty(value = "SPU编号")
    private java.lang.String spuId;
	/**简称*/
	@Excel(name = "简称", width = 15)
    @ApiModelProperty(value = "简称")
    private java.lang.String shortName;
	/**类别编号*/
	@Excel(name = "类别编号", width = 15)
    @ApiModelProperty(value = "类别编号")
    private java.lang.String categoryId;
	/**品牌编号*/
	@Excel(name = "品牌编号", width = 15)
    @ApiModelProperty(value = "品牌编号")
    private java.lang.String brandId;
	/**进项税率（%）*/
	@Excel(name = "进项税率（%）", width = 15)
    @ApiModelProperty(value = "进项税率（%）")
    private java.math.BigDecimal taxRate;
	/**销项税率（%）*/
	@Excel(name = "销项税率（%）", width = 15)
    @ApiModelProperty(value = "销项税率（%）")
    private java.math.BigDecimal saleTaxRate;
	/**规格*/
	@Excel(name = "规格", width = 15)
    @ApiModelProperty(value = "规格")
    private java.lang.String spec;
	/**单位*/
	@Excel(name = "单位", width = 15)
    @ApiModelProperty(value = "单位")
    private java.lang.String unit;
	/**状态*/
	@Excel(name = "状态", width = 15, dicCode = "erp_status")
    @Dict(dicCode = "erp_status")
    @ApiModelProperty(value = "状态")
    private java.lang.Integer status;
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
