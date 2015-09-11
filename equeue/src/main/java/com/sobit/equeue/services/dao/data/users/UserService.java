package com.sobit.equeue.services.dao.data.users;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;


import com.sobit.equeue.entities.Users;
 
import com.sobit.equeue.services.util.HibernateUtil;
 
@Service("userService")

public class UserService {
	private static final AtomicInteger counter = new AtomicInteger();
	
	private static List<Users> users;
	
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	 
	public UserService() {
	 
	}
	
	 public Users findById(int id) {
		 Session s=sessionFactory.openSession();
		   
		 Users user=(Users)s.load(Users.class, id);
			s.close();    
			return user;
		 
		
	    }
	     
	    public Users findByLogin(String logg) {
	    	Session s=sessionFactory.openSession();
		    Users user=(Users)s.load(Users.class, logg);
			s.close();    
			return user;
	    }
	
	public List<Users> getUsers()
	 
	{
	 
	Session s=sessionFactory.openSession();
	List<Users> users= s.createCriteria(Users.class).list();
	s.close();
	return users;
	 
	}
	 
	public Users getUsers(int id)
	 
	{
	 
	Session s=sessionFactory.openSession();
	Criteria cr=s.createCriteria(Users.class);
	cr.add(Restrictions.eq("id", id));
	Users users=(Users) cr.list().get(0);
	s.close();
	return users;
	 
	}
	
	public void saveUser(Users user) {
		user.setid(counter.incrementAndGet());
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(user);
        s.getTransaction().commit();
        if (s.isOpen()) {
            s.close();
        }
		
		
    }
 
    public void updateUser(Users user) {
    	Session s=sessionFactory.openSession();
    	s.beginTransaction();
        s.update(user);
        s.getTransaction().commit();
        if (s.isOpen()) {
            s.close();
        }
    }
 
    public void deleteUserById(int id) {
         
        for (Iterator<Users> iterator = users.iterator(); iterator.hasNext(); ) {
            Users user = iterator.next();
            if (user.getid() == id) {
                iterator.remove();
            }
        }
    }
    public boolean isUserExist(Users user) {
        return findByLogin(user.getLogin())!=null;
    }
     
    public void deleteAllUsers(){
        users.clear();
    }
		}