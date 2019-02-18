package com.missionspring.mycoach;

public class BaseballCoach implements Coach{
	
	private FortuneService myFortuneService;
	
	public BaseballCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
		System.out.println("Constructor Injection");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return this.myFortuneService.getFortune();
	}
	
	public void onInit() {
		System.out.println(this.getClass() + " -> OnInit");
	}
	
	public void onDestroy() {
		System.out.println(this.getClass() + " -> OnDestroy");
	}

}
