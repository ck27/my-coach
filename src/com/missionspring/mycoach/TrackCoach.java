package com.missionspring.mycoach;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService myFortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
