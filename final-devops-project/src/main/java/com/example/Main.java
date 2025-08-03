package com.example;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Application started.");
        for (int i = 0; i < 5; i++) {
            logger.info("Processing step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.severe("Sleep interrupted: " + e.getMessage());
            }
        }
        logger.info("Application finished.");
    }
}
