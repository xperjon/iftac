package logger;

public class VerboseLogger implements Logger {

	@Override
	public void info(String message) {
		System.out.println(message.toUpperCase());
	}

}
