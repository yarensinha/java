package com.luv2code.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get beans from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// close the context
		context.close();

	}

}
