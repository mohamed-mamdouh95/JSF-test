package project.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.utility.HibernateUtil;
import project.tables.User;

public class UserDao 
{
	public static void addStudent(User user)
	{
		Session session = HibernateUtil.getMySessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
	
	public static boolean getByUserNameAndPassword(String username , String password )
	{
		Session session = HibernateUtil.getMySessionFactory().openSession();
		session.beginTransaction();
		Query query = session.getNamedQuery("User.byUserNameAndPassword");
		query.setString(0,username);
		query.setString(1, password);
		List u =  query.list();
		if(u.size() > 0) 
		{
			return true;
		}
		return false;
	}

}
