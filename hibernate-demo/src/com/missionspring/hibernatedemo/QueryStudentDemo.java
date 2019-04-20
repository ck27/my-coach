package com.missionspring.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.missionspring.hibernatedemo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		
		// Create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		// get Session
		Session session = factory.getCurrentSession();
		
		
		try {
	
			// start a transaction
			session.beginTransaction();

			// Fetch List from createQuery
			List<Student> students = session.createQuery("from Student as s where s.lastName like 'Stark'").getResultList();
			
			session.getTransaction().commit();
			// session.close();
			
			// commit transaction 
						
			students.stream().forEach(System.out::println);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			factory.close();
		}
		
	}

}
