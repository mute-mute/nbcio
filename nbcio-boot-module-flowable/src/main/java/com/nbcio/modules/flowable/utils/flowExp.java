package com.nbcio.modules.flowable.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nbcio.modules.flowable.apithird.entity.SysUser;
import com.nbcio.modules.flowable.apithird.service.IFlowThirdService;

/**
 * 流程表达式应用类
 * @author nbacheng
 * @date 2023-05-16
 */

@Service
public class flowExp {
	@Resource
	public  IFlowThirdService iFlowThirdService;
	
	public  String getDynamicAssignee() {//动态单个用户例子
		SysUser loginUser = iFlowThirdService.getLoginUser();
		return loginUser.getUsername();		
	}
	
	public  List<String> getDynamicList() {//动态多个用户例子
		List<String> userlist = new ArrayList<String>();
		List<SysUser> list = new ArrayList<SysUser>();
		list = iFlowThirdService.getUsersByRoleId("f6817f48af4fb3af11b9e8bf182f618b");//管理员角色
		for(SysUser sysuser : list) {
			userlist.add(sysuser.getUsername());
		}
		return userlist;
	}
	
	/**
	* 反射调用方法
	* @param newObj 实例化的一个对象
	* @param methodName 对象的方法名
	* @param args 参数数组
	* @return 返回值
	* @throws Exception
	*/
	public  Object invokeMethod(Object newObj, String methodName, Object[] args)throws Exception {
		Class ownerClass = newObj.getClass();
		Class[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
		  argsClass[i] = args[i].getClass();
		}
		Method method = ownerClass.getMethod(methodName, argsClass);
		return method.invoke(newObj, args);
	}

}
