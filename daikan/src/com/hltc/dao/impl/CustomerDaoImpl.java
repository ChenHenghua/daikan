package com.hltc.dao.impl;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hltc.common.ErrorCode;
import com.hltc.common.Result;
import com.hltc.dao.ICustomerDao;
import com.hltc.dao.IUserDao;
import com.hltc.entity.Customer;
import com.hltc.entity.User;
import com.hltc.util.HibernateUtil;

@Repository("customerDao")
public class CustomerDaoImpl extends GenericHibernateDao<Customer> implements ICustomerDao{

	@Override
	public HashMap batchSaveByClass(Short classId, JSONArray customers) {
		Session session = getSession();
		try{
			session.beginTransaction();
			Integer i = 0;
			for(Object o : customers){
				i++;
				System.out.println("第："+i+"个");
				JSONObject j = (JSONObject)o;
				String userName = (String)j.get("username"),
						 name = (String)j.get("name"),
						 tel = (String)j.get("tel");
						userName = null == userName ? "":userName;
						name = null == name ? "":name;
						tel = null == tel ? "" : tel;
				Customer customer = findByTelAndUserNameAndName(tel, userName, name);
				if(null == customer)	customer = new Customer();
				
				Long qq = null;
				try{ 
					String str = (String)j.get("qq");
					if(null == str || "".equals(str)){
						qq = (long)0;
					}else{
						qq = Long.valueOf(str);
					}
				}catch(Exception e){
					qq = (long)0;
					customer.setRemarks("qq:"+(String)j.get("qq"));
				}
				customer.setClassId(classId);
				customer.setQq(qq);
				customer.setTel(tel);
				customer.setProvince(j.getString("province"));
				customer.setCity(j.getString("city"));
				customer.setCity(j.getString("country"));
				customer.setUsername(userName);
				customer.setName(name);
				customer.setWorkunit(j.getString("workunit"));
				customer.setHasStudyVideo((short)j.getInt("hasStudyVideo"));
				customer.setVideoTotal((short)j.getInt("videoTotal"));
				customer.setWorkStatus(j.getString("workStatus"));
				customer.setXindeStatus(j.getString("xindeStatus"));
				customer.setLearnStage(j.getString("learnStage"));
				customer.setEmail(j.getString("email"));
				customer.setLoginCount((short)j.getInt("loginCount"));
				customer.setGender(j.getString("gender"));
				customer.setTitle(j.getString("title"));
				customer.setJob(j.getString("job"));
				customer.setSubject(j.getString("subject"));
				customer.setUserType(j.getString("userType"));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
				Date date = null;
				try{
					String str = j.getString("lastLogin");
					if("".equals(str)) str = "1970/1/1 00:00:00" ;
					date = sdf.parse(str);
					customer.setLastLogin(date.getTime());
				}catch(Exception e){
					return Result.fail(ErrorCode.PARAMS_ERROR, "wrong format of parameter lastLogin");
				}
				session.merge(customer);
				if(i % 30 == 0){
					session.flush();
					session.clear();
				}
			}
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			HibernateUtil.closeSession();
		}
	
		return Result.success();
	}

	private Customer findByClassIdAndUserNameAndName(Short classId,
			String userName, String name) {
		Session session = null;
		List list = null;
		try{
			session = getSession();
			list =session.createQuery("from Customer where classId = :classId and username = :username and name = :name")
					   .setParameter("classId", classId)
					   .setParameter("username", userName)
					   .setParameter("name", name)
					   .list();
			return list.size() > 0 ? (Customer)list.get(0) : null;
		}catch(Exception e){
			e.printStackTrace();
		}  //私有方法，不关闭session，在调用者中关闭session
		return null;
	}
	
	private Customer findByTelAndUserNameAndName(String tel,
			String userName, String name) {
		Session session = null;
		List list = null;
		try{
			session = getSession();
			list =session.createQuery("from Customer where tel = :tel and username = :username and name = :name")
					   .setParameter("tel", tel)
					   .setParameter("username", userName)
					   .setParameter("name", name)
					   .list();
			return list.size() > 0 ? (Customer)list.get(0) : null;
		}catch(Exception e){
			e.printStackTrace();
		}  //私有方法，不关闭session，在调用者中关闭session
		return null;
	}
}
