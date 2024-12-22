public class ConstructionTest {
 public static void main(String[] args) {
     Employee[] staff = new Employee[3];

     staff[0] = new Employee("John Doe", 20000.00);
     staff[1] = new Employee(60000);
     staff[2] = new Employee();

     for(int i = 0; i < staff.length; i++) {
         Employee emp = staff[i];
         System.out.println("Name: " + emp.getName() + "\n"  + "Id: " + emp.getId() + "\n" + "Salary: " + emp.getSalary());
     }
 }
}
