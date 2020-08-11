package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyClass")
@Component
public class TennisCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;

    //define a constructor
//    @Autowired
//    TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

    //define a setter method
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "Practice my SpringFramework";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
