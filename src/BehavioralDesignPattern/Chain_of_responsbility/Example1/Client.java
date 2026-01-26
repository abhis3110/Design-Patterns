package BehavioralDesignPattern.Chain_of_responsbility.Example1;

public class Client {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger(Logger.DEBUG);
        Logger fileLogger = new FileLogger(Logger.INFO);
        Logger emailLogger = new EmailLogger(Logger.ERROR);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);

        // Test logging at different levels
        System.out.println("Logging DEBUG message: ");
        consoleLogger.logMessage(Logger.DEBUG, "Debug message");

        System.out.println("\nLogging INFO message: ");
        consoleLogger.logMessage(Logger.INFO, "Info message");

        System.out.println("\nLogging ERROR message");
        consoleLogger.logMessage(Logger.ERROR, "Error message");
    }
}
