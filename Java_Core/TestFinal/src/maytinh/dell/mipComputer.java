package maytinh.dell;

import maytinh.apple.Apple;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class mipComputer {

    public static void main(String[] args) {
        ArrayList<Dell> dellList = new ArrayList<>();
        ArrayList<Apple> appleList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Nhập thông tin cho 3 Dell và 3 Apple
                    for (int i = 0; i < 3; i++) {
                        Dell dell = new Dell();
                        System.out.println("Enter information for Dell " + (i + 1));
                        dell.inputInfor();
                        dellList.add(dell);
                    }

                    for (int i = 0; i < 3; i++) {
                        Apple apple = new Apple();
                        System.out.println("Enter information for Apple " + (i + 1));
                        apple.inputInfor();
                        appleList.add(apple);
                    }
                    break;

                case 2: // Hiển thị thông tin
                    System.out.println("Dell computers:");
                    for (Dell dell : dellList) {
                        dell.displayInfor();
                    }

                    System.out.println("\nApple computers:");
                    for (Apple apple : appleList) {
                        apple.displayInfor();
                    }
                    break;

                case 3: // Sắp xếp theo thời gian bảo hành
                    Collections.sort(dellList, Comparator.comparingInt(Dell::getWarranty));
                    Collections.sort(appleList, Comparator.comparingInt(Apple::getWarranty));

                    System.out.println("Sorted Dell computers:");
                    for (Dell dell : dellList) {
                        dell.displayInfor();
                    }

                    System.out.println("\nSorted Apple computers:");
                    for (Apple apple : appleList) {
                        apple.displayInfor();
                    }
                    break;

                case 4: // Tìm kiếm những máy tính có tên là "apple"
                    System.out.println("Apple computers:");
                    for (Apple apple : appleList) {
                        if (apple.getName().equalsIgnoreCase("apple")) {
                            apple.displayInfor();
                        }
                    }
                    break;

                case 5: // Thoát
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 5);
    }
}
