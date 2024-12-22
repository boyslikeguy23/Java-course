import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainClass {
    public static void main(String[] args) {
        //Initialize customer
        Customer cust_1 = new Customer();
        Customer cust_2 = new Customer();
        MainClass main = new MainClass();
        System.out.println("Nhập dữ liệu nhân viên 1: ");
        main.inputCustomerData(cust_1);
        System.out.println("Nhập dữ liệu nhân viên 2: ");
        main.inputCustomerData(cust_2);
        cust_1.viewData();
        cust_2.viewData();

        //Thưởng cho nhân viên 1 số tiền 15% lương cơ bản
        System.out.printf("Tiền lương nhân viên 1: %.0f", cust_1.calSalary(15));

        //Thưởng cho nhân viên 2 số tiền 690.000đ
        System.out.printf("Tiền lương nhân viên 2: %.0f", cust_1.calSalary(690000));

    }
    //Nhập dữ liệu nhân viên
    void inputCustomerData(Customer nv)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        nv.id = sc.nextInt();
        sc.nextLine(); //Giải phóng kí tự \n
        System.out.println("Enter name: ");
        nv.name = sc.nextLine();
        System.out.println("Enter address: ");
        nv.address = sc.nextLine();
        System.out.println("Enter age: ");
        nv.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter salary: ");
        nv.salary = sc.nextDouble();
    }


}


