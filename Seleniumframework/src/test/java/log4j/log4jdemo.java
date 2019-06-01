package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {

	public static void main(String[] args) {
		
		System.out.println("Welcome to log4j");
		
		Logger logger=LogManager.getLogger(log4jdemo.class);
		logger.info("This is info");
		logger.error("This is error");
		logger.warn("This is warn");
		logger.fatal("This is fatal");
		
		System.out.println("Logging completed");

	}

}