package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TrackCoach theCoach = context.getBean("myTrackCoach",TrackCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}
