package BTVN.vehicle.truck;

import BTVN.vehicle.Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
    int truckload;

    public Truck() {
        super();
    }

    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload = truckload;
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
    }

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter truckload: ");
        setTruckload(sc.nextInt());
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Truck load: " + getTruckload());
    }
}
