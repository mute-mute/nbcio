package com.nbcio.modules.erp.goods.dto;

import java.io.Serializable;

import org.jeecg.common.aspect.annotation.Dict;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ErpGoodsDto implements Serializable {
    private static final long serialVersionUID = 1L;

	/**ID*/
    private java.lang.String id;
    
	/**编号*/
    private java.lang.String code;
    
	/**名称*/
    private java.lang.String name;
    
	/**SPU编号*/
    //private java.lang.String spuId;
    
	/**类别编号*/
    private java.lang.String categoryId;
    
    /**类别名称*/
    private java.lang.String categoryName;
    
	/**品牌编号*/
    private java.lang.String brandId;
    
    /**品牌名称*/
    private java.lang.String brandName;
    
	/**规格*/
    private java.lang.String spec;
    
	/**单位*/
    private java.lang.String unit;
    
    /**采购价格*/
    private java.math.BigDecimal purchasePrice;
    
    /**销售价格*/
    private java.math.BigDecimal salePrice;
    
    /**零售价格*/
    private java.math.BigDecimal retailPrice;
    
    /**税率（%）*/
    private java.math.BigDecimal taxRate;
    
    /**销项税率（%）*/
    private java.math.BigDecimal saleTaxRate;
    
    /**数量*/
    private java.lang.Integer num;
    
    /**总价格*/
    private java.math.BigDecimal totalPrice;
    
    /**库存数量*/
    private java.lang.Integer stockNum;
    
    @Dict(dicCode = "erp_status")
    @ApiModelProperty(value = "状态")
    private java.lang.Integer status;

}