package BTH;

import java.util.Scanner;

public class Customer {
    int id;
    String name;
    String address;
    int age;
    double salary;

    /**
     * Hàm sử dụng Scanner để nhập dữ liệu
     */
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter salary: ");
        salary = sc.nextDouble();
    }

    void input(int id, String name, String address, int age, double salary){
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Hàm in ra thông tin
     */
    void viewData(){
        System.out.println("Customer{" + "id = " + id + ", name = " + name + ", age = " + age + ", salary = " + salary + "}");
    }

    /**
     * Hàm tinh toán và trả về lương thực của nhân viên (thêm thưởng)
     * @param bonus: giá trị % thưởng thêm
     * @return
     */
    double calSalary(int bonus){
        return salary + salary * (float)(bonus/100);
    }

    /**
     * Hàm tính toán và trả về lương thực của nhân viên (thêm thưởng)
     * @param bonus: số tiền mặt thưởng
     * @return
     */
    double calSalary(double bonus){
        return salary + salary * bonus;
    }

    public Customer(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }
    public Customer(){}
}
