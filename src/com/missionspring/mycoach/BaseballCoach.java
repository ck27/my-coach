package com.missionspring.mycoach;

public class BaseballCoach implements Coach{
	
	private FortuneService myFortuneService;
	
	public BaseballCoach(FortuneService myFortuneService) {
		// TODO Auto-generated constructor stub
		this.myFortuneService = myFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return this.myFortuneService.getFortune();
	}

}
