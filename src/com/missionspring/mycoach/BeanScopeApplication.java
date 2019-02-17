package com.missionspring.mycoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApplication {
	
	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-config.xml");
		
		System.out.println("Context Initialized");
		
		//retrieve bean from spring container
		Coach bCoach = context.getBean("bCoach", Coach.class);
		
		//call methods using bean
		System.out.println(bCoach.getDailyWorkout());
		System.out.println(bCoach.getDailyFortune());
		
		//retrieve bean from spring container
		Coach bbCoach = context.getBean("bCoach", Coach.class);
		
		//call methods using bean
		System.out.println(bbCoach.getDailyWorkout());
		System.out.println(bbCoach.getDailyFortune());
		System.out.println("Pointing to same object : " + bCoach.equals(bbCoach));
		
		Coach tCoach = context.getBean("tCoach", Coach.class);
		
		//call methods using bean
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyFortune());
		
		Coach cricketCoach = context.getBean("tCoach", Coach.class);
		
		//call methods using bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		System.out.println("Pointing to same object : " + tCoach.equals(cricketCoach));
		
		//close app context
		context.close();
	}

}
