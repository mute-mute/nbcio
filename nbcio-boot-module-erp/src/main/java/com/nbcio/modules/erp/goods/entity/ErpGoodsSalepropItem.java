package com.nbcio.modules.erp.goods.entity;

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
 * @Description: erp_goods_saleprop_item
 * @Author: nbacheng
 * @Date:   2022-08-28
 * @Version: V1.0
 */
@Data
@TableName("erp_goods_saleprop_item")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="erp_goods_saleprop_item对象", description="erp_goods_saleprop_item")
public class ErpGoodsSalepropItem implements Serializable {
    private static final long serialVersionUID = 1L;

	/**ID*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "ID")
    private java.lang.String id;
	/**商品销售属性ID*/
	@Excel(name = "商品销售属性ID", width = 15)
    @ApiModelProperty(value = "商品销售属性ID")
    private java.lang.String salepropId;
	/**编号*/
	@Excel(name = "编号", width = 15)
    @ApiModelProperty(value = "编号")
    private java.lang.String code;
	/**名称*/
	@Excel(name = "名称", width = 15)
    @ApiModelProperty(value = "名称")
    private java.lang.String name;
	/**状态*/
	@Excel(name = "状态", width = 15, dicCode = "erp_status")
	@Dict(dicCode = "erp_status")
    @ApiModelProperty(value = "状态")
    private java.lang.Integer status;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
    private java.lang.String remark;
}
