package Bankaccount;
import java.util.*;
public class BankManager {
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public BankAccount createAccount(String accountNo, String name) {
        if (!accounts.containsKey(accountNo)) {
            BankAccount acc = new BankAccount(accountNo, name);
            accounts.put(accountNo, acc);
            System.out.println("Account created successfully!");
            return acc;
        } else {
            System.out.println("Account number already exists.");
            return null;
        }
    }

    public BankAccount getAccount(String accountNo) {
        return accounts.get(accountNo);
    }
}
