public class Logger {
    private static Logger loggerInstance;
    private static final String message = "Logging Success!";

    private Logger(){
    }

    public static Logger getLoggerInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public static void setLoggerInstance(Logger loggerInstance) {
        Logger.loggerInstance = loggerInstance;
    }

    public void logMessage(){
        System.out.println("LOG: " + Logger.message);
    }
}
