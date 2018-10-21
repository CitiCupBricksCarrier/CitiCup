package com.citicup.dao.peValuation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerTask {
    private int count=0;

    @Scheduled(cron = "0 0/1 17 * * ?")//每分钟都执行
    private void process() {
        System.out.println("this is scheduler task running "+(count++));
    }
}
