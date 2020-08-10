package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach : inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach : inside setter method - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    //add new fields for emailAddress and team
    private String emailAddress;
    private String team;


    //create a no-arg constructor
    public CricketCoach(){
        System.out.println("CricketCoach : inside no-arg constructor");
    }
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach : inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: "+fortuneService.getFortune();
    }

}










