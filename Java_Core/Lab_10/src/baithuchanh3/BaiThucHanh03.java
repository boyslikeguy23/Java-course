package baithuchanh3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiThucHanh03 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int soA = sc.nextInt();
            int soB = sc.nextInt();
            try{
                System.out.println("Phep chia = " + (soA/soB));
            }catch(ArithmeticException e){
                System.out.println("Loi tinh toan - " + e.toString());
            }
        }catch (InputMismatchException ime){
            System.out.println("Du lieu nhap khong hop le - " + ime.toString());
        }finally {
            System.out.println("Du lieu an toan");
        }

    }
}
