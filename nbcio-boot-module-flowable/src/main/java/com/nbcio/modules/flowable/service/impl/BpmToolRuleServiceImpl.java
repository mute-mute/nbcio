package com.nbcio.modules.flowable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nbcio.modules.flowable.entity.BpmToolDesigner;
import com.nbcio.modules.flowable.entity.BpmToolRule;
import com.nbcio.modules.flowable.mapper.BpmToolDesignerMapper;
import com.nbcio.modules.flowable.mapper.BpmToolRuleMapper;
import com.nbcio.modules.flowable.service.BpmToolDesignerService;
import com.nbcio.modules.flowable.service.BpmToolRuleService;
import org.springframework.stereotype.Service;

/**
 * @author: WangYuZhou
 * @create: 2022-09-19 17:31
 * @description:
 **/

@Service
public class BpmToolRuleServiceImpl extends ServiceImpl<BpmToolRuleMapper, BpmToolRule> implements BpmToolRuleService {
}
