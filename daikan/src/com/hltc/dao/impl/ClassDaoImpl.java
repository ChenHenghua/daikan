package com.hltc.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import com.hltc.dao.IClassDao;
import com.hltc.entity.Class;

@Repository("classDao")
public class ClassDaoImpl extends GenericHibernateDao<Class> implements IClassDao{

	@Override
	public Class findByNameAndScid(String className, String scid) {
		Session session = getSession();
		List list = null;
		try {
			list = session.createQuery("from Class where name = :name and sclassid =:scalssid ").setParameter("name", className).setParameter("scalssid", scid).list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return list.size() > 0 ? (Class)list.get(0) : null;
	}

	public static void main(String[] args) {
		ClassDaoImpl dao = new ClassDaoImpl();
		Class c = dao.findByNameAndScid("sdfsd", "sdf");
		System.out.println(c);
	}

	@Override
	public List findClassList() {
		Session session = null;
		try{
			session = getSession();
			return session.createQuery("from Class order by name desc").list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}
}
