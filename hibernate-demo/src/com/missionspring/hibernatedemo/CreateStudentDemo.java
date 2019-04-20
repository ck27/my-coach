package com.missionspring.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.missionspring.hibernatedemo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		
		// Create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		// get Session
		Session session = factory.getCurrentSession();
		
		
		try {
			// create java object
			Student aStudent = new Student("John", "Doe", "john.doe@gmail.com");
	
			// start a transaction
			session.beginTransaction();
			
			// save object
			session.save(aStudent);
			
			// commit transaction 
			session.getTransaction().commit();
			
		} catch (Exception e) {
			factory.close();
		}
		
	}

}
