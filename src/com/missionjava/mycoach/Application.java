package com.missionjava.mycoach;

public class Application {
	
	public static void main(String[] args) {
		
		Coach bCoach = new TrackCoach();
		
		System.out.println(bCoach.getDailyWorkout());
	}

}
