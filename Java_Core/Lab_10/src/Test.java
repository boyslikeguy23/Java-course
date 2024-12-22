import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LuxuryCar> carList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Input a list of LuxuryCar");
            System.out.println("2. Display the information of this list");
            System.out.println("3. Sort list descending by rootPrice and display");
            System.out.println("4. Search information by input car name");
            System.out.println("5. Display totalPrice of all cars which transportCost is $20,000");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    inputLuxuryCarList(carList, scanner);
                    break;
                case 2:
                    displayLuxuryCarList(carList);
                    break;
                case 3:
                    sortAndDisplayByRootPrice(carList);
                    break;
                case 4:
                    searchCarByName(carList, scanner);
                    break;
                case 5:
                    displayTotalPriceByTransportCost(carList, 20000);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }

    // 1. Input a list of LuxuryCar
    public static void inputLuxuryCarList(ArrayList<LuxuryCar> carList, Scanner scanner) {
        System.out.print("Enter the number of cars: ");
        int numCars = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numCars; i++) {
            LuxuryCar car = new LuxuryCar();

            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Name: ");
            car.setName(scanner.nextLine());

            System.out.print("Producer: ");
            car.setProducer(scanner.nextLine());

            System.out.print("Year: ");
            car.setYear(scanner.nextInt());

            System.out.print("Seat: ");
            car.setSeat(scanner.nextInt());

            System.out.print("Root Price: ");
            car.setRootPrice(scanner.nextFloat());

            System.out.print("Special Rate: ");
            car.setSpecialRate(scanner.nextFloat());

            scanner.nextLine();  // Consume newline

            carList.add(car);
        }
    }

    // 2. Display the information of this list
    public static void displayLuxuryCarList(ArrayList<LuxuryCar> carList) {
        if (carList.isEmpty()) {
            System.out.println("The car list is empty.");
        } else {
            System.out.println("Luxury Car List:");
            for (LuxuryCar car : carList) {
                car.getInfor();
            }
        }
    }

    // 3. Sort list descending by rootPrice and display
    public static void sortAndDisplayByRootPrice(ArrayList<LuxuryCar> carList) {
        if (carList.isEmpty()) {
            System.out.println("The car list is empty.");
        } else {
            Collections.sort(carList, new Comparator<LuxuryCar>() {
                @Override
                public int compare(LuxuryCar car1, LuxuryCar car2) {
                    return Float.compare(car2.getRootPrice(), car1.getRootPrice());
                }
            });
            System.out.println("Cars sorted by root price in descending order:");
            displayLuxuryCarList(carList);
        }
    }

    // 4. Search information by input car name
    public static void searchCarByName(ArrayList<LuxuryCar> carList, Scanner scanner) {
        if (carList.isEmpty()) {
            System.out.println("The car list is empty.");
        } else {
            System.out.print("Enter the name of the car to search: ");
            String searchName = scanner.nextLine();
            boolean found = false;

            for (LuxuryCar car : carList) {
                if (car.getName().equalsIgnoreCase(searchName)) {
                    System.out.println("Car found:");
                    car.getInfor();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Car with name " + searchName + " not found.");
            }
        }
    }

    // 5. Display totalPrice of all cars which transportCost is $20,000
    public static void displayTotalPriceByTransportCost(ArrayList<LuxuryCar> carList, float transportCost) {
        if (carList.isEmpty()) {
            System.out.println("The car list is empty.");
        } else {
            float totalPrice = 0;

            for (LuxuryCar car : carList) {
                if (car.calculatePrice(transportCost) == car.getRootPrice() + car.calculateTax() + transportCost) {
                    totalPrice += car.calculatePrice(transportCost);
                }
            }

            System.out.println("Total price of cars with transport cost of $" + transportCost + " is: " + totalPrice);
        }
    }
}
