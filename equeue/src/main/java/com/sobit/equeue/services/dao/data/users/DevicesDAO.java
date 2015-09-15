package com.sobit.equeue.services.dao.data.users;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;


import com.sobit.equeue.entities.Filial;
 
import com.sobit.equeue.services.util.HibernateUtil;
 
@Service("FilialDAO")

public class DevicesDAO {
 
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	 
	public DevicesDAO() {
	 
	}
	public List<Filial> getFilial()
	 
	{
	 
	Session s=sessionFactory.openSession();
	 
	List<Filial> filial= s.createCriteria(Filial.class).list();
	 
	s.close();
	return filial;
	 
	}
	 
	public Filial getFilial(int id)
	 
	{
	 
	Session s=sessionFactory.openSession();
	 
	Criteria cr=s.createCriteria(Filial.class);
	 
	cr.add(Restrictions.eq("id", id));
	 
	Filial filial=(Filial) cr.list().get(0);
	 
	s.close();
	return filial;
	 
	}
}