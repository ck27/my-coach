package com.missionspring.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.missionspring.hibernatedemo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// Create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		// get Session
		Session session = factory.getCurrentSession();

		try {
			// start a transaction
			session.beginTransaction();

			int studentId = 2;
			Student aStudent = session.get(Student.class, studentId);

			session.delete(aStudent);

			session.getTransaction().commit();

			// Get a session
			session = factory.getCurrentSession();

			// begin a new transaction
			session.beginTransaction();

			System.out.println("Delete using custom query");

			session.createQuery("delete from Student where id=2").executeUpdate();

			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			session.close();
			factory.close();
		}

	}

}
