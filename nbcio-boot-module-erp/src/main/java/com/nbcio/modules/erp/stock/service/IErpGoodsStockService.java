package com.nbcio.modules.erp.stock.service;

import com.nbcio.modules.erp.stock.entity.ErpGoodsStock;
import com.nbcio.modules.erp.stock.vo.ErpGoodsStockVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 商品库存表
 * @Author: nbacheng
 * @Date:   2022-11-25
 * @Version: V1.0
 */
public interface IErpGoodsStockService extends IService<ErpGoodsStock> {
   void inStock(ErpGoodsStockVo erpGoodsStockVo) throws Exception;
   void outStock(ErpGoodsStockVo erpGoodsStockVo) throws Exception;
}
