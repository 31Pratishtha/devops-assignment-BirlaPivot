package com.telusko.simpleWebApp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class LoggerService {
    Logger logger = LoggerFactory.getLogger(LoggerService.class);

//    @RequestMapping("/log")
//    public String log()
//    {
//        // Logging various log level messages
//        logger.trace("Log level: TRACE");
//        logger.info("Log level: INFO");
//        logger.debug("Log level: DEBUG");
//        logger.error("Log level: ERROR");
//        logger.warn("Log level: WARN");
//
//        return "Hey! You can check the output in the logs";
//    }

    public void performTask(){
        logger.info("Performing a task...");
        logger.debug("Debugging task execution...");
        logger.warn("This is a warning!");
        logger.error("Something went wrong!");
    }
}
