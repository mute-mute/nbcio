package com.nbcio.modules.flowable.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.nbcio.modules.flowable.entity.FlowCc;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 流程抄送表
 * @Author: nbacheng
 * @Date:   2022-10-18
 * @Version: V1.0
 */
public interface FlowCcMapper extends BaseMapper<FlowCc> {
    public int updateState(@Param("id") String id);

}
