import java.util.Scanner;

public class TinhSoGioLam_Ex13 {
    public double inputLaborHours(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số giờ làm việc trong tháng: ");
        double laborHours = sc.nextDouble();
        return laborHours;
    }
    public double inputHourlyWage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương theo giờ: ");
        double hourlyWage = sc.nextDouble();
        return hourlyWage;
    }
    public void calculateSalary(double laborHours, double hourlyWage) {
        double salary;
        if (laborHours <= 40) {
            salary = laborHours * hourlyWage;
        } else {
            double overtimeHours = laborHours - 40;
            salary = (40 * hourlyWage) + (overtimeHours * hourlyWage * 1.5);
        }
        System.out.println("Lương tháng của bạn là: " + salary);
    }
    public static void main(String[] args) {
        TinhSoGioLam_Ex13 salaryCalculator = new TinhSoGioLam_Ex13();
        double laborHours = salaryCalculator.inputLaborHours();
        double hourlyWage = salaryCalculator.inputHourlyWage();
        salaryCalculator.calculateSalary(laborHours, hourlyWage);
    }
}
