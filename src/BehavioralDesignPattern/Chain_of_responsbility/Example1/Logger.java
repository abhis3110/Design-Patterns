package BehavioralDesignPattern.Chain_of_responsbility.Example1;

public abstract class Logger {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;

    protected int level;
    protected Logger nextLogger;

    public Logger(int level) {
        this.level = level;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if(this.level <= level) {
            write(message);
        }

        if(nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
