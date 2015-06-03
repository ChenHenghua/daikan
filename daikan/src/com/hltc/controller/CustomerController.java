package com.hltc.controller;

import static com.hltc.util.SecurityUtil.parametersValidate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.google.gson.JsonArray;
import com.hltc.common.ErrorCode;
import com.hltc.common.GlobalConstant;
import com.hltc.common.Result;
import com.hltc.dao.IClassDao;
import com.hltc.dao.ICustomerDao;
import com.hltc.dao.IProjectDao;
import com.hltc.entity.Project;
import com.hltc.entity.Token;
import com.hltc.util.BeanUtil;
import com.hltc.util.LogUtil;
import com.hltc.util.SecurityUtil;
import com.hltc.entity.Class;

/**
 * 客户模块控制器
 */
@Controller
@Scope("prototype")
@RequestMapping(value="/v1/customer")
public class CustomerController {
	
	@Autowired
	private IProjectDao projectDao;
	@Autowired
	private IClassDao classDao;
	@Autowired
	private ICustomerDao customerDao;
	
	/**
	 * 批量保存客户信息
	 */
	@RequestMapping(value="/addCustomerBatch.json", method=RequestMethod.POST)
	public @ResponseBody Object addCustomerBatch(@RequestBody JSONObject jobj){
		//step0  参数验证
		Map result = parametersValidate(jobj, new String[]{"pname","spid","className","sclassid"}, true, String.class);
		if(null == result.get(Result.SUCCESS))	return result;
		result = parametersValidate(jobj, new String[]{"customers"}, true, JSONArray.class);
		if(null == result.get(Result.SUCCESS))	return result;
		JSONArray customers = jobj.getJSONArray("customers");
		JSONObject customer = null;
		if(customers.size() > 0){
			customer = customers.getJSONObject(0);
			result = parametersValidate(customer, new String[]{"name","qq","tel","province","city","country","username","workunit","workStatus","xindeStatus","learnStage","email","gender","title","job","subject","userType","lastLogin"}, true, String.class);
			if(null == result.get(Result.SUCCESS))	return result;
			result = parametersValidate(customer, new String[]{"hasStudyVideo","videoTotal","loginCount"}, true, Integer.class);
			if(null == result.get(Result.SUCCESS))	return result;
		}

		//step1 find project
		String projectName = jobj.getString("pname"),
				spid = jobj.getString("spid");
		Project project = projectDao.findByNameAndSPID(projectName, spid);
		if(null == project)	{
			project = new Project();
			project.setName(projectName);
			project.setSpid(spid);
			project = projectDao.saveOrUpdateWithBack(project);
		}
		//step2 find class
		String className = jobj.getString("className"),
				 sclassid = jobj.getString("sclassid");
		
		Class c = classDao.findByNameAndScid(className, sclassid);
		if(null == c){
			c = new Class();
			c.setName(className);
			c.setSclassid(sclassid);
			System.out.println("--------存时间--------");
			c.setCreateTime((Long)System.currentTimeMillis());
			c.setProjectId(project.getProjectId());
			c = classDao.saveOrUpdateWithBack(c);
		}
	
		//step3 save customer batach
		return customerDao.batchSaveByClass(c.getClassId(), customers);
	}
	
	@RequestMapping(value="/getClassList.json", method = RequestMethod.GET)
	public @ResponseBody Object getClassList(){
		List classes = classDao.findClassList();
		return Result.success(classes);
	}
	
}
