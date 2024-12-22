package maytinh.dell;

import maytinh.MayTinh;

import java.util.Scanner;

public class Dell extends MayTinh {
    private int warranty; // thoi gian bao hanh

    public Dell() {

    }

    public Dell(String code, String name, double price, int warranty) {
        super(code, name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        super.inputInfor();
        System.out.println("Enter warranty period: ");
        this.warranty = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void displayInfor(){
        super.displayInfor();
        System.out.println("Warranty period: " + this.warranty);
    }
}
