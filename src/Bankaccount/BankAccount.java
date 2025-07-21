package Bankaccount;
public class BankAccount {
    private String accountNo;
    private String name;
    private double balance;
    private double fdAmount;


    public BankAccount(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0.0;
        this.fdAmount = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void createFD(double amount) {
        if (amount <= balance) {
            fdAmount += amount;
            balance -= amount;
            System.out.println("Fixed Deposit created successfully.");
        } else {
            System.out.println("Insufficient balance for FD.");
        }
    }

    public double getAvailableBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }
}
