package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySecondApp {
    public static void main(String[] args) {

        //load a spring configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MySecondConfig.class);

        //retrieve beans from the container
        MySecondCoach theCoach = context.getBean(MySecondCoach.class);


        //print results
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getTeam());
        System.out.println(theCoach.getEmail());

        //close context
        context.close();
    }
}
