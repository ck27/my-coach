package com.missionspring.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach - Default Constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService aFortuneService) {
		System.out.println("CricketCoach - Setter Injection");
		this.fortuneService = aFortuneService;
	}

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
