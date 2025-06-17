package ChainOfResponsibility.ProblematicCode;
/*
 * In a customer support for an ecommerce application like amazon, users can raise tickets.
 * The tickets can be of different types like product issue, payment issue, delivery issue etc.
 * */

public class SupportService {
    public void handleRequests(String request) {
        if (request.equals("product issue")) {
            System.out.println("Handling product issue");
        } else if (request.equals("payment issue")) {
            System.out.println("Handling payment issue");
        } else if (request.equals("delivery issue")) {
            System.out.println("Handling delivery issue");
        } else {
            System.out.println("Unknown request type");
        }
    }
}

/*
* Voilates Single Responsibility Principle (SRP) and Open/Closed Principle (OCP).
* Each time a new request type is added, the code needs to be modified.
* All logic is in a single class, making it hard to maintain and extend.
* not flexible and scalable: cannot change the order of handling requests or add new request types without modifying the existing code.
* */
