package com.nbcio.modules.flowable.service;

import com.nbcio.modules.flowable.apithird.entity.SysCategory;
import com.nbcio.modules.flowable.entity.SysDictItem;
import com.nbcio.modules.flowable.entity.vo.LinkDownCateCode;
import com.nbcio.modules.flowable.entity.vo.SysCateDictCode;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author: WangYuZhou
 * @create: 2022-08-26 11:01
 * @description:
 **/
public interface HanDongYZCommonService {


    //公共方法  数据字典
    List<SysDictItem> allSysDictItemInfo(String dictCode);

    List<SysCategory>  customDictData(String dictField, String dictText, String dictTable);

    List<SysCateDictCode> backfieldDataCateDictCode(String parentId);

    List<SysCateDictCode> backfieldDataCateDictCodeTwo(String parentCode);


    List<SysCateDictCode> backfieldSelTreeDataCateDictCode(String dataId,String dataParentId,String dictField, String dictText, String dictTable);


    List<LinkDownCateCode> backfieldSelTreeDataCateDictCodeLinkDown(String dataId,String dataParentId,String dictField, String dictText, String dictTable);
}
