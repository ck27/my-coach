package com.missionspring.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Coach aTennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(aTennisCoach.getDailyWorkout());
		System.out.println(aTennisCoach.getDailyFortune());
		
		Coach aCricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(aCricketCoach.getDailyWorkout());
		System.out.println(aCricketCoach.getDailyFortune());
		
		context.close();
	}

}
