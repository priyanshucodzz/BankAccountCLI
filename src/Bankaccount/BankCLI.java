package Bankaccount;

import java.util.Scanner;

public class BankCLI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankManager manager = new BankManager();

        while (true) {
            System.out.println("\nWelcome to SimpleBank CLI");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Create Fixed Deposit");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
          //  scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    manager.createAccount(accNo, name);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextLine();
                    BankAccount acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        double amount = scanner.nextDouble();
                        acc.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextLine();
                    acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        double amount = scanner.nextDouble();
                        acc.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextLine();
                    acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.println("Available Balance: ₹" + acc.getAvailableBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextLine();
                    acc = manager.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter FD Amount: ");
                        double amount = scanner.nextDouble();
                        acc.createFD(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using SimpleBank CLI!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}

