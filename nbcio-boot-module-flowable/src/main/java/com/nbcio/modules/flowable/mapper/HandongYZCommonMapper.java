package com.nbcio.modules.flowable.mapper;

import com.nbcio.modules.flowable.apithird.entity.SysCategory;
import com.nbcio.modules.flowable.entity.SysDictItem;
import com.nbcio.modules.flowable.entity.vo.LinkDownCateCode;
import com.nbcio.modules.flowable.entity.vo.SysCateDictCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author: WangYuZhou
 * @create: 2022-08-26 11:04
 * @description:
 **/

@Mapper
public interface HandongYZCommonMapper {

    //公共方法  数据字典
    List<SysDictItem> allSysDictItemInfo(@Param("dictCode") String dictCode);

    List<SysCategory>  customDictData(@Param("dictField") String dictField, @Param("dictText") String dictText, @Param("dictTable") String dictTable);

    List<SysCateDictCode> backfieldDataCateDictCode(@Param("parentId") String parentId);

    List<SysCateDictCode> backfieldDataCateDictCodeTwo(@Param("parentCode") String parentCode);

    List<SysCateDictCode> backfieldSelTreeDataCateDictCode(@Param("dataId") String dataId,@Param("dataParentId") String dataParentId,@Param("dictField") String dictField,@Param("dictText") String dictText,@Param("dictTable") String dictTable);

    List<LinkDownCateCode> backfieldSelTreeDataCateDictCodeLinkDown(@Param("dataId") String dataId,@Param("dataParentId") String dataParentId,@Param("dictField") String dictField,@Param("dictText") String dictText,@Param("dictTable") String dictTable);
}
