package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MySecondCoach implements Coach {

    private MySecondFortuneService mySecondFortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public MySecondCoach(MySecondFortuneService mySecondFortuneService) {
        this.mySecondFortuneService=mySecondFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "i study in sin-gong";
    }

    @Override
    public String getDailyFortune() {
        return mySecondFortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
