package com.nbcio.modules.flowable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nbcio.modules.flowable.entity.BpmToolData;
import com.nbcio.modules.flowable.mapper.BpmToolDataMapper;
import com.nbcio.modules.flowable.service.IBpmToolDataService;
import org.springframework.stereotype.Service;

/**
 * @author: WangYuZhou
 * @create: 2022-09-08 14:47
 * @description:
 **/

@Service
public class BpmToolDataServiceImpl extends ServiceImpl<BpmToolDataMapper, BpmToolData> implements IBpmToolDataService {
}
