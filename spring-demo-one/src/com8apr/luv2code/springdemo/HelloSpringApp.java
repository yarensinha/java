package com8apr.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve beans
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		//call for fortune service
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
