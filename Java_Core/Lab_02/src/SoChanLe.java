
import java.util.Scanner;
public class SoChanLe {

    int n;

    public static void main(String[] args) {
        SoChanLe soChanLe = new SoChanLe();
        soChanLe.input();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Số " + n + " là số chẵn.");
        } else {
            System.out.println("Số " + n + " là số lẻ.");
        }
    }
}
