public class Bankaccount {
    private double balance;
    public Bankaccount (double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return  balance;
    }
    public Bankaccount(){}
    public Bankaccount(Bankaccount another){
    }
    public  void deposit(double amount){
        this.balance +=amount;
        System.out.println("Deposited: "+ amount+ " to the Bank");
    }
    public  void withdraw(double amount){
        if(amount> this.balance){
            System.out.println("Insufficent Balance");
        }else{
            this.balance -=amount;
            System.out.println("Withdraw: "+ amount +" from the bank");
        }
    }
}
