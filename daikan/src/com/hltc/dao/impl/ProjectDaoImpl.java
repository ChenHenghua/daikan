package com.hltc.dao.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hltc.dao.IProjectDao;
import com.hltc.dao.IUserDao;
import com.hltc.entity.Project;
import com.hltc.entity.User;

@Repository("projectDao")
public class ProjectDaoImpl extends GenericHibernateDao<Project> implements IProjectDao{

	@Override
	public Project findByNameAndSPID(String projectName, String spid) {
		Session session = getSession();
		List list = null;
		try{
		 list = session.createQuery("from Project where name = :name and spid = :spid ").setParameter("name", projectName).setParameter("spid", spid).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
		
		return list.size() > 0 ? (Project)list.get(0) : null;
	}
}
