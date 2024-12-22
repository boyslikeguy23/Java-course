import java.util.Scanner;

public class Lab03_04 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // isPrime
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                break;
            }else {
                System.out.println(n + " is a prime number");
                break;
            }

        }
    }
}
