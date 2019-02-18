package com.missionspring.mycoach;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String email) {
		this.emailAddress = email;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return this.team + " ( " + this.emailAddress +" ) : Practice fast bowling for 30mins";
	}

	@Override
	public String getDailyFortune() {
		return "You will get a hat-trick";
	}

}
