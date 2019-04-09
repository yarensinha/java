package com.luv2code.springdemo.ioc;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}

}
