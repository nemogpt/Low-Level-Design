package ChainOfResponsibility.BetterCode;
/*
* Here we use Chain of Responsibility pattern to handle different types of support requests.
* Its a behavioural design pattern that transforms particular behaviour into standalone objects called handlers.
* Each handler can process a request or pass it to the next handler in the chain.
* chain will be defined at client side and let client handle which handler to use.
* */

public class SupportService {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler generalSupport = new GeneralSupport();
        SupportHandler billingSupport = new BillingSupport();

        // Set up the chain of responsibility
        generalSupport.setNextHandler(billingSupport);

        // Test the chain with different request types
        generalSupport.handleRequest("general");
        generalSupport.handleRequest("billing");
        generalSupport.handleRequest("technical");
    }

}


// When to use it: when client decides the chain of processing and
//  when you want to decouple the request handling from the actual processing logic.