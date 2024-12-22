package BTVN.vehicle;

import java.util.Scanner;

public class Vehicle implements IVehicle{
    String maker;
    String model;
    double price;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public Vehicle() {
    }

    @Override
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter maker: ");
        setMaker(input.nextLine());
        System.out.print("Enter model: ");
        setModel(input.nextLine());
        System.out.print("Enter price: ");
        setPrice(input.nextDouble());
        input.nextLine();
    }

    @Override
    public void display(){
        System.out.println("Maker: " + getMaker());
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
