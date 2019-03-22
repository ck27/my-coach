package com.missionspring.mycoach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
}
