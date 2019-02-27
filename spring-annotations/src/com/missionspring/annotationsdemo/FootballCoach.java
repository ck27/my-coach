package com.missionspring.annotationsdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void doPostStartUpStuff() {
		System.out.println(">> doPostStartUpStuff()");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Corner Kick for the 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	@PreDestroy
	public void doPreDestroyStuff() {
		System.out.println(">> doPreDestroyStuff()");
	}

}
