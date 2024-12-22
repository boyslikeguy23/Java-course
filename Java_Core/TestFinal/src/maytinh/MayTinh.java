package maytinh;

import java.util.Scanner;

public class MayTinh implements IMayTinh{
    private String code; // Ma may
    private String name; // Ten may
    private double price; // Gia

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MayTinh() {
    }

    public MayTinh(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code : ");
        this.code = sc.nextLine();
        System.out.println("Enter name : ");
        this.name = sc.nextLine();
        System.out.println("Enter price : ");
        this.price = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void displayInfor(){
        System.out.println("Code : |" + this.code + " Name : |" + this.name + " Price : " + this.price);
    }

    @Override
    public void changeInfor(){}
}
