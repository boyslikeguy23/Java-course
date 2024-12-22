import java.util.Scanner;

public class Lab03_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều cao của tam giác
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();

        // Vẽ tam giác cân rỗng
        for (int i = 1; i <= height; i++) {
            // In khoảng trắng
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }

            // In dấu * và khoảng trống
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Xuống dòng
            System.out.println();
        }

        scanner.close();
    }
}
