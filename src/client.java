public class client {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Bankaccount bc =new Bankaccount(1000);
        bc.getBalance();
        bc.deposit(100);
        bc.withdraw(50);
        double bal = bc.getBalance();
        System.out.println("Total Amount: "+bal);
    }
}
