package logger;

public class LoggerDemo {

	public static void main(String[] args) {
		Logger logger = new DefaultLogger();
		logger.info("Hello world!");
		
		logger = new VerboseLogger();
		logger.info("Hello world!");
		
		logger = new TimeStampLogger();
		logger.info("Hello world!");
	}
}
