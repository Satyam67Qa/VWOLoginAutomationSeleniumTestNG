package com.Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

    private static  Logger logger = LogManager.getLogger(Log4jDemo.class);
    public static void main(String[] args) {

        System.out.println("\n hello   \n ");

        logger.trace("this is trace messge");
        logger.info("This is info message ");
        logger.error("this is error message ");
        logger.warn("this is waring message ");
        logger.fatal("this is fatal meaage ");
        System.out.println("\n complete the logg ");


    }
}
