package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	protected static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		logger.info("info message");
		logger.debug("debug message");
		logger.warn("warn message");
		logger.error("error message");
		System.out.println("End of program.");
	}
}
