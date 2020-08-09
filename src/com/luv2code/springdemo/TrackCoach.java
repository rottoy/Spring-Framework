package com.luv2code.springdemo;

public class TrackCoach implements Coach {



	private FortuneService fortuneService;

	public TrackCoach(){
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










