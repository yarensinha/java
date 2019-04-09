package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retreive bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print result
		System.out.println("\nPointing to same object : "+result);
		System.out.println("\nMemory location of object for theCoach "+ theCoach);
		System.out.println("\nMemory location of object for alphacoach "+ alphaCoach);
	}

}
