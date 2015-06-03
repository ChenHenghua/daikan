package com.hltc.dao;

import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;

import com.hltc.entity.Customer;

public interface ICustomerDao extends GenericDao<Customer>{
	/**
	 * 一次性保存一个班级的客户信息
	 * @param classId
	 * @param customers
	 * @return
	 */
	public HashMap batchSaveByClass(Short classId, JSONArray customers);
	
}
