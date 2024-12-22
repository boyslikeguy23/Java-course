package baithuchanh2;

public class InsuffientFundsException extends Exception{

    private double amount;

    @Override
    public void printStackTrace() {
        System.err.println("Insufficient Funds");
        super.printStackTrace();
    }

    public InsuffientFundsException(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}
