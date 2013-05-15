package com.salil.example.springquartz;

import org.springframework.scheduling.quartz.CronTriggerBean;

public class MyCronTriggerBean extends CronTriggerBean {

	private static final long serialVersionUID = 5857416874298744073L;

	@Override
	public void afterPropertiesSet() throws Exception {
		super.afterPropertiesSet();
         // Cron Trigger, run every 5 seconds
		super.setCronExpression("0/5 * * * * ?");
	}

}