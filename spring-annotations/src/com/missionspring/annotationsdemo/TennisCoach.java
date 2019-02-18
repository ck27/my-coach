package com.missionspring.annotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice quick serves for 1 hour";
	}

}
