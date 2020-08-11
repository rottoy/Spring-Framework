package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        //load the Spring config file
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        boolean result = (theCoach==alphaCoach);

        //print out the results
        System.out.println("Pointing to the same object"+result);
        System.out.println("Memory Location for theCoach :"+theCoach);
        System.out.println("Memory Location for alphaCoach :"+alphaCoach);

        //context close
        context.close();
    }
}
