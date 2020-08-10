package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		//load the Spring Config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("myApplicationContext.xml");

		//retrieve beans from spring container
		CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		CricketCoach alphaCoach = context.getBean("myCoach",CricketCoach.class);

		//compare scope between two beans
		boolean result = (theCoach==alphaCoach);
		System.out.println("Are we pointing same object : "+result);

		//close the context
		context.close();
	}

}
