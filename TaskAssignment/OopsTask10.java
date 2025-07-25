package TaskAssignment;

interface Logger {
        default void logInfo() {
        System.out.println("INFO: Default logInfo() from Logger interface");
    }

    static void logError() {
        System.out.println("ERROR: Static logError() from Logger interface");
    }
}
class AppLogger implements Logger {
    public void logInfo() {
        System.out.println("INFO: Custom logInfo() from AppLogger");
    }
}
public class OopsTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AppLogger logger = new AppLogger();
	        logger.logInfo();
	        Logger.logError();
	}

}
