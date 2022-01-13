package com.ioc;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do Cricket Stuff";
		
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

}
