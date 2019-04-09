package com.luv2code.springdemo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> Inside default constructor");
	}
	
	// Method injection
		@Autowired
		public void doSomeCrazyStuff(FortuneService theFortuneService)
		{
			System.out.println(">> Inside do some crazy stuff method");
			fortuneService = theFortuneService;
		}
		
	
	/*// Setter injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> Inside setter method");
		fortuneService = theFortuneService;
	}
	*/
	// Constructor injection
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
