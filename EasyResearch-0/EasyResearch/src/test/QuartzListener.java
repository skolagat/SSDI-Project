package test;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzListener implements ServletContextListener {
        Scheduler scheduler = null;

        @Override
        public void contextInitialized(ServletContextEvent servletContext) {
                System.out.println("Context Initialized");
                
                try {
                        
                        JobDetail job = newJob(QuartzJob.class).withIdentity(
                                        "CronQuartzJob", "Group").build();
                        Trigger trigger = newTrigger()
                        .withIdentity("TriggerName", "Group")
                        .withSchedule(CronScheduleBuilder.cronSchedule("0 43 22 * * ?"))
                        .build();

                    
                        scheduler = new StdSchedulerFactory().getScheduler();
                        scheduler.start();
                        scheduler.scheduleJob(job, trigger);
                }
                catch (SchedulerException e) {
                        e.printStackTrace();
                }
        }

        @Override
        public void contextDestroyed(ServletContextEvent servletContext) {
                System.out.println("Context Destroyed");
                try 
                {
                        scheduler.shutdown();
                } 
                catch (SchedulerException e) 
                {
                        e.printStackTrace();
                }
        }
}