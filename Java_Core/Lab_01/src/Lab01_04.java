import java.util.Scanner;

public class Lab01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double f = sc.nextDouble();
        sc.nextLine();
        String text = sc.nextLine();
        System.out.printf("%d\n%.2f\n"+text, n, f);
    }
}
