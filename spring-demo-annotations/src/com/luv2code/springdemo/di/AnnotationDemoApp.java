package com.luv2code.springdemo.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContextDI.xml");
		
		// get beans from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
