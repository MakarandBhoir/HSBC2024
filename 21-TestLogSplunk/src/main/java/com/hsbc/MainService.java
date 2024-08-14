package com.hsbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainService {
    private static final Logger logger = LogManager.getLogger(MainService.class);
    public long factorial(int num){
        logger.info("In factorial method value of num = {}",num);
        if(num < 0){
            throw new IllegalArgumentException("Number cant be negative");
        }
        long fact = 1;
        for (int i=1; i<=num; i++){
            logger.info("In for loop value of fact = {}",fact);
            fact = fact * i;
        }
        logger.info("Outside loop value of fact = {}", fact);
        return fact;
    }
}
