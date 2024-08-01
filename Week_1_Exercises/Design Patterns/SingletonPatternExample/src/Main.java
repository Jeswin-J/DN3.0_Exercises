public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLoggerInstance();
        Logger logger2 = Logger.getLoggerInstance();

        System.out.println();

        logger2.logMessage();
        logger1.logMessage();

        System.out.println("\nIs Singleton Pattern Implemented? ");
        System.out.println(logger1 == logger2);
    }
}
