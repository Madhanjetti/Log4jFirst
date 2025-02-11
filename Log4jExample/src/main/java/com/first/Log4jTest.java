package com.first;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4jTest {
	private static final Logger Logger=LogManager.getLogger(Log4jTest.class);
	public static void main(String[] args) {
		process();
	}
	public static void process() {
		Logger.trace("From the Trace Method");
		Logger.debug("From the debug Method");
		Logger.info("From info method");
		Logger.warn("From the warn method");
		Logger.error("From the error method");
		Logger.fatal("From the fatal method");
		
		
	}
}
