package com.nbcio.modules.flowable.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nbcio.modules.flowable.entity.BpmToolTableBpmn;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: WangYuZhou
 * @create: 2022-08-27 11:55
 * @description:
 **/
@Mapper
public interface BpmToolTableBpmnInfoMapper extends BaseMapper<BpmToolTableBpmn> {

    BpmToolTableBpmn selectBpmToolTableByBpmId(String bpmId);
}
