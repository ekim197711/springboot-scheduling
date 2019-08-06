package com.codeinvestigator.demoscheduling.space;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpaceShipLauncher {

    @Scheduled(fixedDelay = 5*1000, initialDelay = 10*1000)
    private void launchRocket(){
        log.info("Launch Spaceship... Hummmmmmmm");
    }


    @Scheduled(fixedRate = 3*1000, initialDelay = 10*1000)
    private void launchSatellite(){
        log.info("Launch Satellite");
    }

    @Scheduled(cron = "3 41 * * * *", zone = "")
    private void communicateWithAliens(){
        log.info("Ping aliens");
    }


}
