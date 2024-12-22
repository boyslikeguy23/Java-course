package baithuchanh2;

public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount(int number) {
        this.number = number;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws
    InsuffientFundsException{
        if(amount<=balance){
            balance -= amount;
        } else{
            double needs = amount - balance;
            throw new InsuffientFundsException(needs);
        }
    }
    public double getBalance() {
        return balance;

    }
    public int getNumber() {
        return number;
    }
}
