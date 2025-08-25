package BaiThucHanh05;

public class Lab03_Prac_03 {
    public static void drawTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5; // You can change this value to draw a larger or smaller triangle
        drawTriangle(n);
    }
}
