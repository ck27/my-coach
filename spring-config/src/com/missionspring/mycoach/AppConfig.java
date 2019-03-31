package com.missionspring.mycoach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sports.properties")
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
