package com.nbcio.modules.erp.base.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.util.oConvertUtils;
import com.nbcio.modules.erp.base.entity.ErpShop;
import com.nbcio.modules.erp.base.service.IErpShopService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;
import org.jeecg.common.system.base.controller.JeecgController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jeecg.common.aspect.annotation.AutoLog;

 /**
 * @Description: erp_shop
 * @Author: nbacheng
 * @Date:   2022-08-27
 * @Version: V1.0
 */
@Api(tags="erp_shop")
@RestController
@RequestMapping("/base/erpShop")
@Slf4j
public class ErpShopController extends JeecgController<ErpShop, IErpShopService> {
	@Autowired
	private IErpShopService erpShopService;
	
	/**
	 * 分页列表查询
	 *
	 * @param erpShop
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "erp_shop-分页列表查询")
	@ApiOperation(value="erp_shop-分页列表查询", notes="erp_shop-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(ErpShop erpShop,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<ErpShop> queryWrapper = QueryGenerator.initQueryWrapper(erpShop, req.getParameterMap());
		Page<ErpShop> page = new Page<ErpShop>(pageNo, pageSize);
		IPage<ErpShop> pageList = erpShopService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param erpShop
	 * @return
	 */
	@AutoLog(value = "erp_shop-添加")
	@ApiOperation(value="erp_shop-添加", notes="erp_shop-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody ErpShop erpShop) {
		erpShopService.save(erpShop);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param erpShop
	 * @return
	 */
	@AutoLog(value = "erp_shop-编辑")
	@ApiOperation(value="erp_shop-编辑", notes="erp_shop-编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody ErpShop erpShop) {
		erpShopService.updateById(erpShop);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "erp_shop-通过id删除")
	@ApiOperation(value="erp_shop-通过id删除", notes="erp_shop-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		erpShopService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "erp_shop-批量删除")
	@ApiOperation(value="erp_shop-批量删除", notes="erp_shop-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.erpShopService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "erp_shop-通过id查询")
	@ApiOperation(value="erp_shop-通过id查询", notes="erp_shop-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		ErpShop erpShop = erpShopService.getById(id);
		if(erpShop==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(erpShop);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param erpShop
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, ErpShop erpShop) {
        return super.exportXls(request, erpShop, ErpShop.class, "erp_shop");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, ErpShop.class);
    }

}
