package com.devops.helloProject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloMain {
    static final Logger logger = Logger.getLogger(HelloMain.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        if (args.length == 0) {
            logger.info("No name provided.");
        } else {
            logger.info("Hello, " + args[0] + "!");
        }
    }
}
