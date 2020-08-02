package Log;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4J {
	private static Logger logger = LogManager.getLogger(log4J.class);

	public static void main(String[] args) {
		System.out.println("Just for test purposes.");
		logger.info("This is information message.");
		logger.error("This is an error message.");
		logger.warn("This is a warning message.");

		System.out.println("\nCompleted.");
	}
}