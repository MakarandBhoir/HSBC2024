package com.hsbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Main method start");
        MainService obj = new MainService();
        int number = 5;
        logger.info("Value of number = {} ", number);
        try {
            long result = obj.factorial(number);
            logger.info("Result is {}", result);
            System.out.println("Result = " + result);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            logger.error("Exception occurs {}", e);
        }
    }
}