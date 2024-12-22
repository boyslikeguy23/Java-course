import java.util.Scanner;

public class Customer {
    public int id;
    public String name;
    public String address;
    public int age;
    public double salary;

    /**
     * Constructor mặc định
     */
    public Customer(){}

    /**
     * Constructor có tham số đầu vào
     * @param id
     * @param name
     * @param address
     * @param age
     * @param salary
     */
    public Customer(int id, String name, String address, int age, double salary)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    /* Hàm sử dụng Scanner để yêu cầu nhập dữ liệu */
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter address : ");
        address = sc.nextLine();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter salary : ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    public void input(int id, String name, String address, int age, double salary)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    /** Hàm in ra thông tin của nhân viên **/
    public void viewData()
    {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }

    /**
     * Hàm tính toán và trả về lương thực của nhân viên (thêm thưởng)
     * @param bonus: giá trị % nhân viên
     * @return
     */
    public double calSalary(int bonus)
    {
        return salary + salary * (bonus/100);
    }

    /**
     *
     * @param bonus: số tiền mặt thưởng
     * @see: Lương thực lĩnh
     */
    public double calSalary(double bonus)
    {
        return salary + bonus;
    }


}
