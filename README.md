===
& Readme:

spring's version 3.1.2RELEASE
quartz-scheduler's version 1.8.6

context:spring mvc


& Question.

Following message will be print in console or log file when I shutdown this app by tomcat's manager page.
 org.springframework.scheduling.quartz.SchedulerFactoryBean#0_Worker-10 but has failed to stop it. This is very likely to create a memory leak.


So I add a context close event. detail refer to class ContextClosedHandler.java
