package com.hib.DaoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hib.Dao.HibernateDao;
import com.hib.entity.Student;
import com.hib.entity.StudentDetails;
import com.hib.entity.Subject;

public class HibernateDaoImp implements HibernateDao
{
	
	
	Session session;
	private Transaction t;
	private int ArrayList;
	private int Student;
	public HibernateDaoImp()
	{
		 session=new Configuration()
				.configure("hibernate.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.addAnnotatedClass(Subject.class)
				.buildSessionFactory()
				.openSession();
	}
	
	@Override
	public void insertStudent(Student s) 
	{
		 t=session.beginTransaction() ;
		  session.persist(s);
		  t.commit();
		  System.out.println("Data Inserted");
		           
		
	}

	@Override
	public ArrayList<Student> fetchAll() 
	{
		
		return (ArrayList<Student>) session.createQuery("from Student").list();
	}

	

	@Override
	public Student fetchOne(int sid) {
		
		return session.get(Student.class,sid);
	}

	public void delete(int sid) {
		session.beginTransaction();
		session.delete(fetchOne(sid));
		session.getTransaction().commit();
		System.out.println("Data Deleted");
	}

	public void updateStudent(String email, int sid) 
	{
		
		session.beginTransaction();
		
		
		Student s=session.get(Student.class,sid);
		
		if(s!=null)
		{
			s.setEmail(email);
			session.persist(s);
		}
		
		session.getTransaction().commit();
	}

	@Override
	public void fetchAll1() {
		// TODO Auto-generated method stub
		
	}

	public void insertStudentDetails(StudentDetails sds) {
		t=session.beginTransaction() ;
		  session.persist(sds);
		  t.commit();
		  System.out.println("Data Inserted");
		 
	}
	
	public void updateStudentWithSD(String email,String city, int sid) 
	{
		
		session.beginTransaction();
		
		
		Student s=session.get(Student.class,sid);
		
		if(s!=null)
		{
			
			
			s.setEmail(email);
			s.getStudentDetails().setCity(city);
			session.persist(s);
		}
		
		session.getTransaction().commit();
	
	
	
	}
	
	
	
	
	
}
