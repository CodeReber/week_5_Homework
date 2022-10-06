package Week_5_HW;

public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Error");
		
		spacedLogger.log("Hello2");
		spacedLogger.error("Error2");

	}

}
