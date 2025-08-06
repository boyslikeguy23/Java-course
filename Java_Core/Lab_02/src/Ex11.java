import java.util.Scanner;

public class Ex11 {
    double x, y;
    char operator;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương x: ");
        x = sc.nextInt();
        System.out.println("Nhập số nguyên dương y: ");
        y = sc.nextInt();
        System.out.println("Nhập phép toán (+, -, *, /): ");
        operator = sc.next().charAt(0);
    }
    public void printResult() {
        switch (operator) {
            case '+':
                System.out.println("Kết quả: " + (x + y));
                break;
            case '-':
                System.out.println("Kết quả: " + (x - y));
                break;
            case '*':
                System.out.println("Kết quả: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Kết quả: " + (x / y));
                } else throw new ArithmeticException("Không thể chia cho 0!");
                break;
            default:
                System.out.println("Phép toán không hợp lệ! Vui lòng nhập +, -, * hoặc /.");
        }
    }
    public static void main(String[] args) {
        Ex11 calculator = new Ex11();
        calculator.input();
        calculator.printResult();
    }
}
