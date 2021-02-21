package com.paradox.geeks.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {
    private String getCurrentFormattedDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        return simpleDateFormat.format(now);
    }

//    @Scheduled(cron = "0 * 9 * * ?")
//    public void cronJobSch() {
//        System.out.println("Java cron job expression:: " + getCurrentFormattedDate());
//    }
//
//    @Scheduled(fixedRate = 1000)
//    public void fixedRateSch() {
//        System.out.println("Fixed Rate scheduler:: " + getCurrentFormattedDate());
//    }
//
//    @Scheduled(fixedDelay = 1000, initialDelay = 3000)
//    public void fixedDelaySch() {
//        System.out.println("Fixed Delay scheduler:: " + getCurrentFormattedDate());
//    }
}
