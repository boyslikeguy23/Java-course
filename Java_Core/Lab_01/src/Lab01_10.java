import java.util.Scanner;
public class Lab01_10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập các hệ số a, b và c
            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập hệ số c: ");
            double c = scanner.nextDouble();

            // Kiểm tra giá trị của a
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("Phương trình có vô số nghiệm.");
                    } else {
                        System.out.println("Phương trình vô nghiệm.");
                    }
                } else {
                    double x = -c / b;
                    System.out.println("Phương trình trở thành phương trình bậc nhất với nghiệm x = " + x);
                }
            } else {
                // Tính delta
                double delta = b * b - 4 * a * c;

                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Phương trình có hai nghiệm phân biệt:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Phương trình có nghiệm kép: x = " + x);
                } else {
                    System.out.println("Phương trình vô nghiệm thực.");
                }
            }

            scanner.close();
        }
}
