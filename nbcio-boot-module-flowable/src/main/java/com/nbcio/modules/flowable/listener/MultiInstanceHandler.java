package com.nbcio.modules.flowable.listener;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import com.nbcio.modules.flowable.apithird.entity.SysUser;
import com.nbcio.modules.flowable.apithird.service.IFlowThirdService;
import com.nbcio.modules.flowable.utils.flowExp;

import lombok.AllArgsConstructor;

import org.apache.commons.lang3.StringUtils;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.UserTask;
import org.flowable.engine.delegate.DelegateExecution;
import org.jeecg.common.util.SpringContextUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 多实例collect用户处理类
 *
 * @author nbacheng
 * @date 2022-10-16
 */
@AllArgsConstructor
@Component("multiInstanceHandler")
public class MultiInstanceHandler {

	public Set<String> getUserName(DelegateExecution execution) {
        Set<String> candidateUserName = new LinkedHashSet<>();
        FlowElement flowElement = execution.getCurrentFlowElement();
        if (ObjectUtil.isNotEmpty(flowElement) && flowElement instanceof UserTask) {
            UserTask userTask = (UserTask) flowElement;
            if (CollUtil.isNotEmpty(userTask.getCandidateUsers())) {
            	List<String> groups = userTask.getCandidateUsers();
            	if (groups.size()!= 0 && StringUtils.contains(groups.get(0), "${flowExp.getDynamic")) {
            		getDynamicUsers(groups,candidateUserName);
            		
				}
            	else {
            		candidateUserName.addAll(userTask.getCandidateUsers());
            	}
            	
            } else if (CollUtil.isNotEmpty(userTask.getCandidateGroups())) {
            	List<String> groups = userTask.getCandidateGroups();
            	if (groups.size()!= 0 && StringUtils.contains(groups.get(0), "${flowExp.getDynamic")) {
            		getDynamicUsers(groups,candidateUserName);
            		
				}
            	else {
	                IFlowThirdService iFlowThirdService = SpringContextUtils.getBean(IFlowThirdService.class);
	                groups.forEach(item -> {
	                     List<SysUser> listuserName = iFlowThirdService.getUsersByRoleId(item);
	                     for(SysUser sysuser : listuserName) {
	                        candidateUserName.add(sysuser.getUsername());
	                     }
	                });
            	} 
            }
        }
        return candidateUserName;
    }
	
	@SuppressWarnings("unchecked")
    private void getDynamicUsers(List<String> groups,Set<String> candidateUserName) {
    	String methodname = StringUtils.substringBetween(groups.get(0), ".", "(");
		List<String> list = new ArrayList<String>();
		flowExp flowexp = SpringContextUtils.getBean(flowExp.class);
		Object[] argsPara=new Object[]{};
		try {
			list = (List<String>) flowexp.invokeMethod(flowexp, methodname,argsPara);
            candidateUserName.addAll(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
