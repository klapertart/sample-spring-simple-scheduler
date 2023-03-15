package klapertart.lab.scheduler.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author TRITRONIK-PC_10040
 * @since 15/03/2023
 */

@Component
public class Scheduler {
    @Scheduled(cron = "5 * * * * ?")
    public void scheduleTaskUsingCronExpression() {

        long now = System.currentTimeMillis() / 1000;
        System.out.println(
                "schedule tasks using cron jobs - " + now);
    }
}
