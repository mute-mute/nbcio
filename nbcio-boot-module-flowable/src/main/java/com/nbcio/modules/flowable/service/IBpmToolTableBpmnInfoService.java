package com.nbcio.modules.flowable.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nbcio.modules.flowable.entity.BpmToolTableBpmn;


/**
 * @author: WangYuZhou
 * @create: 2022-08-27 12:04
 * @description:
 **/
public interface IBpmToolTableBpmnInfoService extends IService<BpmToolTableBpmn> {

    BpmToolTableBpmn selectBpmToolTableByBpmId(String bpmKey);
}
