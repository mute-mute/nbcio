package com.nbcio.modules.flowable.service.impl;

import com.nbcio.modules.flowable.apithird.entity.SysCategory;
import com.nbcio.modules.flowable.entity.SysDictItem;
import com.nbcio.modules.flowable.entity.vo.LinkDownCateCode;
import com.nbcio.modules.flowable.entity.vo.SysCateDictCode;
import com.nbcio.modules.flowable.mapper.HandongYZCommonMapper;
import com.nbcio.modules.flowable.service.HanDongYZCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: WangYuZhou
 * @create: 2022-08-26 11:07
 * @description:
 **/

@Service
public class HanDongYZCommonServiceImpl implements HanDongYZCommonService {

    @Autowired
    HandongYZCommonMapper handongYZCommonMapper;

    @Override
    public List<SysDictItem> allSysDictItemInfo(String dictCode) {
        return handongYZCommonMapper.allSysDictItemInfo(dictCode);
    }

    @Override
    public List<SysCategory> customDictData(String dictField, String dictText, String dictTable) {
        return handongYZCommonMapper.customDictData(dictField,dictText,dictTable);
    }

    @Override
    public List<SysCateDictCode> backfieldDataCateDictCode(String parentId) {
        return handongYZCommonMapper.backfieldDataCateDictCode(parentId);
    }

    @Override
    public List<SysCateDictCode> backfieldDataCateDictCodeTwo(String parentCode) {
        return handongYZCommonMapper.backfieldDataCateDictCodeTwo(parentCode);
    }

    @Override
    public List<SysCateDictCode> backfieldSelTreeDataCateDictCode(String dataId,String dataParentId,String dictField, String dictText, String dictTable) {

        return handongYZCommonMapper.backfieldSelTreeDataCateDictCode(dataId,dataParentId,dictField,dictText,dictTable);
    }

    @Override
    public List<LinkDownCateCode> backfieldSelTreeDataCateDictCodeLinkDown(String dataId, String dataParentId, String dictField, String dictText, String dictTable) {
      return handongYZCommonMapper.backfieldSelTreeDataCateDictCodeLinkDown(dataId,dataParentId,dictField,dictText,dictTable);
    }


}
