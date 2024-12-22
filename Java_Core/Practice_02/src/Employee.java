import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Employee {
    private String name = "";
    private double salary;
    private int id;
    private static int nextId;

    //three overloaded constructors
    public Employee(String n, double s) {
        name = n;
        salary = s;

    }
    public  Employee(double s) {
        //call the Employee(String, double) constructor
        this("Employee #"+nextId++, s);
    }
    //the default Contructor
    public Employee()
    {
        //name initialized to "" below
        //salary not explicitly set--initialized to 0
        //id initialized in initialization block
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    //object initialization block
    {
        id = nextId++;
        nextId++;
    }
    //static initialization block
    static
    {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }
}
