package com.salil.example.springquartz;

import org.quartz.Trigger;

public class RunMeTask {

	public void printMe(Trigger trigger) {

		System.out.println(trigger.getName() + "# Next Fire Time: " + trigger.getNextFireTime());
	}
}