package com.missionspring.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach - Default Constructor");
	}
	
	/**
	@Autowired
	public TennisCoach(FortuneService aFortuneService) {
		this.fortuneService = aFortuneService;
		System.out.println("TennisCoach - Constructor Injection");
	}
	**/

	@Override
	public String getDailyWorkout() {
		return "Practice quick serves for 1 hour";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
