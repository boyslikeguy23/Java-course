import java.util.Scanner;

public class Lab03_03 {
    public static void main(String[] args)
    {
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        a = sc.nextInt();
        int temp_a = a;
        System.out.print("Enter integer b: ");
        b = sc.nextInt();
        int temp_b = b;
        //using euclid
//        if(a == 0  || b == 0){
//            System.out.println(a>b?a:b);
//        }
        while(temp_b != 0)
        {
            temp = temp_b;
            temp_b = temp_a % temp_b;
            temp_a = temp;
        }
        int gcd =temp_a;
        int lcm = (a*b)/gcd;

        System.out.println("\n GCD =  " + gcd);
        System.out.println("\n LCM is: " + lcm);
    }
}
