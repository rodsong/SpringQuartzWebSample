package com.salil.example.springquartz;


import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.util.concurrent.ExecutorService;

public class ContextClosedHandler implements ApplicationListener<ContextClosedEvent> {

    private final Logger LOGGER = LoggerFactory.getLogger(ContextClosedHandler.class);

    @Autowired
    private Scheduler schedulerFactoryBean;


    /*
     * (non-Javadoc)
     *
     * @see
     * org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework
     * .context.ApplicationEvent)
     */
    @Override
    public void onApplicationEvent(ContextClosedEvent arg0) {
        LOGGER.info("executorService.shutdown");
        //executorService.shutdown();

        try {
            schedulerFactoryBean.shutdown(true);
            Thread.sleep(1000);
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}