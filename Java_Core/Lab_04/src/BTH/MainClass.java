package BTH;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Customer customer_01 = new Customer();
        Customer customer_02 = new Customer();
        MainClass mainClass = new MainClass();
        System.out.println("Nhan vien 1: ");
        mainClass.inputCustomerData(customer_01);
        System.out.println("Nhan vien 2: ");
        mainClass.inputCustomerData(customer_02);
        customer_01.viewData();
        customer_02.viewData();
        System.out.printf("Tien luong nhan vien 1: %.0f", customer_01.calSalary((int)15));
        System.out.printf("Tien luong nhan vien 2: %.0f", customer_01.calSalary((double)69000));

    }
    void inputCustomerData(Customer nv){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        nv.id = sc.nextInt();
        sc.nextLine(); //Giải phóng kí tu \n
        System.out.println("Name: ");
        nv.name = sc.nextLine();
        System.out.println("Address: ");
        nv.address = sc.nextLine();
        System.out.println("Age: ");
        nv.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Salary: ");
        nv.salary = sc.nextDouble();
    }
}
