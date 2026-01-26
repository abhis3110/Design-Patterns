package BehavioralDesignPattern.Chain_of_responsbility.Example1;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Console Logger : " + message);
    }
}
