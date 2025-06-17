package ChainOfResponsibility.BetterCode;

public class GeneralSupport extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("general")) {
            System.out.println("Handling general support request.");
        } else {
            passToNext(requestType);
        }
    }
}
