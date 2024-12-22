package BTVN.vehicle.car;

import BTVN.vehicle.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter color: ");
        setColor(sc.nextLine());
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Color: " + getColor());
    }

    @Override
    public String toString() {
        return "Car{" +  getMaker() + ", " + getModel() + ", " + getPrice() +
                "color='" + color + '\'' +
                '}';
    }

    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String maker, String model, double price) {
        super(maker, model, price);
    }

    public Car() {
    }
}
