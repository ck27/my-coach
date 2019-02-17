package com.missionspring.mycoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("Context Initialized");
		
		//retrieve bean from spring container
		Coach bCoach = context.getBean("bCoach", Coach.class);
		
		//call methods using bean
		System.out.println(bCoach.getDailyWorkout());
		System.out.println(bCoach.getDailyFortune());
		
		Coach tCoach = context.getBean("tCoach", Coach.class);
		
		//call methods using bean
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyFortune());
		
		Coach cricketCoach = context.getBean("indCoach", Coach.class);
		
		//call methods using bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		//close app context
		context.close();
	}

}
