import java.util.Scanner;

public class Lab01_06 {
    public static void main(String[] args) {
        // Initialize variables
        int n1, m1;
        float n2, m2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n1: ");
        n1 = sc.nextInt();
        System.out.print("Enter number m1: ");
        m1 = sc.nextInt();
        System.out.print("Enter number n2: ");
        n2 = sc.nextFloat();
        System.out.print("Enter number m2: ");
        m2 = sc.nextFloat();
        //Calculating
        System.out.println("Sum of n1 and m1 is " + (n1+m1));
    }
}
