import java.util.Scanner;

public class Lab03_02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, sum=0, a=0;
        System.out.println("Enter n: ");
        n = sc.nextInt();
        while (a<=n)
        {
            sum=sum+a;
            a=a+1;
        }
        System.out.println("The sum is: "+sum);
    }
}
