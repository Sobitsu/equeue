package com.sobit.equeue.services.dao.data.users;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import com.sobit.equeue.entities.UsersRole;
import com.sobit.equeue.services.util.HibernateUtil;

public class UsersRoleDAO {
   SessionFactory sessionFactory=HibernateUtil.getSessionFactory() ;
   
   public UsersRoleDAO(){
	   
   }
   public List<UsersRole> getUsersRole(){
	   Session s = sessionFactory.openSession();
	   List<UsersRole> usersrole = s.createCriteria(UsersRole.class).list();
	   s.close();
	   return usersrole;
   }
   
   public UsersRole getUsersRole(int id){
	   Session s = sessionFactory.openSession();
	   Criteria cr = s.createCriteria(UsersRole.class);
	   cr.add(Restrictions.eq("id", id));
	   UsersRole ur = (UsersRole) cr.list().get(0);
	   s.close();
	   return ur;
   }
}
