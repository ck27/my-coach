package com.missionspring.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Coach aTennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(aTennisCoach.getDailyWorkout());
		
		Coach bTennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(bTennisCoach.getDailyWorkout());
		
		System.out.println(aTennisCoach.equals(bTennisCoach));
		
		
		context.close();
	}

}
