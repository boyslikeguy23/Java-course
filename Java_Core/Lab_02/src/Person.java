import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double salary;
//    public Person(String name, String address, double salary) {
//        this.name = name;
//        this.address = address;
//        this.salary = salary;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Hàm nhập dữ liệu
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        name = sc.nextLine();
        System.out.println("Address : ");
        address = sc.nextLine();
        System.out.println("Salary : ");
        salary = sc.nextDouble();
    }
    //Hàm xem dữ liệu
    public void view() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}
