package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyClass")
@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice my SpringFramework";
    }
}
