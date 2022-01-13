package com.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCApp {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoachService", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortuneService());
		
		context.close();
	}

}
