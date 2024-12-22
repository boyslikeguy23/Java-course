import java.util.Scanner;

public class Lab06_01 {
    public static void main(String[] args) {
        String[] arrSinhVien = new String[3];

        for (int i = 0; i < arrSinhVien.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Nhap sinh vien %d: ", i + 1);
            arrSinhVien[i] = input.nextLine();
        }
        for (String sinhVien : arrSinhVien) {
            System.out.println(sinhVien);
        }
    }
}
