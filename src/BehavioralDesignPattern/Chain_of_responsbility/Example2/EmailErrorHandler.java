package BehavioralDesignPattern.Chain_of_responsbility.Example2;

class EmailErrorHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleMessage(Message message) {
        if (message.text.contains("email")) {
            if (message.text.contains("fax")) {
                // Error message contains both-'email' and 'fax'
                System.out.println("-EmailErrorHandler fixed the email issue: " + message.text);
                System.out.println("--Now FaxErrorHandler needs to cross verify it.");
                if (nextHandler != null) {
                    nextHandler.handleMessage(message);
                }
            } else {
                // It's an email error only.
                System.out.println("EmailErrorHandler processed the issue: "+ message.text);
            }
        } else {
            // Neither a fax issue nor an email issue ??
            if (nextHandler != null) {
                nextHandler.handleMessage(message);
            }
        }
    }

    @Override
    public void nextErrorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}


