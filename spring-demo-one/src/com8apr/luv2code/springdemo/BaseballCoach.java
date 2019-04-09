package com8apr.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field for dependancy
	private FortuneService fortuneService;

	// define a constructor for DI
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;

	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting pratise";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneservice to get fortune
		return fortuneService.getFortune();
	}

}
