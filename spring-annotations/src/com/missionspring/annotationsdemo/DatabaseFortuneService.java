package com.missionspring.annotationsdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	
	Random myRandomMessage = new Random();
	
	String[] messages = {
			"Winter is Coming!",
			"Hear me roar",
			"Fire and Blood",
			"Family, Duty, Honour",
			"Ours is the Fury"
	};

	@Override
	public String getFortune() {
		return messages[myRandomMessage.nextInt(messages.length)];
	}

}
