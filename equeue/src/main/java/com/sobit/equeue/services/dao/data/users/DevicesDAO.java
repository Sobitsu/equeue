package com.sobit.equeue.services.dao.data.users;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;


import com.sobit.equeue.entities.Devices;
 
import com.sobit.equeue.services.util.HibernateUtil;
 
@Service("DevicesDAO")

public class DevicesDAO {
 
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	 
	public DevicesDAO() {
		
	}
	
	public List<Devices> getDevices(){
	 
	Session s=sessionFactory.openSession();
	 
	List<Devices> devices= s.createCriteria(Devices.class).list();
	 
	s.close();
	return devices;
	 
	}
	 
	public Devices getDevices(int id){
	 
	Session s=sessionFactory.openSession();
	 
	Criteria cr=s.createCriteria(Devices.class);
	 
	cr.add(Restrictions.eq("id", id));
	 
	Devices devices=(Devices) cr.list().get(0);
	 
	s.close();
	return devices;
	 
	}
}