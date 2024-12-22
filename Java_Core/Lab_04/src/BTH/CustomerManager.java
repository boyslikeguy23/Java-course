package BTH;

import java.util.Scanner;

public class CustomerManager {
    Customer globalCus =  new Customer();
    public static void main(String[] args) {
        Customer nv =  new Customer();
        nv.input();
        nv.viewData();

        CustomerManager manager = new CustomerManager();
        manager.inputCustomer();
    }

    void inputCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Address: ");
        String address = sc.nextLine();
        System.out.println("Enter Customer Salary: ");
        double salary = sc.nextDouble();
        globalCus.input(id, name, address, age, salary);
    }
}
