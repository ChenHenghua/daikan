package com.hltc.dao;

import java.util.List;

import com.hltc.entity.Class;

public interface IClassDao extends GenericDao<Class>{
	/**
	 * 通过班级名称和网站班级id来查询
	 * @param className
	 * @param scid
	 * @return
	 */
	public Class findByNameAndScid(String className, String scid);
	
	/**
	 * 获得班级列表，并且按照班级名称排序
	 * @return
	 */
	public List findClassList();
}
