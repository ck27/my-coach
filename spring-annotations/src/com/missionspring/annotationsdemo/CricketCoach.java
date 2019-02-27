package com.missionspring.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("databaseFortuneService")
	FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach - Default Constructor");
	}
	
	/*
	@Autowired
	public void setFortuneService(FortuneService aFortuneService) {
		System.out.println("CricketCoach - Setter Injection");
		this.fortuneService = aFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 30mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You will get a hat-trick!";
	}

}
