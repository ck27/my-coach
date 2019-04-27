package com.missionspring.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.missionspring.hibernatedemo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		
		// Create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		// get Session
		Session session = factory.getCurrentSession();
		
		
		try {
			// start a transaction
			session.beginTransaction();
			
			int studentId = 1;
			Student aStudent = session.get(Student.class, studentId);
			
			if(aStudent != null) {
				System.out.println(aStudent);
				aStudent.setEmail("chethan@gmail.com");
			} else {
				System.out.println("Student NOT FONUND with id " + aStudent.getId());
			}
			System.out.println(aStudent);
			// No need for to call save or update explicitly
			
			session.getTransaction().commit();
			
			
			// Get a session
			session = factory.getCurrentSession();
			
			// begin a new transaction
			session.beginTransaction();
			
			System.out.println("Bulk Update");
			
			session.createQuery("update Student set email = 'spring@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();
			
			session.close();
			
		} catch (Exception e) {
			factory.close();
		}
		
	}

}
