package com.missionspring.mycoach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Coach swimCoach = appContext.getBean("swimCoach", Coach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
	}

}
