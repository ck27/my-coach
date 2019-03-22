package com.missionspring.mycoach;

public class SwimCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Warm up swim for 1000m";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
