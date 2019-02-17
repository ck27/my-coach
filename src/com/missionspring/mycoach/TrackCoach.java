package com.missionspring.mycoach;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService myFortuneService) {
		this.fortuneService = myFortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter Injection");
		this.fortuneService = fortuneService;
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
