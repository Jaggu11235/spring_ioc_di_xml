package com.ioc;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a sad Fortune Service";
	}

}
