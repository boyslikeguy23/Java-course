package baithuchanh4;

import java.util.Scanner;

public class BaiThucHanh04 {
    public static void main(String[] args) {
        try{
            String number = null;
            Scanner sc = new Scanner(System.in);
            String temp = null;
            if((temp = sc.nextLine()).isEmpty()){
                number = null;

            }else{
                number = temp;
            }
            System.out.println("temp = [" + temp + "]");
            float soThuc = Float.parseFloat(number);
            System.out.println("soThuc = [" + soThuc + "]");
            System.out.println("Phep chia = " + (10/(int)soThuc));
        }catch(NullPointerException | NumberFormatException e){
            System.out.println("Du lieu khong hop le");
        }catch(ArithmeticException e){
            System.out.println("Loi tinh toan");
        }catch(Exception e){
            System.out.println("Khong the thuc hien tinh toan, vui long bao quan tri vien!");
        }finally {
            System.out.println("Chuong trinh ket thuc");
        }

    }
}
