package vietnam;

import thailand.ThaiLandImportPrice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GeneralManager {
    private ArrayList<VietNamImportPrice> vietnamProducts;
    private ArrayList<ThaiLandImportPrice> ThaiLandProducts;

    public GeneralManager() {
        vietnamProducts = new ArrayList<>();
        ThaiLandProducts = new ArrayList<>();
    }

    // 1. Input information for products imported into VietNam
    public void inputVietNamProducts(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for VietNam Product " + (i + 1) + ": ");
            VietNamImportPrice product = new VietNamImportPrice();
            product.input();
            vietnamProducts.add(product);
        }
    }

    // 2. Input information for products imported into ThaiLand
    public void inputThaiLandProducts(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for ThaiLand Product " + (i + 1) + ": ");
            ThaiLandImportPrice product = new ThaiLandImportPrice();
            product.input();
            ThaiLandProducts.add(product);
        }
    }

    // 4. Display all products imported in VietNam and ThaiLand
    public void displayAllProducts() {
        // Sort by product name ascending
        Collections.sort(vietnamProducts, Comparator.comparing(VietNamImportPrice::getProdName));
        Collections.sort(ThaiLandProducts, Comparator.comparing(ThaiLandImportPrice::getProdName));

        System.out.println("Products imported in VietNam:");
        for (VietNamImportPrice product : vietnamProducts) {
            product.display();
        }

        System.out.println("Products imported in ThaiLand:");
        for (ThaiLandImportPrice product : ThaiLandProducts) {
            product.display();
        }
    }

    // 5. Calculate and display product prices in VietNam and ThaiLand
    public void displaySalePrices() {
        System.out.println("Sale prices for products imported in VietNam:");
        for (VietNamImportPrice product : vietnamProducts) {
            System.out.println(product.getProdName() + " Sale Price: " + product.calculateSalePrice());
        }

        System.out.println("Sale prices for products imported in ThaiLand:");
        for (ThaiLandImportPrice product : ThaiLandProducts) {
            System.out.println(product.getProdName() + " Sale Price: " + product.calculateSalePrice());
        }
    }

    // 6. Search products by sale price
    public void searchBySalePrice(float price) {
        System.out.println("Searching for products with sale price: " + price);

        boolean found = false;
        for (VietNamImportPrice product : vietnamProducts) {
            if (product.calculateSalePrice() == price) {
                System.out.println("Found in VietNam Products:");
                product.display();
                found = true;
            }
        }

        for (ThaiLandImportPrice product : ThaiLandProducts) {
            if (product.calculateSalePrice() == price) {
                System.out.println("Found in ThaiLand Products:");
                product.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found with the sale price: " + price);
        }
    }

    // Menu method to run the application
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input information for n products imported into VietNam");
            System.out.println("2. Input information for n products imported into ThaiLand");
            System.out.println("4. Display all products in VietNam and ThaiLand");
            System.out.println("5. Calculate and display sale prices for products");
            System.out.println("6. Search for product by sale price");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of VietNam products: ");
                    int vnCount = sc.nextInt();
                    inputVietNamProducts(vnCount);
                    break;
                case 2:
                    System.out.print("Enter number of ThaiLand products: ");
                    int thCount = sc.nextInt();
                    inputThaiLandProducts(thCount);
                    break;
                case 4:
                    displayAllProducts();
                    break;
                case 5:
                    displaySalePrices();
                    break;
                case 6:
                    System.out.print("Enter sale price to search: ");
                    float price = sc.nextFloat();
                    searchBySalePrice(price);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    public static void main(String[] args) {
        GeneralManager gm = new GeneralManager();
        gm.menu();
    }
}
