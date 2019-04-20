package com.missionspring.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.missionspring.hibernatedemo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		
		// Create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		// get Session
		Session session = factory.getCurrentSession();
		
		
		try {
			// create 3 java objects
			Student student1 = new Student("Rob", "Stark", "rob.stark@gmail.com");
			Student student2 = new Student("Bran", "Stark", "bran.stark@gmail.com");
			Student student3 = new Student("Arya", "Stark", "arya.stark@gmail.com");
	
			// start a transaction
			session.beginTransaction();
			
			// save object
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			// commit transaction 
			session.getTransaction().commit();
			
		} catch (Exception e) {
			factory.close();
		}
		
	}

}
