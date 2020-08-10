package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;


	//create a no-arg constructor
	public TrackCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "null";
	}

	//add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach : inside method doMyStartupStuff");
	}


	//add a destroy method
	public void doMyCleanupStuffYoYo(){
		System.out.println("TrackCoach : inside method doMyCleanupStuffYoYo");
	}

}










