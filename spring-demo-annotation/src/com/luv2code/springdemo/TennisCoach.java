package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.*;

//@Component("thatSillyClass")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
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

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">>TeniisCoach : inside doMyStartupStuff()");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">>TeniisCoach : inside doMyCleanupStuff()");
    }
}
