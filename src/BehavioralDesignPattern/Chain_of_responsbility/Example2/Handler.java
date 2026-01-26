package BehavioralDesignPattern.Chain_of_responsbility.Example2;

public interface Handler {
    void handleMessage(Message message);
    void nextErrorHandler(Handler nextHandler);
}
