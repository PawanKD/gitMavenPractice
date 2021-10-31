package com.pawan.runner;


import org.testng.annotations.Test;

import com.pawan.steps.Steps;

public class Runner {

	@Test
	public void runner() {
		// TODO Auto-generated method stub\
		
		System.out.println("Runner Working Fine");
		
		Steps step = new Steps();
				
		step.stepMethod();

	}

}
