package com.ioc;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do Baseball stuff";
		
	}

	@Override
	public String getFortuneService() {
		
		return fortuneService.getFortune()
				;
	}
	
	

}
