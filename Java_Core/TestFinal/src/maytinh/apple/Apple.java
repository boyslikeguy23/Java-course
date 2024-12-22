package maytinh.apple;

import maytinh.MayTinh;

import java.util.Scanner;

public class Apple extends MayTinh {
    private int warranty;
    public Apple() {}

    public Apple(String code, String name, double price, int warranty) {
        super(code, name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

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
