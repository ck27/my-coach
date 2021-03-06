package com.missionspring.annotationsdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfiguredApplication {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Coach aTennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(aTennisCoach.getDailyWorkout());
		System.out.println(aTennisCoach.getDailyFortune());
		
		Coach aCricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(aCricketCoach.getDailyWorkout());
		System.out.println(aCricketCoach.getDailyFortune());
		
		Coach rcbCoach = context.getBean("cricketCoach", Coach.class);
		
		boolean sameCricketBeans = aCricketCoach == rcbCoach;
		System.out.println("fCoach and manuCoach are the same " + sameCricketBeans);
		System.out.println("fCoach memory location " + aCricketCoach);
		System.out.println("manuCoach memory location " + rcbCoach);
		
		
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		
		Coach fCoach = context.getBean("footballCoach", Coach.class);
		System.out.println(fCoach.getDailyWorkout());
		System.out.println(fCoach.getDailyFortune());
		
		Coach manuCoach = context.getBean("footballCoach", Coach.class);
		
		boolean sameBeans = fCoach == manuCoach;
		System.out.println("fCoach and manuCoach are the same " + sameBeans);
		System.out.println("fCoach memory location " + fCoach);
		System.out.println("manuCoach memory location " + manuCoach);
		
		context.close();
	}

}
