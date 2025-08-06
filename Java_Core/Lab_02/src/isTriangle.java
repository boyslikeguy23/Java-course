import java.util.Scanner;

public class isTriangle {

    public static void main(String[] args) {
        isTriangle triangle = new isTriangle();
        int a, b, c;
        // Kiểm tra các bộ ba cạnh khác nhau
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ba cạnh của tam giác:");
        System.out.print("Cạnh a: ");
        a = scanner.nextInt();
        System.out.print("Cạnh b: ");
        b = scanner.nextInt();
        System.out.print("Cạnh c: ");
        c = scanner.nextInt();
        triangle.checkTriangle(a, b, c);
        triangle.calculateArea(a, b, c);
        triangle.calculatePerimeter(a, b, c);
        scanner.close();

    }

    public void checkTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " có thể tạo thành một tam giác.");
        } else {
            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " không thể tạo thành một tam giác.");
        }
    }

    public void calculateArea(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            double s = (double)(a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Diện tích của tam giác là: " + area);
        } else {
            System.out.println("Không thể tính diện tích vì ba cạnh không tạo thành tam giác.");
        }
    }

    public void calculatePerimeter(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            int perimeter = a + b + c;
            System.out.println("Chu vi của tam giác là: " + perimeter);
        } else {
            System.out.println("Không thể tính chu vi vì ba cạnh không tạo thành tam giác.");
        }
    }
}
