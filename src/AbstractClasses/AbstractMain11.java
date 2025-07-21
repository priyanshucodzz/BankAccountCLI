package AbstractClasses;

abstract class PaymentMethod {
    protected String methodName;

    public PaymentMethod(String methodName) {
        this.methodName = methodName;
    }


    public abstract void processPayment(double amount);

    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Universal Payment Portal!");
    }

    public void transactionSummary(double amount) {
        System.out.println("Payment Method: " + methodName);
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Transaction Completed.\n");
    }
}

class CreditCard extends PaymentMethod {

    public CreditCard() {
        super("Credit Card");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
        // Simulate processing...
        transactionSummary(amount);
    }
}

class UPIPayment extends PaymentMethod {

    public UPIPayment() {
        super("UPI Payment");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
        // Simulate processing...
        transactionSummary(amount);
    }
}


public class AbstractMain11 {
    public static void main(String[] args) {
        // Static method call
        PaymentMethod.printWelcomeMessage();

        // Polymorphic behavior
        PaymentMethod payment1 = new CreditCard();
        PaymentMethod payment2 = new UPIPayment();

        // Method overriding
        payment1.processPayment(1500.75);
        payment2.processPayment(800.50);
    }

}

