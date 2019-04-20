package com.missionspring.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.missionspring.hibernatedemo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		
		// Create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		// get Session
		Session session = factory.getCurrentSession();
		
		
		try {
			// create java object
			Student aStudent = new Student("Jane", "Doe", "jane.doe@gmail.com");
	
			// start a transaction
			session.beginTransaction();
			
			// save object
			session.save(aStudent);
			
			// commit transaction 
			session.getTransaction().commit();
			
			// Show generated Id
			System.out.println("Save Student with Id " + aStudent.getId());
			
			
			// start a new transaction
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			Student savedStudent = session.get(Student.class, aStudent.getId());
			
			if(savedStudent != null) {
				System.out.println(savedStudent);
			} else {
				System.out.println("Student NOT FONUND with id " + aStudent.getId());
			}
			
			
			
		} catch (Exception e) {
			factory.close();
		}
		
	}

}
