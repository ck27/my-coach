package com.missionspring.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService aFortuneService) {
		this.fortuneService = aFortuneService;
		System.out.println("Injected");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice quick serves for 1 hour";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
