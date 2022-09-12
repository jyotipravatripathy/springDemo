package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springConfig.SpringConfig;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMain {

	public static void main(String[] args) {
		
//      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		    System.out.println("--------------Cricket Coach-------------");
			SportCoach spCoach = ctx.getBean("cricketCoach",SportCoach.class);
			System.out.println("The timing is :- "+spCoach.getTrainingScedule());
			System.out.println("The advice is :- "+spCoach.getAdvice());
			
			System.out.println("--------------Football Coach-------------");
			spCoach = ctx.getBean("FootballCoach",SportCoach.class);
			System.out.println("The timing is :- "+spCoach.getTrainingScedule());
			System.out.println("The advice is :- "+spCoach.getAdvice());
		
		
	}

}
