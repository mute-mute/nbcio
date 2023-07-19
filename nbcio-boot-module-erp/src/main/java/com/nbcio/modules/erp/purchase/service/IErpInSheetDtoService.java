package com.nbcio.modules.erp.purchase.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nbcio.modules.erp.purchase.dto.ErpInSheetDto;
import com.nbcio.modules.erp.purchase.vo.QueryInSheetVo;


/**
 * @Description: 销售出库单
 * @Author: nbacheng
 * @Date:   2023-02-15
 * @Version: V1.0
 */
public interface IErpInSheetDtoService extends IService<ErpInSheetDto> {

	IPage<ErpInSheetDto> queryInSheetList(Page<ErpInSheetDto> page, QueryInSheetVo queryInSheetVo);

}
