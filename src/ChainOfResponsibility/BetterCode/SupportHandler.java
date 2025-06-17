package ChainOfResponsibility.BetterCode;

abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String requestType);

    protected void passToNext(String requestType) {
        if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        } else {
            System.out.println("No handler available for: " + requestType);
        }
    }

}
