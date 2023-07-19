package com.nbcio.modules.flowable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nbcio.modules.flowable.entity.BpmToolTableBpmn;
import com.nbcio.modules.flowable.mapper.BpmToolTableBpmnInfoMapper;
import com.nbcio.modules.flowable.service.IBpmToolTableBpmnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: WangYuZhou
 * @create: 2022-08-27 12:06
 * @description:
 **/
@Service
public class BpmToolTableBpmnInfoServiceImpl extends ServiceImpl<BpmToolTableBpmnInfoMapper, BpmToolTableBpmn> implements IBpmToolTableBpmnInfoService {

    @Autowired
    private BpmToolTableBpmnInfoMapper bpmToolTableBpmnInfoMapper;

    @Override
    public BpmToolTableBpmn selectBpmToolTableByBpmId(String bpmId) {
        return bpmToolTableBpmnInfoMapper.selectBpmToolTableByBpmId(bpmId);
    }
}
