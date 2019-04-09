package com.luv2code.springdemo.ioc;

import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Improve your debugging skills";
	}

}
