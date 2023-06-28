package report;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logs {

	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void getLog(String msg) {
		logger.log(Level.INFO, msg);
	}
}
