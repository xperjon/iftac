package logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampLogger implements Logger {

	@Override
	public void info(String message) {
		LocalDateTime now = LocalDateTime.now();
		String timestamp = DateTimeFormatter.ISO_DATE_TIME.format(now);
		System.out.println(timestamp + ": " + message);
	}

}
