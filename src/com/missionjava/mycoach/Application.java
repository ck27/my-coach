package com.missionjava.mycoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//retrieve bean from spring container
		Coach bCoach = context.getBean("myCoach", Coach.class);
		
		//call methods using bean
		System.out.println(bCoach.getDailyWorkout());
		
		//close app context
		context.close();
	}

}
