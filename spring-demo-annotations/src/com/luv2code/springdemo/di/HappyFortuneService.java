package com.luv2code.springdemo.di;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "All the best for today";
	}

}
