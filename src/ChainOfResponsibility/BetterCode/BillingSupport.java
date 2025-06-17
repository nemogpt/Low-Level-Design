package ChainOfResponsibility.BetterCode;

public class BillingSupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("billing")) {
            System.out.println("Handling billing support request.");
        } else {
            passToNext(requestType);
        }
    }
}
