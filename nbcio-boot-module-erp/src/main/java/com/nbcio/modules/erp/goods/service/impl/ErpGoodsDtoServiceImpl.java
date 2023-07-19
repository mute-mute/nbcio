package com.nbcio.modules.erp.goods.service.impl;

import com.nbcio.modules.erp.goods.dto.ErpGoodsDto;
import com.nbcio.modules.erp.goods.mapper.ErpGoodsDtoMapper;
import com.nbcio.modules.erp.goods.service.IErpGoodsDtoService;
import com.nbcio.modules.erp.goods.vo.QueryGoodsVo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: erp_goods
 * @Author: nbacheng
 * @Date:   2023-02-09
 * @Version: V1.0
 */
@Service
public class ErpGoodsDtoServiceImpl extends ServiceImpl<ErpGoodsDtoMapper, ErpGoodsDto> implements IErpGoodsDtoService {

	@Autowired
	private ErpGoodsDtoMapper erpGoodsDtoMapper;
	
	@Override
	public IPage<ErpGoodsDto> queryGoodsList(Page<ErpGoodsDto> page, QueryGoodsVo queryGoodsVo) {
		List<ErpGoodsDto> erpGoodsDtoLists = this.baseMapper.queryGoodsList(page, queryGoodsVo);
        return page.setRecords(erpGoodsDtoLists);
	}

	@Override
	public List<ErpGoodsDto> queryByIds(String ids) {
		// TODO Auto-generated method stub
		String [] idArray=ids.split(",");
		return erpGoodsDtoMapper.getByIds(idArray);
	}

}
