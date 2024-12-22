package baithuchanh2;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount(101);
        System.out.println("Depositting $500...");
        check.deposit(500.00);
        try{
            System.out.println("Withdrawing $100...");
            check.withdraw(100);
            System.out.println("Withdrawing $600...");
            check.withdraw(600);
        } catch (InsuffientFundsException e) {
            e.printStackTrace();
        }
    }
}
