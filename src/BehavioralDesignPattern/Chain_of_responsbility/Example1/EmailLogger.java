package BehavioralDesignPattern.Chain_of_responsbility.Example1;

public class EmailLogger extends Logger {

    public EmailLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("File Logger : " + message);
    }
}

