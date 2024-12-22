package BTH1_ITinhToan;

import java.util.Scanner;

public class MainClass {
    private class NhapLieu{
        public String inputString(){
            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }
        public int inputInt(){
            Scanner input = new Scanner(System.in);
            do{
                try{
                    int number = Integer.parseInt(input.nextLine());
                    return number;
                }catch(Exception e){
                    System.out.println("Vui long nhap so nguyen!");
                }
            }while(true);
        }
        public float inputFloat(){
            Scanner input = new Scanner(System.in);
            do{
                try{
                    float number = Float.parseFloat(input.nextLine());
                    return number;
                }catch(Exception e){
                    System.out.println("Vui long nhap so thuc!");
                }
            }while(true);
        }
    }
    public void nhapDuLieu(){
        NhapLieu nhap = new NhapLieu();

        System.out.println("Nhap Du Lieu");
        System.out.println("Value = " + nhap.inputInt());

        System.out.println("Nhap so thuc");
        System.out.println("Value = " + nhap.inputFloat());

        System.out.println("Nhap so chuoi");
        System.out.println("Value = " + nhap.inputString());
    }
    public void phepTinh(ITinhToan phepTinh, float num1, float num2){
        phepTinh.doOperation(num1, num2);
    }
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.nhapDuLieu();

    }
}
