import java.util.Scanner;

public class Lab03_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int length = scanner.nextInt();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = scanner.nextInt();

        // Vẽ hình chữ nhật rỗng
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == width || j == 1 || j == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }

        scanner.close();
    }
}
