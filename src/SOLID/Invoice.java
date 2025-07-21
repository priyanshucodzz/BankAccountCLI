package SOLID;

public class Invoice {
    private String customer;
    private double amount;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public double calculateDiscount() {
        if (amount > 1000) return amount * 0.1;
        return 0;
    }

    public void saveToFile() {
        System.out.println("Saving invoice to file...");
        // file saving logic
    }

    public void printInvoice() {
        System.out.println("Printing invoice for " + customer);
    }
}