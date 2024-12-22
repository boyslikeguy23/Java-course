package BTVN.vehicle.test;

import BTVN.vehicle.Vehicle;
import BTVN.vehicle.car.Car;
import BTVN.vehicle.truck.Truck;

import java.util.*;

public class Test {
    List<Vehicle> vehicles = new ArrayList<Vehicle>();
    ArrayList<Car> car = new ArrayList<>();
    ArrayList<Truck> truck = new ArrayList<>();
    public void Menu(){
        System.out.println("Welcome to Vehicle shop!");
        int choice = 0;
        do{
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort by price");
            System.out.println("4. Search by model");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the model: ");
                    for (int i = 0; i < 3; i++){
                        Car car_input = new Car();
                        System.out.printf("Car %d: ", i+1);
                        car_input.input();
                        car.add(car_input);
                    }
                    for (int i = 0; i < 3; i++){
                        Truck truck_input = new Truck();
                        System.out.printf("Truck %d: ", i+1);
                        truck_input.input();
                        truck.add(truck_input);
                    }
                    break;
                case 2:
                    for (Car car_out:car){
                        car_out.display();

                    }
                    for (Truck truck_out:truck){
                        truck_out.display();
                    }
                    break;
                case 3:
                    System.out.println("Before sorting:");
                    for (Car car_input : car) {
                        car_input.display();
                    }
                    for (Truck truck_input : truck) {
                        truck_input.display();
                    }
                    // Sorting
                    Collections.sort(car, Comparator.comparingDouble(Vehicle::getPrice));
                    Collections.sort(truck, Comparator.comparingDouble(Vehicle::getPrice));
                    System.out.println("After sorting:");
                    for (Car car_out : car) {
                        car_out.display();
                    }
                    for (Truck truck_out : truck) {
                        truck_out.display();
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter the model that you want to search: ");
                    String model = sc.nextLine();
                    boolean found = false;

                    for (Car car_input : car) {
                        if(car_input.getModel().equals(model)){
                            car_input.display();
                            found = true;
                        }
                    }
                    for (Truck truck_input : truck) {
                        if(truck_input.getModel().equals(model)){
                            truck_input.display();
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Model not found");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }

        }while(choice != 5);
    }
    public static void main(String[] args) {

        new Test().Menu();
    }
}
