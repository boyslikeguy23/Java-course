import java.util.Scanner;

public class CustomerManager {
    Customer globalCus = new Customer(); //biến toàn cục
    void inputCustomer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // giải phóng kí tự \n
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // giải phóng kí tự \n
        System.out.print("Enter Customer Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Customer Salary: ");
        double salary = sc.nextDouble();

        globalCus.input(id, name, address, age, salary);
    }

    public static void main(String[] args)
    {
//        Customer nhanvien = new Customer();
//        nhanvien.input();
//        nhanvien.viewData();
//
//        CustomerManager cm = new CustomerManager();
//        cm.inputCustomer();

        Customer testCon = new Customer(3, "Shin Đông Hiếp", "Gầm cầu", 19, 3500000);
        testCon.viewData();
    }
}
