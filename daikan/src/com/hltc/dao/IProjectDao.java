package com.hltc.dao;

import com.hltc.entity.Project;

public interface IProjectDao extends GenericDao<Project>{
	
	/**
	 * 通过项目名称和网站系统中的id来获取project对象
	 * @param projectName
	 * @param spid
	 * @return
	 */
	public Project findByNameAndSPID(String projectName, String spid);
}
