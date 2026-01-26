package BehavioralDesignPattern.Chain_of_responsbility.Example1;

public class FileLogger extends Logger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("File Logger : " + message);
    }
}
